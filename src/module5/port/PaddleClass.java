package module5.port;

import acm.graphics.GCompound;
import acm.graphics.GRect;

import java.awt.*;

public class PaddleClass extends GCompound{

    GRect paddle;

    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30; // from bottom

    public PaddleClass(){

        generatePaddle();

    }

    private void generatePaddle(){
        paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle.setFilled(true);
        paddle.setFillColor(Color.black);
        add(paddle);
    }


    double generateWidth(){
        return PADDLE_WIDTH;
    }

    double generateHeight(){
        return PADDLE_HEIGHT;
    }

    double generateOffset(){
        return PADDLE_Y_OFFSET;
    }



}
