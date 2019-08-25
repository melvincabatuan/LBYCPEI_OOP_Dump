package module2.chiu;/*
Kenley Lewis Chiu
LBYCPEI EQ3
May 29,2019
*/
import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;
public class Dlsu extends GraphicsProgram {
    // Set the dimensions of window depending on image size
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;
    private static final double WIDTH = 91;
    private static final double HEIGHT = 402;

    public static void main(String[] args) {
        (new Dlsu()).start(args);
    }


    public void run() {
        GImage dlsu = new GImage("assets/DLSU2.png");
        add(dlsu);
        firstFlag();
        secondFlag();
        //GImage john= new GImage("assets/john.png");
        GImage john= new GImage("assets/lasalle.jpg");
        add(john,271,556);
        john.setSize(128,248);
        GLabel name= new GLabel("• DE • LA • SALLE • UNIVERSITY •");
        name.setFont("Serif-italic-34");
        name.setColor(Color.GREEN);
        add(name,62,340);
        sign();
        
    }

    private void firstFlag()//the left Flag
    {
        int angle=0;
        double positionX=62,positionY=383;
        blueRect(positionX,positionY);
        redRect(positionX,positionY);
        triangle(positionX,positionY,520);
        star(80,384);
        star(224,384);
        star(152,493);
        sun(138,423);
        for (int s=0; s <8; s++) {
            sunRays(152, 436, angle);
            angle=angle+45;
        }


    }

    private void secondFlag()//the right Flag
    {
        int angle=0;
        double positionX=415,positionY=384;
        blueRect(positionX,positionY);
        redRect(positionX,positionY);
        triangle(positionX,positionY,520);
        star(434,384);
        star(578,384);
        star(506,493);
        sun(491,423);
        for (int s=0; s <8; s++) {
            sunRays(506, 436, angle);
            angle=angle+45;
        }


    }

    private void blueRect(double positionX, double positionY)//for the blue side of the Flag
    {
        GRect blueRect = new GRect(WIDTH, HEIGHT);
        add(blueRect,positionX,positionY);
        blueRect.setFilled(true);
        blueRect.setColor(Color.BLUE);
        blueRect.setFillColor(Color.BLUE);
    }

    private void redRect(double positionX, double positionY)//for the red side of the Flag
    {
        GRect redRect = new GRect(WIDTH, HEIGHT);
        add(redRect,positionX+WIDTH,positionY);
        redRect.setFilled(true);
        redRect.setFillColor(Color.RED);
        redRect.setColor(Color.RED);
    }

    private void triangle(double positionX, double positionY, double positionY2 )
    {
        GPolygon triangle = new GPolygon();
        triangle.addVertex(positionX, positionY );
        triangle.addVertex(positionX+WIDTH*2, positionY);
        triangle.addVertex(positionX+WIDTH,positionY2);
        add(triangle);
        triangle.setFilled(true);
        triangle.setColor(Color.WHITE);
        triangle.setFillColor(Color.WHITE);
    }

    private void star(double x,double y)
    {
        GPolygon star = new GPolygon();
        star.addVertex(0, 0);
        star.addVertex(10, 20);
        star.addVertex(40, 20);
        star.addVertex(15, 35);
        star.addVertex(30, 60);

        star.addVertex(0, 45);

        star.addVertex(-30, 60);
        star.addVertex(-15, 35);
        star.addVertex(-40, 20);
        star.addVertex(-10, 20);

        add(star, 0 + x, 0 + y);

        star.scale(0.25);
        star.setFilled(true);
        star.setColor(Color.YELLOW);
        star.setFillColor(Color.YELLOW);
    }

    private void sun(double x, double y){
        GOval sun= new GOval(30,30);
        sun.setFilled(true);
        sun.setColor(Color.YELLOW);
        sun.setFillColor(Color.YELLOW);
        add(sun,x,y);

    }

    private void sunRays(double x,double y, double z)
    {
        GPolygon rays= new GPolygon();
        rays.addVertex(0,0);
        rays.addVertex(2,3);
        rays.addVertex(2,30);
        rays.addVertex(0,33);
        rays.addVertex(-2,30);
        rays.addVertex(-2,3);
        rays.rotate(z);
        rays.setFilled(true);
        rays.setColor(Color.YELLOW);
        rays.setFillColor(Color.YELLOW);
        add(rays,x,y);

    }

    private void sign()
    {
        GOval circle= new GOval(125,125);
        GLabel number= new GLabel("300");
        number.setFont("Serif-italic-60");
        add(circle,270,380);
        add(number, 290,460);
        circle.setFilled(true);
        circle.setColor(Color.GREEN);
        circle.setFillColor(Color.GREEN);
        number.setColor(Color.WHITE);

    }




    }
