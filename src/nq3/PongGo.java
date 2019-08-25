package nq3;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.MouseEvent;
public class PongGo extends GraphicsProgram {

    private static final double CANVAS_WIDTH=640;
    private static final double CANVAS_HEIGHT=720;
    private static final int NBRICKS_PER_ROW=10;
    private static final int NBRICKS_PER_COL=10;
    private static final double BRICK_GAP=4;
    private static final double BRICK_WIDTH=Math.floor(CANVAS_WIDTH-(NBRICKS_PER_ROW+1.0)*BRICK_GAP)/NBRICKS_PER_ROW;
    private static final double BRICK_HEIGHT=12;
    private static final double BRICK_Y_OFFSET=60;
    private static final double PADDLE_WIDTH=80;
    private static final double PADDLE_HEIGHT=12;
    private static final double PADDLE_Y_OFFSET=30;
    private static final double BALL_RADIUS=12;
    private static final double VELOCITY_Y=3.0;
    private static final double VELOCITY_X_MIN=1.0;
    private static final double VELOCITY_X_MAX=3.0;
    private static final int BALL_DELAY=1000/60;

    private GRect paddle;
    private GOval ball;
    private double dx;
    private double dy;
    private RandomGenerator rgen = RandomGenerator.getInstance();

    /* Doesnt Work */
    public static void main (String [] args){
        (new PongGo()).start(args);
    }


    public void run(){
    setTitle("PingPongDong");
    setCanvasSize(CANVAS_WIDTH,CANVAS_HEIGHT);

    while(true){
        paddle();
    }

    }

    public void paddle(){
        paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle.setFilled(true);
        paddle.setFillColor(Color.BLACK);
        add(paddle,(getWidth()-paddle.getWidth())/2, getHeight()-PADDLE_Y_OFFSET);
        addMouseListeners();


    }

    public void mouseMoved(MouseEvent mouse){
        double mouseX = mouse.getX();
        paddle.setLocation(mouseX,getHeight()-PADDLE_Y_OFFSET);
    }
}



