package module2.sabu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class FancyHello extends GraphicsProgram {

    public void run() {
        textInput1();
        textInput2();
    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new FancyHello()).start(args);
    }

    private void textInput1(){
        GLabel text = new GLabel("Hello LBYCPEI OOP!"); //summons an object
        text.setFont("Showcard Gothic-italic-48");
        text.setColor(Color.GREEN);
        double x = (getWidth() - text.getWidth()) / 2;
        double y = ((getHeight() - text.getAscent()) / 2);
        add(text, x,y); // adding text label to the center
        println(getWidth());
        println(getHeight());
        println(text.getWidth());

        //GOval circle = new GOval(50,50)
    }

    private void textInput2(){
        GLabel text2 = new GLabel("Matthew Sabularse");
        text2.setFont("Comic Sans-36");
        text2.setColor(Color.PINK);
        double x = (getWidth() - text2.getWidth()) / 2;
        double y = ((getHeight() - text2.getAscent()) / 2) - 100;
        add(text2, x,y);
    }




}