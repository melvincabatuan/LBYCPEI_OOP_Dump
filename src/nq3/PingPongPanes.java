package nq3;//Panes, Michael Ryan B.

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.MouseEvent;


public class PingPongPanes extends GraphicsProgram {

    // PongGo CONSTANTS
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30; // from bottom
    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 3.0;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;
    private static final int BALL_DELAY = 1000 / 100;

    // PongGo class variables: main actors in the app
    private GRect paddle1 = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
    private GRect paddle2 = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
    private GOval ball = new GOval(BALL_RADIUS,BALL_RADIUS);
    private GObject getCollidingObject(){
        GObject collider = null;

        if(getElementAt(ball.getX(),ball.getY())!=null){
            collider = getElementAt(ball.getX(),ball.getY());
        }
        else if(getElementAt(ball.getX()+ball.getWidth(),ball.getY())!=null){
            collider = getElementAt(ball.getX(),ball.getY());
        }
        else if(getElementAt(ball.getX(),ball.getY()+ball.getWidth())!=null){
            collider = getElementAt(ball.getX(),ball.getY());
        }
        else if(getElementAt(ball.getX()+ball.getWidth(),ball.getY()+ball.getWidth())!=null){
            collider = getElementAt(ball.getX(),ball.getY());
        }
        return collider;
    }


    // Ball velocity
    private double dx;
    private double dy = VELOCITY_Y;

    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();

    //Score and turns
    private int score1 = 0;
    private int score2 = 0;

    public static void main(String[] args) {
        new PingPongPanes().start(args);
    }

    public void run() {
        setTitle("LBYCPEI Ping Pong");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);

        dx=rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
        if(!rgen.nextBoolean())
        {
            dx=dx*-1;
        }

        paddle1.setFilled(true);
        paddle1.setFillColor(Color.BLACK);

        paddle2.setFilled(true);
        paddle2.setFillColor(Color.BLACK);

        addMouseListeners();
        makeBallLabel();
    }


    public void makeBallLabel(){
        GLabel scoreLabel1 = new GLabel("SCORE:" + score1);
        add(scoreLabel1, 0, CANVAS_HEIGHT-scoreLabel1.getHeight());
        GLabel scoreLabel2 = new GLabel("SCORE:" + score2);
        add(scoreLabel2, 0, 0+scoreLabel2.getHeight());

        ball.setFilled(true);
        ball.setFillColor(Color.BLACK);

        add(ball,CANVAS_WIDTH/2-ball.getWidth()/2,CANVAS_HEIGHT/2-ball.getHeight()/2);

        add(paddle2,CANVAS_WIDTH/2-ball.getWidth()/2,PADDLE_Y_OFFSET);

        while (true) {

            pause(BALL_DELAY);
            add(ball, ball.getX() + dx, ball.getY() + dy);
            add(paddle2,ball.getX(),PADDLE_Y_OFFSET);

            if (getCollidingObject() == paddle1) {
                dy = dy * -1;
                dx = rgen.nextDouble(VELOCITY_X_MIN, VELOCITY_X_MAX);
                if (!rgen.nextBoolean()) {
                    dx = dx * -1;
                }
            }

            if (getCollidingObject() == paddle2) {
                dy = dy * -1;
                dx = rgen.nextDouble(VELOCITY_X_MIN, VELOCITY_X_MAX);
                if (!rgen.nextBoolean()) {
                    dx = dx * -1;
                }
            }

            else if (ball.getX() < 0 || ball.getX() > CANVAS_WIDTH) {
                dx = dx * -1;
            }

            if (ball.getY() > getHeight()) {
                remove(scoreLabel2);
                score2 = score2 + 1;
                scoreLabel2 = new GLabel("SCORE:" + score2);
                add(scoreLabel2, 0, 0+scoreLabel2.getHeight());
                if (score2 == 5) {
                    GLabel Lose = new GLabel("Computer Wins!");
                    add(Lose,getCanvasWidth()/2-20,getCanvasHeight()/2);
                    break;
                }
                else {
                    add(ball, CANVAS_WIDTH / 2 - ball.getWidth() / 2, CANVAS_HEIGHT / 2 - ball.getHeight() / 2);
                }
            }

            else if (ball.getY() == 0) {
                remove(scoreLabel1);
                score1 = score1 + 1;
                scoreLabel1 = new GLabel("SCORE:" + score1);
                add(scoreLabel1, 0, CANVAS_HEIGHT - scoreLabel1.getHeight());
                if (score1 == 5) {
                    GLabel Lose = new GLabel("Player Wins!");
                    add(Lose,getCanvasWidth()/2-20,getCanvasHeight()/2);
                    break;
                }
                else {
                    add(ball, CANVAS_WIDTH / 2 - ball.getWidth() / 2, CANVAS_HEIGHT / 2 - ball.getHeight() / 2);
                }
            }

        }
    }


    public void mouseMoved(MouseEvent mouse) {

        // Get the x coordinate of the mouse
        double mouseX = mouse.getX();

        if(mouseX<CANVAS_WIDTH-PADDLE_WIDTH/2 && mouseX>PADDLE_WIDTH/2)
        {
            add(paddle1,mouseX-PADDLE_WIDTH/2,CANVAS_HEIGHT-PADDLE_Y_OFFSET);
        }
    }

}