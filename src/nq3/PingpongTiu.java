package nq3;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;

public class PingpongTiu extends GraphicsProgram {

    // PongGo CONSTANTS
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;
    private static final int NBRICKS_PER_ROW = 10;
    private static final int NBRICKS_PER_COL = 10;
    private static final double BRICK_GAP = 4;
    private static final double BRICK_WIDTH = Math.floor(    (CANVAS_WIDTH - (NBRICKS_PER_ROW + 1.0) * BRICK_GAP) / NBRICKS_PER_ROW);
    private static final double BRICK_HEIGHT = 12;
    private static final double BRICK_Y_OFFSET = 60;   // from top
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30;    // from bottom
    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 3.0;
    private static final double VELOCITY_X_MIN = 2.0;
    private static final double VELOCITY_X_MAX = 5.0;
    private static final int BALL_DELAY = 1000 / 60;

    // PongGo class variables: main actors in the app
    private GRect paddle = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
    private GRect pcPaddle = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
    private GOval ball = new GOval(BALL_RADIUS,BALL_RADIUS);
    // Ball velocity
    private double dx;
    private double dy = VELOCITY_Y;    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();


    public void run() {
        setTitle("LBYCPEI PongGo");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        dx=rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
        if(rgen.nextBoolean()==false)
        {
            dx=dx*-1;
        }

        paddle.setFilled(true);
        paddle.setFillColor(Color.BLACK);
        pcPaddle.setFilled(true);
        pcPaddle.setFillColor(Color.BLACK);

        ball.setFilled(true);
        ball.setFillColor(Color.BLACK);

        addMouseListeners();
        add(ball,CANVAS_WIDTH/2-ball.getWidth()/2,CANVAS_HEIGHT/2-ball.getHeight()/2);

        do {
            pause(BALL_DELAY);
            add(ball,ball.getX()+dx,ball.getY()+dy);
            add(pcPaddle,ball.getX()-pcPaddle.getWidth()/2,PADDLE_Y_OFFSET);
            if(getCollidingObject()== paddle)
            {
                dy=dy*-1;
                dx=rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
                if(rgen.nextBoolean()==false)
                {
                    dx=dx*-1;
                }
            }
            else if(getCollidingObject()!= null)
            {
                dy=dy*-1;
                dx=rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
                if(rgen.nextBoolean()==false)
                {
                    dx=dx*-1;
                }
                //remove(getCollidingObject());
            }
            else if(ball.getY()==0)
            {
                dy=dy*-1;
                dx=rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
                if(rgen.nextBoolean()==false)
                {
                    dx=dx*-1;
                }
            }
            else if(ball.getX()<0 || ball.getX()>CANVAS_WIDTH)
            {
                dx=dx*-1;
            }

            if(ball.getY()>getHeight())
            {
                break;
            }

        }while(true);
        GLabel lose= new GLabel("GAME OVER");
        add(lose,(getWidth()-lose.getWidth())/2,300);
    }

        public void mouseMoved(MouseEvent mouse) {
        // Get the x coordinate of the mouse
        double mouseX = mouse.getX();
        if(mouseX<CANVAS_WIDTH-PADDLE_WIDTH/2 && mouseX>PADDLE_WIDTH/2)
        {
            add(paddle,mouseX-PADDLE_WIDTH/2,CANVAS_HEIGHT-PADDLE_Y_OFFSET);
        }
    }

    private GObject getCollidingObject(){
        GObject element = null;

        if(getElementAt(ball.getX(),ball.getY())!=null){
            element = getElementAt(ball.getX(),ball.getY());
        }
        else if(getElementAt(ball.getX()+ball.getWidth(),ball.getY())!=null){
            element = getElementAt(ball.getX(),ball.getY());
        }
        else if(getElementAt(ball.getX(),ball.getY()+ball.getWidth())!=null){
            element = getElementAt(ball.getX(),ball.getY());
        }
        else if(getElementAt(ball.getX()+ball.getWidth(),ball.getY()+ball.getWidth())!=null){
            element = getElementAt(ball.getX(),ball.getY());
        }
        return element;
    }

    public static void main(String[] args) {
        new PingpongTiu().start(args);
    }
}
