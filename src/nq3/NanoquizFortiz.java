package nq3;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

public class NanoquizFortiz extends GraphicsProgram{
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;
    private static final double Y_OFFSET = 60; // from top
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30; // from bottom
    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 3.0;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;
    private static final int BALL_DELAY = 1000 / 60;
    private GObject collider;
    private GOval ball;
    private GRect paddle1;
    private GRect paddle2;
    private double dx;
    private double dy;
    private RandomGenerator rgen = RandomGenerator.getInstance();


    public void run(){
        setTitle("LBYCPEI PongJob");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        addMouseListeners();

        showBall();
        showPaddle();
        move();
        movePaddle();
    }

    private void showBall(){
        double x,y;
        ball = new GOval(BALL_RADIUS*2,BALL_RADIUS*2);
        ball.setFilled(true);
        x = (getWidth()-2*BALL_RADIUS)/2;
        y = (getHeight()-2*BALL_RADIUS)/2;
        add(ball,x,y);
    }

    private void move(){
        dx = rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
        dy = VELOCITY_Y;
        if(rgen.nextBoolean(0.5)) dx = - dx;


        while(true){
            ball.move(dx,dy);
            if(ball.getX() > 0 && ball.getX() < getWidth()-PADDLE_WIDTH) paddle2.setLocation(ball.getX(), Y_OFFSET);
            if( (ball.getX()-dx <= 0 && dx < 0) || (ball.getX()+dx >= getWidth()-BALL_RADIUS*2 && dx > 0)) dx = -dx;
            if( (ball.getY()-dy >= getHeight()-BALL_RADIUS*2 && dy < 0)) dy = -dy;
            pause(BALL_DELAY);
            collider = getCollidingObject();
            if(collider != null) dy = -dy;
        }
    }

    private GObject getCollidingObject(){
        if (getElementAt(ball.getX(),ball.getY())!=null){
            return getElementAt(ball.getX(),ball.getY());
        }
        else if (getElementAt(ball.getX()+BALL_RADIUS*2,ball.getY())!=null){
            return getElementAt(ball.getX()+BALL_RADIUS*2,ball.getY());
        }
        else if (getElementAt(ball.getX(),ball.getY()+BALL_RADIUS*2)!=null){
            return getElementAt(ball.getX(),ball.getY()+BALL_RADIUS*2);
        }
        else if (getElementAt(ball.getX()+BALL_RADIUS*2,ball.getY()+BALL_RADIUS*2)!=null){
            return getElementAt(ball.getX()+BALL_RADIUS*2,ball.getY()+BALL_RADIUS*2);
        }

        return null;
    }

    private void showPaddle(){
        double x,y1,y2;

        paddle1 = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
        paddle1.setFilled(true);
        paddle2 = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
        paddle2.setFilled(true);

        x = (getWidth()-PADDLE_WIDTH)/2;
        y1 = getHeight()-PADDLE_HEIGHT-Y_OFFSET;
        y2 = PADDLE_HEIGHT+Y_OFFSET;

        add(paddle1,x,y1);
        add(paddle2,x,y2);
    }

    private void movePaddle(){

    }

    public void mouseMoved(MouseEvent mouse){
        double mouseX = mouse.getX();
        double maxX = getWidth() - PADDLE_WIDTH;

        if(mouseX > 0 && mouseX < maxX) paddle1.setLocation(mouseX, getHeight()-PADDLE_HEIGHT-Y_OFFSET);
    }



    public static void main(String[] args){
        (new NanoquizFortiz()).start(args);
    }
}
