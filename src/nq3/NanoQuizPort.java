package nq3;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.MouseEvent;

public class NanoQuizPort extends GraphicsProgram {
    // PongGo CONSTANTS
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;
    private static final int NBRICKS_PER_ROW = 10;
    private static final int NBRICKS_PER_COL = 10;
    private static final double BRICK_GAP = 4;
    private static final double BRICK_WIDTH = Math.floor(
            (CANVAS_WIDTH - (NBRICKS_PER_ROW + 1.0) * BRICK_GAP) / NBRICKS_PER_ROW);
    private static final double BRICK_HEIGHT = 12;
    private static final double BRICK_Y_OFFSET = 60; // from top
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30; // from bottom
    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 3.0;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;
    private static final int BALL_DELAY = 1000 / 60;
    // PongGo class variables: main actors in the app
    private GRect paddle;
    private GRect paddle2;
    private GOval ball;
    // Ball velocity
    private double dx;
    private double dy;
    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();
    @Override
    public void run() {

        setTitle("LBYCPEI PongGo");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        /* You fill this in */

        generatePaddle();
        generatePaddle2();
        generateBall();

        ballVelocity();
        while (true) {
            ballMovement();
        }

    }
    /* You fill this in with methods*/

    private void generatePaddle() {
        double x = (CANVAS_WIDTH - PADDLE_WIDTH) / 2;
        paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle.setLocation(x, getHeight() - PADDLE_Y_OFFSET);
        paddle.setFilled(true);
        paddle.setFillColor(Color.black);
        add(paddle);
        addMouseListeners();
    }

    private void generatePaddle2() {
        double x = (CANVAS_WIDTH - PADDLE_WIDTH) / 2;
        paddle2 = new GRect(x, PADDLE_Y_OFFSET,PADDLE_WIDTH, PADDLE_HEIGHT);
        add(paddle2);
    }

    private void generateBall() {
        double ballInitXPos = (getWidth()-BALL_RADIUS)/2;
        double ballInitYPos = getHeight()-(PADDLE_Y_OFFSET+BALL_RADIUS);
        ball = new GOval(ballInitXPos, ballInitYPos, BALL_RADIUS, BALL_RADIUS);
        ball.setFilled(true);
        add(ball);
    }

    public void mouseMoved(MouseEvent e) {
        double xPos = e.getX();
        paddle.setLocation(xPos - (PADDLE_WIDTH/2), getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);
    }

    private void ballVelocity() {
        dy = -4.0;
        dx = rgen.nextDouble(1.0, 3.0);
        if (rgen.nextBoolean(0.5)) {
            dx = -dx;
        }
    }

    private void ballMovement() {
        paddle2.setLocation(ball.getX()-BALL_RADIUS * 2, PADDLE_Y_OFFSET);
        ball.move(dx, dy);

        if (ball.getX() <= 0 || ball.getX() >= (CANVAS_WIDTH-(BALL_RADIUS*2))) {
            dx = -dx;
        }

        if (ball.getY() <= 0) {
            dy = -dy;
        }

        GObject bump = ballBump();
        if (bump == paddle) {
            dy = -dy;
        }

        else if (bump == paddle2) {
            dy = -dy;
        }

        else if (bump != null) {
            remove(bump);
            dy = -dy;
        }

        pause (BALL_DELAY);
    }


    private GObject ballBump() {

        if((getElementAt(ball.getX(), ball.getY())) != null) {

            return getElementAt(ball.getX(), ball.getY());

        }

        // no objects
        else{
            return null;
        }

    }

    public static void main(String[] args) {
        new NanoQuizPort().start(args);
    }
}