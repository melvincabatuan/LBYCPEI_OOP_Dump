package module5.port;

import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

public class BallClass extends GCompound{

    GOval ball;
    private static final double BALL_RADIUS = 12;

    private static final double VELOCITY_Y = 4;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;
    private static final int BALL_DELAY = 1000 / 60;

    public BallClass(){

        generateBall(BALL_RADIUS);

    }

    private void generateBall(double rad){
        ball = new GOval(rad,rad);
        ball.setFilled(true);
        ball.setFillColor(Color.black);
        add(ball);
    }

    double generateRadius(){
        return BALL_RADIUS;
    }
    double generateYVelocity(){ return VELOCITY_Y; }
    double generateXMinV(){
        return VELOCITY_X_MIN;
    }
    double generateXMaxV(){
        return VELOCITY_X_MAX;
    }
    double generateDelay(){
        return BALL_DELAY;
    }


}
