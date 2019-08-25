package nq3;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

/* Doesnt work! */
public class PingPongDong extends GraphicsProgram {
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30;
    private static final double BALL_RADIUS = 12;
    private static final double BALL_HEIGHT = 10;
    private static final double VELOCITY_Y = 3.0;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;

    public void run() {
        setTitle("LBYCPEI PongJob");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        GRect paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
        add(paddle, CANVAS_WIDTH / 2 - PADDLE_WIDTH / 2, CANVAS_HEIGHT - PADDLE_Y_OFFSET);
        paddle.setFilled(true);
        paddle.setColor(Color.black);

        GOval ball = new GOval(BALL_RADIUS,BALL_HEIGHT);
        add(ball,CANVAS_WIDTH/2-BALL_RADIUS/2,CANVAS_HEIGHT/2-BALL_HEIGHT/2);
        ball.setFilled(true);
        ball.setColor(Color.green);
    }

    public void mouseMoved(MouseEvent mouse) {
        // Get the x coordinate of the mouse
        addMouseListeners();
        double mouseX = mouse.getX();


    }


    // /*  * You fill this in  */

    public static void main(String[] args) {
           new PingPongDong().start(args);
    }
}

