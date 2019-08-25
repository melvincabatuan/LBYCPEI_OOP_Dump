package nq3;/*
Ongsitco Hans Alfonso A.
LBYCPEI
6/7/2019
 */
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.MouseEvent;

/*  Game Not moving*/
public class GameHans extends GraphicsProgram{
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
    public void run(){
        setTitle("LBYCPEI BREAKOUT");
        setCanvasSize(CANVAS_WIDTH,CANVAS_HEIGHT);
        paddle();
        addMouseListeners();
        ball();

    }

    private void ball(){
        GOval ball= new GOval(BALL_RADIUS,BALL_RADIUS);
        ball.setFilled(true);
        ball.setFillColor(Color.magenta);
        add(ball,CANVAS_WIDTH/2,CANVAS_HEIGHT/2);


    }

    private void paddle(){
        GRect pad=new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
        add(pad, CANVAS_WIDTH/2, PADDLE_Y_OFFSET);
        pad.setFilled(true);
        pad.setFillColor(Color.BLACK);

        GRect pad2=new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
        add(pad2, CANVAS_WIDTH/2, CANVAS_HEIGHT-PADDLE_Y_OFFSET);
        pad2.setFilled(true);
        pad2.setFillColor(Color.BLACK);

    }
    public void mouseMoved(MouseEvent mouse){
        double mouseX=mouse.getX();

    }


    public static void main (String [] args){
        (new GameHans()).start(args);
    }
}