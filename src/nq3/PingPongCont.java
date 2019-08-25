package nq3;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;

/*Always bounces*/
public class PingPongCont extends GraphicsProgram {
    // PongJob CONSTANTS
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
    private static final double xmid = CANVAS_WIDTH/2;
    private static final double ymid = CANVAS_HEIGHT/2;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;
    private static final int BALL_DELAY = 1000 / 60;
    // PongJob class variables: main actors in the app
    private GRect paddle = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
    private GOval ball = new GOval(BALL_RADIUS, BALL_RADIUS);
    private GRect paddleTop = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);

    // Ball velocity
    private double dx=3;
    private double dy=VELOCITY_Y;
    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run() {
        setTitle("LBYCPEI PongJob");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        addMouseListeners();
        paddle();
        paddleTop();
        initball();
        while(true) {
            moveBall();
            paddleMove();
        }
    }


    public void paddle(){
        //initializes the paddle
        paddle.setFilled(true);
        paddle.setColor(Color.black);
        double ypaddle = getHeight() -  PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        double xpaddle = xmid - PADDLE_WIDTH/2;
        add(paddle, xpaddle, ypaddle);
    }

    public void initball(){
        //initializes the ball
        ball.setFilled(true);
        ball.setColor(Color.red);
        double xball = BALL_RADIUS/2;
        double yball = BALL_RADIUS/2;
        add(ball, xmid - xball, ymid- yball);
    }

    public void mouseMoved(MouseEvent mouse) {
        // Get the x coordinate of the mouse
        double mouseX = mouse.getX();

        //Makes the paddle move left to right vice versa
        add(paddle, mouseX - PADDLE_WIDTH/2, getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);

        //Sets the boundaries of the paddle
        if(paddle.getX()<0){
            add(paddle, 0, getHeight()-PADDLE_Y_OFFSET-PADDLE_HEIGHT);
        }
        if(paddle.getX() + PADDLE_WIDTH > CANVAS_WIDTH){
            add(paddle, CANVAS_WIDTH-PADDLE_WIDTH, getHeight()-PADDLE_Y_OFFSET-PADDLE_HEIGHT);
        }
    }

    public void moveBall(){
        double xcheck, ycheck;
        pause(BALL_DELAY);
        xcheck = ball.getX();
        ycheck = ball.getY();
        if(ycheck >= paddle.getY()-PADDLE_HEIGHT){
            dy = -1*dy;
        }
        if(ycheck <=paddleTop.getY()+paddleTop.getHeight()) {
            dy = -1 * dy;
        }
        if(xcheck >= CANVAS_WIDTH) {
            dx = -1 * dx;
        }
        if(xcheck <= 0) {
            dx = -1 * dx;
        }
        add(ball, ball.getX()+ dx, ball.getY() +dy);
    }

    public void paddleTop(){
        //initializes the paddle
        paddleTop.setFilled(true);
        paddleTop.setColor(Color.black);
        double ypaddle =  PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        double xpaddle = xmid - PADDLE_WIDTH/2;
        add(paddleTop, xpaddle, ypaddle);
    }

    public void paddleMove(){
        double AIpaddle = ball.getX();
        double ypaddle =  PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        double xpaddle = xmid - PADDLE_WIDTH/2;

        add(paddleTop, AIpaddle-PADDLE_WIDTH/2, ypaddle);

        if(paddleTop.getX()<0){
            add(paddleTop, 0, PADDLE_Y_OFFSET-PADDLE_HEIGHT);
        }
        if(paddleTop.getX() + PADDLE_WIDTH > CANVAS_WIDTH){
            add(paddleTop, CANVAS_WIDTH-PADDLE_WIDTH, PADDLE_Y_OFFSET-PADDLE_HEIGHT);
        }
    }


    public static void main(String[] args) {
        new PingPongCont().start(args);
    }
}