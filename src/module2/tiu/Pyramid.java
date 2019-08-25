package module2.tiu;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT =480;
    public static final int BRICK_WIDTH  = 30;
    public static final int BRICK_HEIGHT  = 12;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        signName();
        drawPyramid();

    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Pyramid()).start(args);
    }

    public void drawPyramid()
    {
        GRect[] brick=new GRect[106];
        for(int i=0;i<105;i++)
        {
            brick[i]=new GRect(BRICK_WIDTH,BRICK_HEIGHT);
        }
        int x=(getWidth()-30*14)/2,y=getHeight()-12,brickNum=0,count=14;

        for(int k=0;k<14;k++)
        {
            for(int j=0;j<count;j++)
            {
                add(brick[brickNum],x+BRICK_WIDTH*j,y);
                brickNum++;
            }
            x=x+(BRICK_WIDTH/2);
            y=y-BRICK_HEIGHT;
            count--;
        }
    }

    public void signName()
    {
        GLabel text = new GLabel("Emerson Karl Tiu");
        add(text,getWidth()-text.getWidth(),getHeight()-text.getHeight());
    }

}