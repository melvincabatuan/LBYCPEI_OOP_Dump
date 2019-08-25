package module2.port;/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 05 - 22 - 2019
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Association extends firstHalf {

    public void run() {

        setBackground(Color.BLACK);
        generateRainbow();

    }

    public void generateRainbow(){
            generateFirstHalf();
            generateSecondHalf();
    }

    public static void main (String [] args){
                (new Association()).start(args);
        }

}


class firstHalf extends secondHalf {


        public void generateFirstHalf() {

                GRect red = new GRect(getWidth(), 10);

                red.setFilled(true);
                red.setFillColor(Color.RED);

                add(red, 0, (getHeight() / 2) - 30);

                GRect orange = new GRect(getWidth(), 10);

                orange.setFilled(true);
                orange.setFillColor(Color.ORANGE);

                add(orange, 0, (getHeight() / 2) - 20);


                GRect yellow = new GRect(getWidth(), 10);

                yellow.setFilled(true);
                yellow.setFillColor(Color.YELLOW);

                add(yellow, 0, (getHeight() / 2) - 10);

        }

}

class secondHalf extends GraphicsProgram {

                public void generateSecondHalf() {

                        GRect green = new GRect(getWidth(),10);

                        green.setFilled(true);
                        green.setFillColor(Color.GREEN);

                        add(green, 0,getHeight()/2);


                        GRect blue = new GRect(getWidth(),10);

                        blue.setFilled(true);
                        blue.setFillColor(Color.BLUE);

                        add(blue, 0,getHeight()/2+10);


                        GRect magenta = new GRect(getWidth(),10);

                        magenta.setFilled(true);
                        magenta.setFillColor(Color.MAGENTA);

                        add(magenta, 0,(getHeight()/2)+20);

                }


        }

