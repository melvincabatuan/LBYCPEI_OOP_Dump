package module2.chiu;/*
Kenley Lewis Chiu
LBYCPEI EQ3
May 29,2019
*/


import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;
public class GraphicsAction extends GraphicsProgram {
        public static final int APPLICATION_WIDTH=1280;
        public static final int APPLICATION_HEIGHT=720;

    public static void main(String[] args) {
        (new GraphicsAction()).start(args);
    }

    public void run() {
        GLabel name= new GLabel("Created by Kenley Lewis Chiu");
        GOval leftEar= new GOval(100,100);
        GOval rightEar= new GOval(100,100);
        GRect rectangle= new GRect(500,100);
        GLine leftLine= new GLine(0,0,-80,100);
        GLine rightLine= new GLine(0,0,90,102);


        double leftY= (getHeight()-leftEar.getHeight())/2;
        double rightY= (getHeight()-rightEar.getHeight())/2;
        double rectX= (getWidth()-rectangle.getWidth())/2;


        add(rectangle,rectX,100);
        add(rightEar,700,rightY);
        add(leftEar,500,leftY);
        add(leftLine,rectX+250,200);
        add(rightLine,rectX+250,200);
        add(name,1100,680);

        leftEar.setFilled(true);
        leftEar.setFillColor(Color.LIGHT_GRAY);
        leftEar.setColor(Color.LIGHT_GRAY);

        rightEar.setFilled(true);
        rightEar.setFillColor(Color.LIGHT_GRAY);

        rightEar.setColor(Color.LIGHT_GRAY);
        rectangle.setFilled(true);
        rectangle.setFillColor(Color.MAGENTA);



    }


}
