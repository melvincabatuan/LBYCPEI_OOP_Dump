package nq3;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;

public class PingPongSabu extends GraphicsProgram {
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
    private GRect paddle = new GRect(0,CANVAS_HEIGHT-PADDLE_Y_OFFSET,PADDLE_WIDTH,PADDLE_HEIGHT);
    private GRect paddleTop = new GRect(0,PADDLE_Y_OFFSET,PADDLE_WIDTH,PADDLE_HEIGHT);

    private GOval ball = new GOval(CANVAS_WIDTH/2,CANVAS_HEIGHT/2,BALL_RADIUS*2,BALL_RADIUS*2);;
    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();
    // Ball velocity
    private double dx = rgen.nextDouble(VELOCITY_X_MIN,VELOCITY_X_MAX);
    private double dy = VELOCITY_Y;

    public void run() {
        setTitle("LBYCPEI PongGo");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        addMouseListeners();
        while (lives != 0){
            paddle();
            paddleComp();
            ball();
            starter();
        }
    }

    int lives = 1;
    double mx;

    public void mouseMoved(MouseEvent mouse){
        mx = mouse.getX();
        paddle.setX(mx);
        paddle.setBounds((mx - PADDLE_WIDTH/2), CANVAS_HEIGHT - PADDLE_Y_OFFSET,PADDLE_WIDTH, PADDLE_HEIGHT);
    }

    private void paddle(){
        paddle.setFilled(true);
        paddle.setFillColor(Color.BLACK);
        add(paddle);
    }

    private void paddleComp(){
        paddleTop.setFilled(true);
        paddleTop.setFillColor(Color.BLACK);
        paddleTop.setBounds((PADDLE_WIDTH/2), PADDLE_Y_OFFSET,PADDLE_WIDTH, PADDLE_HEIGHT);
        add(paddleTop);
    }

    int x = 0;
    boolean t = true;
    double bx;
    double by;
    private void ball(){

        ball = new GOval(CANVAS_WIDTH/2,CANVAS_HEIGHT/2,BALL_RADIUS*2,BALL_RADIUS*2);
        ball.setFilled(true);
        ball.setFillColor(Color.decode("#FFD662"));
        add(ball);
        waitForClick();
        //AudioClip hitSound = MediaTools.loadAudioClip("assets/2pm - Tetris.mp3");
        //
    }

    int score = 0;

    private void starter() {
        bx = ball.getX();
        by = ball.getY();
        randomX();
        while(true) {
            movement();

            paddleTop.setX(ball.getX());

            GObject collider = getCollidingObject();
            if (collider == paddle) {
                if (ball.getX()+ball.getWidth()/2 > paddle.getX() && ball.getX()+ball.getWidth()/2 < paddle.getX()+paddle.getWidth() && (ball.getY()+ball.getHeight())== paddle.getY()){
                    dy *= -1;
                }
            }
            else if (collider == paddleTop) {
                dy *= -1;
            }
            else if (collider != null) {
                dy = -dy;
                
            }
            if(ball.getY() < 0){
                lives -= 1;
                t = false;
                while(lives == 0){
                    winner();
                    break;
                }
                break;
            }
            else if(ball.getY() >= getHeight()){
                dy = dy*1;
                lives -= 1;
                t = false;
                while(lives == 0){
                    loser();
                    break;
                }
                break;
            }
        }
    }

    //public AudioClip hitSound = MediaTools.loadAudioClip("assets/roblox-death-sound_1.mp3");

    private void movement(){
        pause(BALL_DELAY);
        ball.move(dx,dy);
        if(ball.getX() + BALL_RADIUS >= CANVAS_WIDTH) {
            dx *= -1;
            
        }
        else if(ball.getX() + BALL_RADIUS <= 0) {
            dx *= -1;
            
        }
        /*else if(ball.getY() + BALL_RADIUS < 0) {
            dy *= -1;
            
        }
         */

    }

    private GObject getCollidingObject() {

        if((getElementAt(ball.getX(), ball.getY())) != null) {
            
            return getElementAt(ball.getX(), ball.getY());
        }
        if (getElementAt( (ball.getX() + BALL_RADIUS*2), ball.getY()) != null ){
            
            return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY());
        }
        if(getElementAt(ball.getX(), (ball.getY() + BALL_RADIUS*2)) != null ){
            
            return getElementAt(ball.getX(), ball.getY() + BALL_RADIUS*2);
        }
        if(getElementAt((ball.getX() + BALL_RADIUS*2), (ball.getY() + BALL_RADIUS*2)) != null ){
            
            return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY() + BALL_RADIUS*2);
        }
        else{
            return null;
        }

    }

    private void randomX()
    {
        if(rgen.nextBoolean(0.5)) {
            dx *= -1;
        }
    }


    private void topStatus(){
        GLabel scoring = new GLabel("Score: ");
        scoring.setLocation(10,40);
        scoring.setFont("Aleo-28");
        scoring.setColor(Color.decode("#F67280"));
        add(scoring);
        GLabel status = new GLabel("Lives Left:");
        status.setLocation(475,40);
        status.setFont("Aleo-28");
        status.setColor(Color.decode("#F67280"));
        add(status);
    }


    private void winner(){
        GLabel win = new GLabel("YOU WIN!");
        win.setLocation((CANVAS_WIDTH - win.getWidth())/2,CANVAS_HEIGHT/2);
        win.setFont("Franchise-35");
        win.setColor(Color.BLACK);
        add(win);
    }

    private void loser(){
        GLabel lose = new GLabel("YOU LOSE!");
        lose.setLocation((CANVAS_WIDTH - lose.getWidth())/2,CANVAS_HEIGHT/2);
        lose.setFont("Franchise-35");
        lose.setColor(Color.RED);
        add(lose);
        //remove(paddle);
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new PingPongSabu().start(args);
    }
}