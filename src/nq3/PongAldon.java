package nq3;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;
import java.awt.event.*;

public class PongAldon extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 600;

    private static final int WIDTH = APPLICATION_WIDTH;
    private static final int HEIGHT = APPLICATION_HEIGHT;

    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;

    private static final int PADDLE_Y_OFFSET = 30;

    private static final int BRICK_HEIGHT = 8;

    private static final int BALL_RADIUS = 10;

    private static final int BRICK_Y_OFFSET = 70;

    private static final int NTURNS = 3;

    private double vx, vy;

    private RandomGenerator rgen = RandomGenerator.getInstance();

    private static final int DELAY = 10;


    public static void main(String[] args) {
        new PongAldon().start(args);
    }

    /** Runs the Breakout program. */
    public void run() {
        for(int i=0; i < NTURNS; i++) {
            setUpGame();
            playGame();
            if(brickCounter == 0) {
                ball.setVisible(false);
                printWinner();
                break;
            }
            if(brickCounter > 0) {
                removeAll();
            }
        }
        if(brickCounter > 0) {
            printGameOver();
        }
    }

    private void setUpGame() {
        drawPaddle();
        drawPaddle2();
        drawBall();
    }

    private GRect brick;



    private GRect paddle;
    private GRect paddle2;

    private void drawPaddle() {
        double x = getWidth()/2 - PADDLE_WIDTH/2;
        double y = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        paddle = new GRect (x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle.setFilled(true);
        add (paddle);
        addMouseListeners();
    }

    private void drawPaddle2() {
        double x = getWidth()/2 - PADDLE_WIDTH/2;
        double y = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        paddle2 = new GRect (x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle2.setFilled(true);
        add (paddle2);


    }

    public void mouseMoved(MouseEvent e) {

        if ((e.getX() < getWidth() - PADDLE_WIDTH/2) && (e.getX() > PADDLE_WIDTH/2)) {
            paddle.setLocation(e.getX() - PADDLE_WIDTH/2, getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);
        }

    }

    //adding an individual ball object
    private GOval ball;


    //ball set-up
    private void drawBall() {
        double x = getWidth()/2 - BALL_RADIUS;
        double y = getHeight()/2 - BALL_RADIUS;
        ball = new GOval(x, y, BALL_RADIUS, BALL_RADIUS);
        ball.setFilled(true);
        add(ball);
    }

    private void playGame() {
        waitForClick();
        getBallVelocity();
        while (true) {
            moveBall();
            if (ball.getY() >= getHeight()) {
                break;
            }
            if(brickCounter == 0) {
                break;
            }
        }
    }

    private void getBallVelocity() {
        vy = 4.0;
        vx = rgen.nextDouble(1.0, 3.0);
        if (rgen.nextBoolean(0.5)) {
            vx = -vx;
        }

    }

    private void moveBall() {
        paddle2.setLocation(ball.getX(), PADDLE_Y_OFFSET);
        ball.move(vx, vy);
        //check for walls
        //need to get vx and vy at the point closest to 0 or the other edge
        if ((ball.getX() - vx <= 0 && vx < 0 )|| (ball.getX() + vx >= (getWidth() - BALL_RADIUS*2) && vx>0)) {
            vx = -vx;
        }
        if ((ball.getY() - vy <= 0 && vy < 0 )) {
            vy = -vy;
        }

        GObject collider = getCollidingObject();
        if (collider == paddle) {
            vy = -vy;
        }
        else if (collider == paddle2){
            vy = -vy;
        }
        else if (collider != null) {
            remove(collider);
            brickCounter--;
            vy = -vy;
        }
        pause (DELAY);
    }


    private GObject getCollidingObject() {

        if((getElementAt(ball.getX(), ball.getY())) != null) {
            return getElementAt(ball.getX(), ball.getY());
        }
        else if (getElementAt( (ball.getX() + BALL_RADIUS*2), ball.getY()) != null ){
            return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY());
        }
        else if(getElementAt(ball.getX(), (ball.getY() + BALL_RADIUS*2)) != null ){
            return getElementAt(ball.getX(), ball.getY() + BALL_RADIUS*2);
        }
        else if(getElementAt((ball.getX() + BALL_RADIUS*2), (ball.getY() + BALL_RADIUS*2)) != null ){
            return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY() + BALL_RADIUS*2);
        }
        //need to return null if there are no objects present
        else{
            return null;
        }

    }

    private void printGameOver() {
        GLabel gameOver = new GLabel ("Game Over", getWidth()/2, getHeight()/2);
        gameOver.move(-gameOver.getWidth()/2, -gameOver.getHeight());
        gameOver.setColor(Color.RED);
        add (gameOver);
    }

    private int brickCounter = 100;

    private void printWinner() {
        GLabel Winner = new GLabel ("Winner!!", getWidth()/2, getHeight()/2);
        Winner.move(-Winner.getWidth()/2, -Winner.getHeight());
        Winner.setColor(Color.RED);
        add (Winner);
    }


}