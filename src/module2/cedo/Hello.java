package module2.cedo;

import acm.graphics.GLabel;
import acm.program.*;
import java.awt.*;

public class Hello extends GraphicsProgram {

    public void run(){
        GLabel text = new GLabel("Hello LBYCPEI OOP!"); // summoning an object
        text.setFont("Serif-italic-48");
        text.setColor(Color.GREEN);
        double x = (getWidth() - text.getWidth()) / 2;
        double y = (getHeight() - text.getHeight()) / 2;
        add(text,x,y);

        println(getWidth());
        println(getHeight());
        println(text.getWidth());
        println(text.getHeight());
    }

    public static void main(String[] args){
        (new Hello()).start(args);
    }

}