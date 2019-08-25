package module2.fortiz;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/1/19
 *
 */

import acm.graphics.GArc;
import acm.graphics.GLine;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class Aggregation extends GraphicsProgram{
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;

    public void run() {
        setBackground(Color.GRAY);

        generateFace();
        generateText();
        generateSignature();

    }

    private void generateFace(){
        double headX, headY, eye1X, eye2X, eyeY, smileX, smileY;

        GOval head = new GOval(300,300);
        headX = (getWidth()-300)/2;
        headY = (getHeight()-300)/2;
        head.setFilled(true);
        head.setFillColor(Color.GRAY);

        GOval eye1 = new GOval(50,50);
        eye1X = (getWidth()-150)/2;
        eyeY = (getHeight()-100)/2;
        eye1.setFilled(true);
        eye1.setFillColor(Color.DARK_GRAY);
        GOval eye2 = new GOval(50,50);
        eye2X = (getWidth()-50)/2;
        eye2.setFilled(true);
        eye2.setFillColor(Color.DARK_GRAY);

        GArc smile = new GArc(80,80,0,-190);
        smileX = (getWidth()-100)/2;
        smileY = (getHeight())/2;

        generateHair();
        add(head, headX, headY);

        add(eye1, eye1X, eyeY);
        add(eye2, eye2X, eyeY);
        add(smile, smileX, smileY);
    }

    private void generateHair(){
        int ang, hairX, hairY;
        hairX = (getWidth())/2;
        hairY = (getHeight()-150)/2;
        for(ang=0;ang<=180;ang++){
            GLine hair = new GLine();
            hair.setEndPointPolar(130,ang);
            add(hair,hairX,hairY);
        }
    }

    private void generateText(){
        double textBoxX, textBoxY, textX;

        GRect textBox = new GRect(500,100);
        textBoxX = (getWidth()-500)/2;
        textBoxY = (getHeight()/2)+155;

        GLabel description1 = new GLabel("An analogy for AGGREGATION:");
        description1.setFont("SansSerif-italic-16");
        description1.setColor(Color.YELLOW);

        GLabel description2 = new GLabel("You can take a strand of hair and the other strands in your head wouldn't be affected");
        description2.setFont("SansSerif-italic-12");
        description2.setColor(Color.YELLOW);
        textX = (getWidth() - description2.getWidth())/2;

        add(textBox, textBoxX, textBoxY);
        add(description1, textX, textBoxY+40);
        add(description2, textX, textBoxY+70);
    }

    private void generateSignature(){
        double x,y;

        GLabel name = new GLabel("Patrick Fortiz");
        name.setFont("SansSerif-italic-10");
        name.setColor(Color.ORANGE);
        x = getWidth() - name.getWidth();
        y = getHeight() - name.getAscent();

        add(name,x,y);
    }

    public static void main(String[] args){
        (new Aggregation()).start(args);
    }
}
