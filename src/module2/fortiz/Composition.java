package module2.fortiz;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/1/19
 *
 */

import acm.graphics.GLine;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class Composition extends GraphicsProgram{
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;

    public void run() {

        setBackground(Color.GRAY);
        generateFrame();
        generateLens();
        generateText();
        generateSignature();
    }

    private void generateFrame(){
        GLine side1 = new GLine();
        side1.setEndPointPolar(200,160);

        GLine side2 = new GLine();
        side2.setEndPointPolar(200,160);

        GLine side3 = new GLine();
        side3.setEndPointPolar(30,45);

        GLine side4 = new GLine();
        side4.setEndPointPolar(30,225);

        add(side1,400,100);
        add(side2,300,200);
        add(side3, 300,200);
        add(side4, 400,100);
    }

    private void generateLens(){
        double lens1X, lens2X, nosePieceX, lensY, nosePieceY;

        GLine nosePiece = new GLine();
        nosePiece.setEndPointPolar(60,0);
        nosePieceX = (getWidth()-60)/2;
        nosePieceY = getHeight()/2+50;

        GOval lens1 = new GOval(100,100);
        lens1.setFilled(true);
        lens1.setFillColor(Color.DARK_GRAY);
        lens1X = (getWidth()-260)/2;
        lensY = getHeight()/2;

        GOval lens2 = new GOval(100,100);
        lens2X = (getWidth()+60)/2;
        lens2.setFilled(true);
        lens2.setFillColor(Color.DARK_GRAY);

        add(lens1, lens1X, lensY);
        add(nosePiece, nosePieceX, nosePieceY);
        add(lens2, lens2X, lensY);
    }

    private void generateText(){
        double textBoxX, textBoxY, textX;
        GRect textBox = new GRect(500,100);
        textBoxX = (getWidth()-500)/2;
        textBoxY = (getHeight()/2)+110;
        GLabel description1 = new GLabel("An analogy for COMPOSITION:");
        description1.setFont("SansSerif-italic-16");
        description1.setColor(Color.ORANGE);


        GLabel description2 = new GLabel("Eyeglasses are no longer eyeglasses if you take out the lenses");
        description2.setFont(("SansSerif-italic-16"));
        description2.setColor(Color.ORANGE);
        textX = (getWidth()-description2.getWidth())/2;

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
        (new Composition()).start(args);
    }
}
