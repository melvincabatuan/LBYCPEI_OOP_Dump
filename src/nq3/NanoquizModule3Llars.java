package nq3;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;

public class NanoquizModule3Llars extends GraphicsProgram {
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
    private static final int BALL_DELAY = 1000 / 100;
    // PongGo class variables: main actors in the app
    private GRect paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
    private GRect paddle2 = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
    private GOval ball = new GOval(BALL_RADIUS * 2, BALL_RADIUS * 2);
    // Ball velocity
    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private double dx = 2;
    private double dy = VELOCITY_Y;

    public void run() {
        setTitle("LBYCPEI PongGo");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        addMouseListeners();

        paddle.setFilled(true);
        paddle.setFillColor(Color.BLUE);

        ball.setFilled(true);
        ball.setFillColor(Color.BLACK);
        add(ball, (CANVAS_WIDTH / 2) - BALL_RADIUS, (CANVAS_HEIGHT / 2) - BALL_RADIUS);

        int win = 0;


        do {

            pause(BALL_DELAY);
            add(ball, ball.getX() + dx, ball.getY() + dy);

            paddle2.setFilled(true);
            paddle2.setFillColor(Color.RED);
            add(paddle2, ball.getX(), (0 + PADDLE_Y_OFFSET));


            if (ball.getY() == 0) {
                win = 1;
            } else if (ball.getX() + ball.getWidth() == CANVAS_WIDTH) {
                dx = (dx * -1);
            } else if (ball.getX() == 0) {
                dx = (dx * -1);
            } else if (ball.getY() == CANVAS_HEIGHT) {

                win = (-1);
            }

            GObject collider = getCollidingObject();
            if (collider == paddle) {
                dy = dy * -1;
            } else if ((collider == paddle2)) {
                dy = dy * -1;
            }

        } while (true);
    }

    /* You fill this in with methods*/
    /* Solves NoClassDefFoundError */


    public void mouseMoved(MouseEvent mouse) {
        // Get the x coordinate of the mouse
        double mouseX = mouse.getX();

        if (mouseX < CANVAS_WIDTH - PADDLE_WIDTH / 2 && mouseX > PADDLE_WIDTH / 2) {
            add(paddle, (mouseX - PADDLE_WIDTH / 2), (CANVAS_HEIGHT - (PADDLE_Y_OFFSET + paddle.getHeight())));
        }
    }


    private GObject getCollidingObject() {
        double x1 = ball.getX(), y1 = ball.getY();
        double x2 = ball.getX() + ball.getWidth(), y2 = ball.getY();
        double x3 = ball.getX(), y3 = ball.getY() + ball.getHeight();
        double x4 = ball.getX() + ball.getWidth(), y4 = ball.getY() + ball.getHeight();

        GObject detect1 = getElementAt(x1, y1);
        GObject detect2 = getElementAt(x2, y2);
        GObject detect3 = getElementAt(x3, y3);
        GObject detect4 = getElementAt(x4, y4);
        //paddle
        if (detect1 != null) {
            return detect1;
        } else if (detect2 != null) {
            return detect2;
        } else if (detect3 != null) {
            return detect3;
        } else if (detect4 != null) {
            return detect4;
        } else return null;

    }


    public static void main(String[] args) {
        new NanoquizModule3Llars().start(args);
    }
}
