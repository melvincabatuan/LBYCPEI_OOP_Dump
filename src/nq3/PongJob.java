package nq3;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PongJob extends GraphicsProgram {

    // PongJob CONSTANTS
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30;    // from bottom
    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 3.0;
    private static final double VELOCITY_X_MIN = 2.0;
    private static final double VELOCITY_X_MAX = 5.0;
    private static final int BALL_DELAY = 1000 / 60;

    // PongJob class variables: main actors in the app
    private GRect paddle = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
    private GRect paddle2 = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
    private GOval ball = new GOval(BALL_RADIUS,BALL_RADIUS);
    // Ball velocity
    private double dx;
    private double dy = VELOCITY_Y;    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private int score= 0;
    private int turn = 3;


    public void run() {
        setTitle("PongJob Game");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        dx=rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
        if(rgen.nextBoolean()==false)
        {
            dx=dx*-1;
        }

        paddle.setFilled(true);
        paddle.setFillColor(Color.BLACK);
        paddle2.setFilled(true);
        paddle2.setFillColor(Color.BLACK);
        ball.setFilled(true);
        ball.setFillColor(Color.BLACK);

        addMouseListeners();
        add(ball,CANVAS_WIDTH/2-ball.getWidth()/2,CANVAS_HEIGHT/2-ball.getHeight()/2);

        do {
            pause(BALL_DELAY);
            add(ball,ball.getX()+dx,ball.getY()+dy);
            if(getCollidingObject()== paddle)
            {
                dy=dy*-1;
                dx=rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
                if(rgen.nextBoolean()==false)
                {
                    dx=dx*-1;
                }
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

            else if(ball.getY()>getCanvasHeight()) {
                break;
            }


            add(paddle2,ball.getX()-30,CANVAS_HEIGHT-PADDLE_Y_OFFSET-CANVAS_HEIGHT+PADDLE_Y_OFFSET);

        }while(true);

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
        new PongJob().start(args);
    }
}
