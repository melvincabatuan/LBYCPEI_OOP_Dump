package nq3;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;

public class NanoQuizChiu extends GraphicsProgram {
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30; // from bottom
    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 5.0;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;
    private static final int BALL_DELAY = 1000 / 60;
    // PongJob class variables: main actors in the app
    private GRect paddle;
    private GRect paddleComp;
    private GOval ball;
    // Ball velocity
    private double dx;
    private double dy;
    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public static void main(String[] args){
        (new NanoQuizChiu()).start(args);
    }

    public void run() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        paddleTile();
        ball();
        paddleTileComp();
        startGame();

    }

    private void startGame() {
        waitForClick();
        velocities();
        boolean x = true;
        while (x) {
            ballMove();
            paddleMove();
            if (ball.getY() >= getHeight() || ball.getY() <= 0) {
                remove(ball);
                remove(paddle);
                x = false;
            }
        }

    }

    private void paddleTile() {
        double ySet = CANVAS_HEIGHT - PADDLE_Y_OFFSET;
        paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle.setFilled(true);
        paddle.setFillColor(Color.BLACK);
        paddle.setColor(Color.BLACK);
        add(paddle, (CANVAS_WIDTH - PADDLE_WIDTH) / 2, ySet);
        addMouseListeners();
    }

    public void mouseMoved(MouseEvent mouse) {
        double ySet = CANVAS_HEIGHT - PADDLE_Y_OFFSET;
        double mouseX = mouse.getX();
        if (mouseX < getWidth() - PADDLE_WIDTH) {
            paddle.setLocation(mouseX, ySet);
        }
    }

    private void paddleTileComp() {
        double ySet = 0 + PADDLE_Y_OFFSET * 2;
        paddleComp = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
        paddleComp.setFilled(true);
        paddleComp.setFillColor(Color.BLACK);
        paddleComp.setColor(Color.BLACK);
        add(paddleComp, (CANVAS_WIDTH - PADDLE_WIDTH) / 2, ySet);

    }

    private void paddleMove()
    {
        paddleComp.setLocation(ball.getX(), PADDLE_Y_OFFSET*2);
        pause(BALL_DELAY);
    }

    private void ball() {
        ball = new GOval(BALL_RADIUS, BALL_RADIUS);
        ball.setFilled(true);
        add(ball, (getWidth() - ball.getWidth()) / 2, (getHeight() - ball.getHeight()) / 2);
    }

    private void velocities() {
        dx = rgen.nextDouble(VELOCITY_X_MIN, VELOCITY_X_MAX);
        dy = VELOCITY_Y;
        if (rgen.nextBoolean(0.5)) {
            dx = -dx;
        }
    }

    private void ballMove() {
        ball.move(dx, dy);

        if ((ball.getX() - dx <= 0 && dx < 0) || (ball.getX() + dx >= (getWidth() - BALL_RADIUS * 2) && dx > 0)) {
            dx = -dx;
        }

        GObject collider = getCollidingObject();
        if (paddle == collider) {
            dy = -dy;
        }
        if(paddleComp == collider)
            {
                    dy = -dy;
            }
        
        pause(BALL_DELAY);
    }

    private GObject getCollidingObject() {

        if (getElementAt(ball.getX(), ball.getY()) != null)
            return (getElementAt(ball.getX(), ball.getY()));
        else if (getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY()) != null)
            return (getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY()));
        else if (getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS) != null)
            return (getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS));
        else if (getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS) != null)
            return (getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS));
        else
            return null;
    }
}
