package module2.tiu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class FlagDlsu extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT =480;
    public static final int BRICK_WIDTH  = 30;
    public static final int BRICK_HEIGHT  = 12;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        signName();
        //drawTrafficLight();
        //drawPyramid();
        //drawFlag();
        //drawHourGlass();
        setHeight(811);
        writeDLSU();
        write300();
        drawFlagVert(60,380);
        drawFlagVert(415,380);


    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new FlagDlsu()).start(args);
    }


    public void drawTrafficLight(){
        GRect rect2=new GRect(50,300);
        rect2.setFilled(true);
        rect2.setFillColor(Color.GRAY);
        add(rect2,(getWidth()-rect2.getWidth())/2,(getHeight()-rect2.getHeight()));

        GRect rect1=new GRect(130,300);
        rect1.setFilled(true);
        rect1.setFillColor(Color.DARK_GRAY);
        add(rect1,(getWidth()-rect1.getWidth())/2,(getHeight()-rect1.getHeight())/2);

        GOval green=new GOval(70,70);
        green.setFilled(true);
        green.setFillColor(Color.GREEN);
        add(green,(getWidth()-green.getWidth())/2,300);

        GOval red=new GOval(70,70);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        add(red,(getWidth()-green.getWidth())/2,100);

        GOval yellow=new GOval(70,70);
        yellow.setFilled(true);
        yellow.setFillColor(Color.YELLOW);
        add(yellow,(getWidth()-green.getWidth())/2,200);


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

    public void drawFlag()
    {
        GRect blue=new GRect(getWidth(),getHeight()/3);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);
        add(blue,0,(getHeight()-blue.getHeight()*2)/2);

        GRect red=new GRect(getWidth(),getHeight()/3);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        add(red,0,blue.getY()+blue.getHeight());

        GPolygon white=new GPolygon();
        white.addVertex(0,0);
        white.addVertex(0,blue.getHeight()*2);
        white.addVertex(getWidth()*2/5,blue.getHeight());
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white,0,blue.getY());

        GOval sun=new GOval(white.getHeight()*2/9,white.getHeight()*2/9);
        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);
        add(sun,blue.getX()+sun.getHeight()*7/10,(red.getY()-sun.getWidth()/2));

        GPolygon wing1=new GPolygon();
        wing1.addVertex(15,0);
        wing1.addVertex(30,10);
        wing1.addVertex(22,40);
        wing1.addVertex(8,40);
        wing1.addVertex(0,10);
        wing1.setFilled(true);
        wing1.setFillColor(Color.YELLOW);
        add(wing1,sun.getX()+20,sun.getY()-40);

        GPolygon wing2=new GPolygon();
        wing2.addVertex(15,0);
        wing2.addVertex(30,10);
        wing2.addVertex(22,40);
        wing2.addVertex(8,40);
        wing2.addVertex(0,10);
        wing2.setFilled(true);
        wing2.setFillColor(Color.YELLOW);
        wing2.rotate(180);
        add(wing2,sun.getX()+50,sun.getY()+sun.getWidth()+38);

        GPolygon wing3=new GPolygon();
        wing3.addVertex(15,0);
        wing3.addVertex(30,10);
        wing3.addVertex(22,40);
        wing3.addVertex(8,40);
        wing3.addVertex(0,10);
        wing3.setFilled(true);
        wing3.setFillColor(Color.YELLOW);
        wing3.rotate(90);
        add(wing3,sun.getX()-40,sun.getY()+sun.getWidth()-19);

        GPolygon wing4=new GPolygon();
        wing4.addVertex(15,0);
        wing4.addVertex(30,10);
        wing4.addVertex(22,40);
        wing4.addVertex(8,40);
        wing4.addVertex(0,10);
        wing4.setFilled(true);
        wing4.setFillColor(Color.YELLOW);
        wing4.rotate(270);
        add(wing4,sun.getX()+38+sun.getWidth(),sun.getY()+sun.getWidth()-50);

        GPolygon wing5=new GPolygon();
        wing5.addVertex(15,0);
        wing5.addVertex(30,10);
        wing5.addVertex(22,40);
        wing5.addVertex(8,40);
        wing5.addVertex(0,10);
        wing5.setFilled(true);
        wing5.setFillColor(Color.YELLOW);
        wing5.rotate(45);
        add(wing5,sun.getX()-29,sun.getY()+sun.getWidth()-79);

        GPolygon wing6=new GPolygon();
        wing6.addVertex(15,0);
        wing6.addVertex(30,10);
        wing6.addVertex(22,40);
        wing6.addVertex(8,40);
        wing6.addVertex(0,10);
        wing6.setFilled(true);
        wing6.setFillColor(Color.YELLOW);
        wing6.rotate(135);
        add(wing6,sun.getX()-6,sun.getY()+sun.getWidth()+25);

        GPolygon wing7=new GPolygon();
        wing7.addVertex(15,0);
        wing7.addVertex(30,10);
        wing7.addVertex(22,40);
        wing7.addVertex(8,40);
        wing7.addVertex(0,10);
        wing7.setFilled(true);
        wing7.setFillColor(Color.YELLOW);
        wing7.rotate(225);
        add(wing7,sun.getX()+sun.getWidth()+23,sun.getY()+sun.getWidth()+5);

        GPolygon wing8=new GPolygon();
        wing8.addVertex(15,0);
        wing8.addVertex(30,10);
        wing8.addVertex(22,40);
        wing8.addVertex(8,40);
        wing8.addVertex(0,10);
        wing8.setFilled(true);
        wing8.setFillColor(Color.YELLOW);
        wing8.rotate(315);
        add(wing8,sun.getX()+sun.getWidth()+6,sun.getY()+sun.getWidth()-sun.getWidth()-27);

        GPolygon star1 = new GPolygon();
        star1.setFilled(true);
        star1.setColor(Color.BLACK);
        star1.setFillColor(Color.YELLOW);
        star1.addEdge(0, 0);
        star1.addEdge(-10, 6);
        star1.addEdge(6, -10);
        star1.addEdge(-10, -6);
        star1.addEdge(10, -2);
        star1.addEdge(6, -10);
        star1.addEdge(6, 10);
        star1.addEdge(10, 2);
        star1.addEdge(-10, 6);
        star1.addEdge(6, 10);
        star1.rotate(40);
        add(star1,blue.getX()+25, blue.getY()+45);

        GPolygon star2 = new GPolygon();
        star2.setFilled(true);
        star2.setColor(Color.BLACK);
        star2.setFillColor(Color.YELLOW);
        star2.addEdge(0, 0);
        star2.addEdge(-10, 6);
        star2.addEdge(6, -10);
        star2.addEdge(-10, -6);
        star2.addEdge(10, -2);
        star2.addEdge(6, -10);
        star2.addEdge(6, 10);
        star2.addEdge(10, 2);
        star2.addEdge(-10, 6);
        star2.addEdge(6, 10);
        star2.rotate(130);
        add(star2,blue.getX()+30, red.getY()+red.getHeight()-50);

        GPolygon star3 = new GPolygon();
        star3.setFilled(true);
        star3.setColor(Color.BLACK);
        star3.setFillColor(Color.YELLOW);
        star3.addEdge(0, 0);
        star3.addEdge(-10, 6);
        star3.addEdge(6, -10);
        star3.addEdge(-10, -6);
        star3.addEdge(10, -2);
        star3.addEdge(6, -10);
        star3.addEdge(6, 10);
        star3.addEdge(10, 2);
        star3.addEdge(-10, 6);
        star3.addEdge(6, 10);
        star3.rotate(270);
        add(star3,blue.getX()+210, red.getY());

        add(sun,blue.getX()+sun.getHeight()*7/10,(red.getY()-sun.getWidth()/2));

    }

    public void drawHourGlass()
    {
        GRect[] brick=new GRect[220];
        for(int i=0;i<220;i++)
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
        y=y+BRICK_HEIGHT*2;
        for(int k=0;k<14;k++)
        {
            for(int j=0;j<count;j++)
            {
                add(brick[brickNum],x+BRICK_WIDTH*j,y);
                brickNum++;
            }
            x=x-(BRICK_WIDTH/2);
            y=y-BRICK_HEIGHT;
            count++;
        }
    }

    public void drawFlagVert(int x, int y){
        GRect blue=new GRect(getWidth()/7,getHeight()/2);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);
        add(blue,x,y);

        GRect red=new GRect(getWidth()/7,getHeight()/2);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        add(red,x+red.getWidth(),y);

        GPolygon white=new GPolygon();
        white.addVertex(0,0);
        white.addVertex(blue.getWidth()*2,0);
        white.addVertex(blue.getWidth(),blue.getHeight()*2/5);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white,x,y);

        GPolygon star1 = new GPolygon();
        star1.setFilled(true);
        star1.setColor(Color.BLACK);
        star1.setFillColor(Color.YELLOW);
        star1.addEdge(0, 0);
        star1.addEdge(-5, 3);
        star1.addEdge(3, -5);
        star1.addEdge(-5, -3);
        star1.addEdge(5, -1);
        star1.addEdge(3, -5);
        star1.addEdge(3, 5);
        star1.addEdge(5, 1);
        star1.addEdge(-5, 3);
        star1.addEdge(3, 5);
        star1.rotate(45);
        add(star1,blue.getX()+20, blue.getY()+15);

        GPolygon star2 = new GPolygon();
        star2.setFilled(true);
        star2.setColor(Color.BLACK);
        star2.setFillColor(Color.YELLOW);
        star2.addEdge(0, 0);
        star2.addEdge(-5, 3);
        star2.addEdge(3, -5);
        star2.addEdge(-5, -3);
        star2.addEdge(5, -1);
        star2.addEdge(3, -5);
        star2.addEdge(3, 5);
        star2.addEdge(5, 1);
        star2.addEdge(-5, 3);
        star2.addEdge(3, 5);
        star2.rotate(-45);
        add(star2,blue.getX()+160, blue.getY()+14);

        GPolygon star3 = new GPolygon();
        star3.setFilled(true);
        star3.setColor(Color.BLACK);
        star3.setFillColor(Color.YELLOW);
        star3.addEdge(0, 0);
        star3.addEdge(-5, 3);
        star3.addEdge(3, -5);
        star3.addEdge(-5, -3);
        star3.addEdge(5, -1);
        star3.addEdge(3, -5);
        star3.addEdge(3, 5);
        star3.addEdge(5, 1);
        star3.addEdge(-5, 3);
        star3.addEdge(3, 5);
        star3.rotate(180);
        add(star3,red.getX(), blue.getY()+blue.getHeight()*2/5-22);

        GOval sun=new GOval(white.getHeight()*2/9,white.getHeight()*2/9);
        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);
        add(sun,red.getX()-sun.getWidth()/2,blue.getY()+blue.getHeight()*2/5-sun.getWidth()*10/3);

        GPolygon wing1=new GPolygon();
        wing1.addVertex(0,0);
        wing1.addVertex(7,8);
        wing1.addVertex(3,25);
        wing1.addVertex(-3,25);
        wing1.addVertex(-7,8);
        wing1.setFilled(true);
        wing1.setFillColor(Color.YELLOW);
        add(wing1,sun.getX()+sun.getWidth()/2,sun.getY()-wing1.getHeight());

        GPolygon wing2=new GPolygon();
        wing2.addVertex(0,0);
        wing2.addVertex(7,8);
        wing2.addVertex(3,25);
        wing2.addVertex(-3,25);
        wing2.addVertex(-7,8);
        wing2.rotate(180);
        wing2.setFilled(true);
        wing2.setFillColor(Color.YELLOW);
        add(wing2,sun.getX()+sun.getWidth()/2,sun.getY()+wing1.getHeight()+sun.getWidth());

        GPolygon wing3=new GPolygon();
        wing3.addVertex(0,0);
        wing3.addVertex(7,8);
        wing3.addVertex(3,25);
        wing3.addVertex(-3,25);
        wing3.addVertex(-7,8);
        wing3.rotate(90);
        wing3.setFilled(true);
        wing3.setFillColor(Color.YELLOW);
        add(wing3,sun.getX()-wing1.getHeight(),sun.getY()+sun.getWidth()/2);

        GPolygon wing4=new GPolygon();
        wing4.addVertex(0,0);
        wing4.addVertex(7,8);
        wing4.addVertex(3,25);
        wing4.addVertex(-3,25);
        wing4.addVertex(-7,8);
        wing4.rotate(-90);
        wing4.setFilled(true);
        wing4.setFillColor(Color.YELLOW);
        add(wing4,sun.getX()+wing1.getHeight()+sun.getWidth(),sun.getY()+sun.getWidth()/2);

        GPolygon wing5=new GPolygon();
        wing5.addVertex(0,0);
        wing5.addVertex(7,8);
        wing5.addVertex(3,25);
        wing5.addVertex(-3,25);
        wing5.addVertex(-7,8);
        wing5.rotate(45);
        wing5.setFilled(true);
        wing5.setFillColor(Color.YELLOW);
        add(wing5,sun.getX()-sun.getWidth()*3/10,sun.getY()-sun.getWidth()*3/10);

        GPolygon wing6=new GPolygon();
        wing6.addVertex(0,0);
        wing6.addVertex(7,8);
        wing6.addVertex(3,25);
        wing6.addVertex(-3,25);
        wing6.addVertex(-7,8);
        wing6.rotate(-45);
        wing6.setFilled(true);
        wing6.setFillColor(Color.YELLOW);
        add(wing6,sun.getX()+sun.getWidth()*3/10+sun.getWidth(),sun.getY()-sun.getWidth()*3/10);

        GPolygon wing7=new GPolygon();
        wing7.addVertex(0,0);
        wing7.addVertex(7,8);
        wing7.addVertex(3,25);
        wing7.addVertex(-3,25);
        wing7.addVertex(-7,8);
        wing7.rotate(135);
        wing7.setFilled(true);
        wing7.setFillColor(Color.YELLOW);
        add(wing7,sun.getX()-sun.getWidth()*3/10,sun.getY()+sun.getWidth()*3/10+sun.getWidth());

        GPolygon wing8=new GPolygon();
        wing8.addVertex(0,0);
        wing8.addVertex(7,8);
        wing8.addVertex(3,25);
        wing8.addVertex(-3,25);
        wing8.addVertex(-7,8);
        wing8.rotate(-135);
        wing8.setFilled(true);
        wing8.setFillColor(Color.YELLOW);
        add(wing8,sun.getX()+sun.getWidth()*3/10+sun.getWidth(),sun.getY()+sun.getWidth()*3/10+sun.getWidth());

        add(sun,red.getX()-sun.getWidth()/2,blue.getY()+blue.getHeight()*2/5-sun.getWidth()*10/3);
    }

    public void writeDLSU()
    {
        GImage dlsu= new GImage("assets/DLSU2.png");
        GImage john = new GImage("assets/lasalle.jpg");
        add(dlsu,0,0);
        john.setSize(130,280);
        add(john,(getWidth()-john.getWidth())/2+20,getHeight()-john.getHeight());

        GLabel text=new GLabel("•DE•LA•SALLE•UNIVERSITY•");
        text.setFont("Serif-40");
        text.setColor(Color.DARK_GRAY);
        add(text,(getWidth()-text.getWidth())/2+16,340);


    }

    public void write300()
    {
        GOval circle=new GOval(90,90);
        circle.setFilled(true);
        circle.setFillColor(Color.GREEN);
        add(circle,(getWidth()-circle.getWidth())/2+10,390);

        GLabel text=new GLabel("300");
        text.setFont("Serif-italic-44");
        text.rotate(45);
        text.setColor(Color.WHITE);
        add(text,circle.getX()+text.getWidth()/2,circle.getY()+text.getHeight()+20);
    }

}