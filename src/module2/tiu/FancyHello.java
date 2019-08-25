package module2.tiu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class FancyHello extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT =480;
    public static final int BRICK_WIDTH  = 30;
    public static final int BRICK_HEIGHT  = 12;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        signName();
        write();


    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new FancyHello()).start(args);
    }
    public void signName()
    {
        GLabel text = new GLabel("Emerson Karl Tiu");
        add(text,getWidth()-text.getWidth(),getHeight()-text.getHeight());
    }

    public void write()
    {

        GLabel text=new GLabel("Hello LBYCPEI World");
        text.setFont("Serif-italic-44");
        text.setColor(Color.GREEN);
        add(text,100,100);
    }

}