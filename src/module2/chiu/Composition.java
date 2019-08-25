package module2.chiu;/*
Kenley Lewis Chiu
LBYCPEI EQ3
May 29,2019
*/
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Composition extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 1280;
    public static final int APPLICATION_HEIGHT = 720;

    public static void main(String[] args) {
        (new Composition()).start(args);
    }

    public void run(){
        cpu();
        motherboard();
        GLabel relation= new GLabel("The motherboard cannot function without a CPU,");
        GLabel relation2 =new GLabel("and a CPU also cannot function without a motherboard.");
        relation.setFont("Arial-Bold-20");
        relation2.setFont("Arial-Bold-20");
        add(relation,100,600);
        add(relation2,100,620);
    }
    private void cpu()
    {
        int lonY=100;
        int changeY=-30;
        GRect big= new GRect(200,200);
        GRect small= new GRect(100,100);
        add(big,100,100);
        add(small,150,150);
        for(int x=0; x<2;x++)
        {
            int lonX=120;
            for (int y=0; y<9; y++)
            {
                pins(lonX,lonY,lonX,lonY+changeY);
                lonX=lonX+20;
            }
            lonY=lonY+200;
            changeY=30;
        }
        big.setFilled(true);
        big.setColor(Color.LIGHT_GRAY);
        big.setFillColor(Color.LIGHT_GRAY);
        small.setFilled(true);
        small.setColor(Color.GRAY);
        small.setFillColor(Color.GRAY);

        labels("CPU",290,150,350,150);

    }
    private void motherboard()
    {

        int counter=0;
        GRect board= new GRect(300,300);
        add(board,500,100);
        for (int x=0; x<14; x++) {
            circlePattern(counter);
            pattern(counter);
            counter=counter+20;
        }
        pattern(counter);
        board.setFilled(true);
        board.setFillColor(Color.GREEN);
        labels("Motherboard",760,150,840,150);
    }
    private void pins(double x ,double y, double x1, double y1)
    {
        GLine pin = new GLine(x,y,x1,y1);
        add(pin);
        pin.setColor(Color.ORANGE);
    }

    private void pattern(double x)
    {


        GLine pattern1 = new GLine(500+x,100,500+x,260);
        GLine pattern2 = new GLine(500+x,260,520+x,340);
        GLine pattern3 = new GLine(520+x,340,520+x,400);
        add(pattern1);
        add(pattern2);
        add(pattern3);
    }
    private void circlePattern(double x) {
        GOval circleTop = new GOval(20, 20);
        GOval circleBot= new GOval(20, 20);
        add(circleTop,510+x,100);
        add(circleBot,510+x,380);
        circleTop.setFilled(true);
        circleBot.setFilled(true);
        circleTop.setFillColor(Color.YELLOW);
        circleBot.setFillColor(Color.YELLOW);
        circleTop.setColor(Color.YELLOW);
        circleBot.setColor(Color.YELLOW);
    }

    private void labels(String part, double x0, double y0, double x1, double y1)
    {
        GLabel name= new GLabel(part);
        name.setFont("Arial-Bold-45");
        GLine point= new GLine(x0,y0,x1,y1);
        add(point);
        add(name,x1,y1);
    }
}
