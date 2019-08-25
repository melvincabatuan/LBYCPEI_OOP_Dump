package module2.port;/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 05 - 22 - 2019
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Art extends GraphicsProgram {

    public void run() {
        setBackground(Color.BLACK);

        generateRainbow();

        generateLine();

        generateTriangle();

        generateTriangle2();

        darkSideOfTheMoon();

        nameLabel();


    }

    private void generateLine(){

        GLine line = new GLine(0,(getHeight()/2),getWidth()/2,(getHeight()/2));

        line.setColor(Color.WHITE);

        add(line);

    }

    private void generateTriangle(){

        GPolygon triangle = new GPolygon();

        double x = (getWidth() - 300) / 2;

        double y = (getHeight() - 300) / 2;

        triangle.addVertex(-8,305);
        triangle.addVertex(308,305);
        triangle.addVertex(150,-10);


        triangle.setFilled(true);
        triangle.setFillColor(Color.WHITE);

        add(triangle,x,y);

    }

    private void generateTriangle2(){

        GPolygon triangle = new GPolygon();

        double x = (getWidth() - 300) / 2;

        double y = (getHeight() - 300) / 2;

        triangle.addVertex(0,300);
        triangle.addVertex(300,300);
        triangle.addVertex(150,0);

        triangle.setFilled(true);
        triangle.setFillColor(Color.BLACK);

        add(triangle,x,y);

    }


    public void generateRainbow() {

        GRect red = new GRect(getWidth()/2,10);

        red.setFilled(true);
        red.setFillColor(Color.RED);

        add(red, getWidth()/2,(getHeight()/2)-30);



        GRect orange = new GRect(getWidth()/2,10);

        orange.setFilled(true);
        orange.setFillColor(Color.ORANGE);

        add(orange, getWidth()/2,(getHeight()/2)-20);



        GRect yellow = new GRect(getWidth()/2,10);

        yellow.setFilled(true);
        yellow.setFillColor(Color.YELLOW);

        add(yellow, getWidth()/2,(getHeight()/2)-10);



        GRect green = new GRect(getWidth()/2,10);

        green.setFilled(true);
        green.setFillColor(Color.GREEN);

        add(green, getWidth()/2,getHeight()/2);


        GRect blue = new GRect(getWidth()/2,10);

        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);

        add(blue, getWidth()/2,getHeight()/2+10);



        GRect magenta = new GRect(getWidth()/2,10);

        magenta.setFilled(true);
        magenta.setFillColor(Color.MAGENTA);

        add(magenta, getWidth()/2,(getHeight()/2)+20);



    }

    private void darkSideOfTheMoon(){

        GLabel artist = new GLabel("Pink Floyd");

        artist.setFont("Times New Roman-18");

        artist.setColor(Color.WHITE);

        double x = (getWidth() - artist.getWidth())/2;

        add(artist, x, 50);


        GLabel albumTitle = new GLabel("DSOTM");

        albumTitle.setFont("Arial-18");

        albumTitle.setColor(Color.WHITE);

        double x2 = (getWidth() - albumTitle.getWidth())/2;

        add(albumTitle, x2, getHeight()-40);

    }

    private void nameLabel(){

        GLabel text = new GLabel("created by JOSEPH PORTUGAL");;

        text.setFont("Times New Roman-18");

        text.setColor(Color.WHITE);

        double x = (getWidth() - text.getWidth());

        double y = getHeight();

        add(text, x, y); // adding text label  to the center 

    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError 
        (new Art()).start(args);
    }

}