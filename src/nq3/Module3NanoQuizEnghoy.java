package nq3;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;
import java.awt.event.*;

public class Module3NanoQuizEnghoy extends GraphicsProgram {

    private int x =0;
    private int p = 0;
    private int Lives = 3;
    private int GamesPlayed =1;
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 600;
    private static final int WIDTH = APPLICATION_WIDTH;
    private static final int HEIGHT = APPLICATION_HEIGHT;
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;
    private static final int PADDLE_Y_OFFSET = 30;
    private static final int BALL_RADIUS = 15;
    private static final int NTURNS = 3;
    private GRect paddle1,paddle2;
    private GOval ball;
    private double vx, vy;
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private GLabel LivesLeft = new GLabel("Lives: "+ Lives,300 ,35);
    private static final int DELAY = 10;

    public void run(){
        this.setBackground(Color.GRAY);

        for(;;)
        {
            println("GAME " + GamesPlayed + " is Starting......");
            x=0;
            drawPaddle1();
            drawBall();
            drawPaddle2();
            for(int Lives=NTURNS; Lives > 0; Lives--)
            {
                LivesLeft.setColor(Color.RED);
                LivesLeft.setFont(new Font("Serif", Font.BOLD, 15));
                LivesLeft.setLabel("Lives Left: " + Lives);
                add(LivesLeft);
                this.waitForClick();
                playGame();

                if(Lives == 0)
                {
                    ball.setVisible(false);
                    printGameOver();
                    break;
                }
            }
            }
        }


    private void drawPaddle1()
    {
        double x = getWidth()/2 - PADDLE_WIDTH/2;
        double y = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        paddle1 = new GRect (x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle1.setFilled(true);
        paddle1.setColor(Color.GREEN);
        add (paddle1);
        addMouseListeners();
    }

    private void drawPaddle2()
    {
        double x = ball.getX() - PADDLE_WIDTH/2;
        double y = PADDLE_Y_OFFSET + PADDLE_HEIGHT;
        paddle2 = new GRect (x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle2.setFilled(true);
        paddle2.setColor(Color.BLACK);
        add (paddle2);
        movePaddle2();
    }

    public void mouseMoved(MouseEvent e)
    {
        if ((e.getX() < getWidth() - PADDLE_WIDTH/2) && (e.getX() > PADDLE_WIDTH/2))
        {
            paddle1.setLocation(e.getX() - PADDLE_WIDTH/2, getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);
        }
    }

    private void drawBall()
    {
        double x = getWidth()/2 - BALL_RADIUS;
        double y = getHeight()/2 - BALL_RADIUS;
        ball = new GOval(x, y, BALL_RADIUS + 11, BALL_RADIUS + 11);
        ball.setFilled(true);
        ball.setColor(Color.WHITE);
        add(ball);
    }

    private void playGame()
    {
        vy = -3;
        getBallVelocity();

        while (true)
        {
            moveBall();
            if (ball.getY() >= getHeight())
            {   break;  }

        }
    }


    private void getBallVelocity()
    {
        vy=vy;
        vx = rgen.nextDouble(1.0, 6.0);
    }

    private void movePaddle2(){
        paddle2.move(ball.getX(),paddle2.getY());
    }

    private void moveBall()
    {

        ball.move(vx, vy);
        if ((ball.getX() - vx <= 0 && vx < 0 )|| (ball.getX() + vx >= (getWidth() - BALL_RADIUS*2) && vx>0))
        {   vx=-vx;  }
        if ((ball.getY() - vy <= 0 && vy < 0 ))
        {   vy=-vy;  }

        GObject collider = getCollidingObject();
        if (collider == paddle1)
        {
            if(ball.getY() >= getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS*2 && ball.getY() < getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS*2 + 4)
            {   vy = -vy;   }
        }

        else if (collider == paddle2)
        {
            if(ball.getY() <= PADDLE_Y_OFFSET + PADDLE_HEIGHT + BALL_RADIUS*2 && ball.getY() > getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS*2 + 4)
            {   vy = -vy;   }
        }

        pause (DELAY);
    }

    private GObject getCollidingObject()
    {

        if((getElementAt(ball.getX(), ball.getY())) != null)
        {   return getElementAt(ball.getX(), ball.getY());   }

        else if (getElementAt( (ball.getX() + BALL_RADIUS*2), ball.getY()) != null )
        {   return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY());   }

        else if(getElementAt(ball.getX(), (ball.getY() + BALL_RADIUS*2)) != null )
        {   return getElementAt(ball.getX(), ball.getY() + BALL_RADIUS*2);   }

        else if(getElementAt((ball.getX() + BALL_RADIUS*2), (ball.getY() + BALL_RADIUS*2)) != null )
        {   return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY() + BALL_RADIUS*2);  }

        else
        {    return null;   }
    }

    private void printGameOver()
    {
        removeAll();
        GLabel gameOver = new GLabel ("Game Over", getWidth()/2, getHeight()/2);
        gameOver.move(-gameOver.getWidth()/2, -gameOver.getHeight());
        gameOver.setColor(Color.RED);
        gameOver.setFont(new Font("Serif", Font.BOLD, 30));
        add(gameOver,WIDTH/2-70 ,HEIGHT/2-30);
    }






    public static void main(String[] args){new Module3NanoQuizEnghoy().start(args);}
}
