package module2.dong;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Aggregation extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Aggregation()).start(args);
    }

    public void run() {

        GRect room = new GRect(480, 450);
        add(room, 10, 10);


        GPolygon table = new GPolygon();
        add(table);
        table.addVertex(150, 80);
        table.addVertex(50, 80);
        table.addVertex(20, 130);
        table.addVertex(120, 130);
        table.setFilled(true);
        table.setColor(Color.lightGray);

        GLine table1 = new GLine(20, 130, 20, 160);
        add(table1);

        GLine table2 = new GLine(40, 130, 40, 140);
        add(table2);

        GLine table3 = new GLine(120, 130, 120, 160);
        add(table3);

        GLine table4 = new GLine(150, 80, 150, 110);
        add(table4);


        GPolygon chair = new GPolygon();
        add(chair);
        chair.addVertex(300, 150);
        chair.addVertex(350, 150);
        chair.addVertex(300, 180);
        chair.addVertex(250, 180);

        chair.setFilled(true);
        chair.setColor(Color.red);

        GRect chairTop = new GRect(50, 50);
        add(chairTop, 300, 80);
        chairTop.setFilled(true);
        chairTop.setColor(Color.red);
        GLine chair1 = new GLine(300, 130, 300, 150);
        add(chair1);

        GLine chair2 = new GLine(350, 130, 350, 150);
        add(chair2);

        GLine chair3 = new GLine(250, 180, 250, 220);
        add(chair3);

        GLine chair4 = new GLine(270, 180, 270, 210);
        add(chair4);

        GLine chair5 = new GLine(300, 180, 300, 220);
        add(chair5);

        GLine chair6 = new GLine(350, 150, 350, 210);
        add(chair6);

        GLabel text1 = new GLabel("ROOM");
        add(text1, 50, 400);
        text1.setFont("Arial-bold-20");

        GLabel text2 = new GLabel("TABLE");
        add(text2, 40, 180);
        text1.setFont("Arial-bold-20");

        GLabel text3 = new GLabel("CHAIR");
        add(text3, 280, 240);
        text1.setFont("Arial-bold-20");

        GLabel NAME = new GLabel("Created by: Dong, Neil");
        NAME.setColor(Color.orange);
        NAME.setFont("Arial-bold-20");
        add(NAME, 200, 430);
    }

}
