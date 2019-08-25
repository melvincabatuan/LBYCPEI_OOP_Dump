package module2.nati;

import acm.graphics.GCanvas;
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import javax.swing.*;


public class FancyHello extends GraphicsProgram{

    private static GCanvas gc = new GCanvas();
    private static JFrame frame = new JFrame();

    private static void addCircle()
    {
        GImage circle = new GImage("300.png");
        circle.setSize(130,130);

        gc.add(circle,270,380);
    }

    private static void addSJBD()
    {
        GImage circle = new GImage("sjbd.jpg");
        circle.setSize(130,260);

        gc.add(circle,270,550);
    }

    private static void addDLSU()
    {
        GLabel circle = new GLabel("-DE-LA-SALLE-UNIVERSITY-");
        circle.setFont("Arial 200");

        gc.add(circle,250,325);
    }

    public static void main(String[] args)
    {
        GImage image = new GImage("DLSU2.png");

        gc.add(image,0,0);

        //(new FancyHello()).start(args);
        frame.add(gc);
        frame.setVisible(true);
        frame.setSize(640,480);

                gc.setSize(1920,1080);

        VerticalFlag flag = new VerticalFlag();

//        flag.render(gc,200,400,55,385);
//        flag.render(gc,200,400,405,385);
//        addCircle();
//        addSJBD();
//        addDLSU();
    }
}
