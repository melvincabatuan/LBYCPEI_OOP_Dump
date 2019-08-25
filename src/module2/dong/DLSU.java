package module2.dong;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class DLSU extends GraphicsProgram {

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new DLSU()).start(args);
    }

    public void run(){

        GImage image = new GImage("assets/DLSU2.png");
        add(image,0,0);


        GImage stJohn = new GImage("assets/lasalle.jpg");
        add(stJohn, 270,556);
        stJohn.setSize(126, 260);
//        GImage image300 = new GImage("assets/300.jfif");
//        add(image300,285,390);
//        image300.setSize(100,100);
        setCanvasSize(image.getWidth(),image.getHeight());
        GLabel DLSUTEXT = new GLabel("•DE•LA•SALLE•UNIVERSITY•");
        DLSUTEXT.setFont("Arial-40");
        add(DLSUTEXT, 65,340);


    }

}