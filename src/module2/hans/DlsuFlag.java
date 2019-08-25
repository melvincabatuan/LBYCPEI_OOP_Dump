package module2.hans;/*
Ongsitco Hans Alfonso A.
LBYCPEI
5/31/2019
 */
import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class DlsuFlag extends GraphicsProgram{
    public static final Color flagYellow = new Color(255, 215, 0);
    public void run(){
        GImage dls=new GImage("assets/DLSU2.png");
        add(dls);
        flag1();
        flag2();
        logo();
        schoolName();
        dudeparechong();
        signature();

    }
    private void flag1(){
        GRect blue=new GRect(100,410);
        add(blue, 150, 380);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);

        GRect red=new GRect(100,410);
        add(red, 50, 380);
        red.setFilled(true);
        red.setFillColor(Color.RED);

        GPolygon white= new GPolygon();
        white.addVertex(0,0);
        white.addVertex(200,0);
        white.addVertex(100,150);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white,50,380);

        GOval sun= new GOval(45,45);
        sun.setFilled(true);
        sun.setFillColor(flagYellow);
        sun.setColor(flagYellow);
        add(sun,white.getWidth()/1.54   ,410);

        GLine horizontalRay = new GLine(110, 433, 190, 433);
        add(horizontalRay);
        horizontalRay.setColor(flagYellow);

        GLine verticalRay = new GLine(152, 391, 152, 471);
        add(verticalRay);
        verticalRay.setColor(flagYellow);

        GLine diagonalRay1 = new GLine(120, 401, 180, 461);
        add(diagonalRay1);
        diagonalRay1.setColor(flagYellow);

        GLine diagonalRay2 = new GLine(120, 461, 180, 401);
        add(diagonalRay2);
        diagonalRay2.setColor(flagYellow);

        GLabel star1=new GLabel("*");
        add(star1,white.getWidth()/1.56,530);
        star1.setFont("Wide Latin-80");
        star1.setColor(flagYellow);

        GLabel star2=new GLabel("*");
        add(star2,white.getWidth()/1.54/2,437);
        star2.setFont("Wide Latin-80");
        star2.setColor(flagYellow);

        GLabel star3=new GLabel("*");
        add(star3,white.getWidth()-10,437);
        star3.setFont("Wide Latin-80");
        star3.setColor(flagYellow);

    }
    private void flag2(){
        GRect blue=new GRect(100,410);
        add(blue, 510, 380);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);

        GRect red=new GRect(100,410);
        add(red, 410, 380);
        red.setFilled(true);
        red.setFillColor(Color.RED);

        GPolygon white= new GPolygon();
        white.addVertex(0,0);
        white.addVertex(200,0);
        white.addVertex(100,150);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white,410,380);

        GOval sun= new GOval(45,45);
        sun.setFilled(true);
        sun.setFillColor(flagYellow);
        sun.setColor(flagYellow);
        add(sun,white.getWidth()/1.54+360,410);

        GLine horizontalRay = new GLine(110+360, 433, 190+360, 433);
        add(horizontalRay);
        horizontalRay.setColor(flagYellow);

        GLine verticalRay = new GLine(152+360, 391, 152+360, 471);
        add(verticalRay);
        verticalRay.setColor(flagYellow);

        GLine diagonalRay1 = new GLine(120+360, 401, 180+360, 461);
        add(diagonalRay1);
        diagonalRay1.setColor(flagYellow);

        GLine diagonalRay2 = new GLine(120+360, 461, 180+360, 401);
        add(diagonalRay2);
        diagonalRay2.setColor(flagYellow);

        GLabel star1=new GLabel("*");
        add(star1,white.getWidth()/1.56+360,530);
        star1.setFont("Wide Latin-80");
        star1.setColor(flagYellow);

        GLabel star2=new GLabel("*");
        add(star2,white.getWidth()/1.54/2+360,437);
        star2.setFont("Wide Latin-80");
        star2.setColor(flagYellow);

        GLabel star3=new GLabel("*");
        add(star3,white.getWidth()-10+360,437);
        star3.setFont("Wide Latin-80");
        star3.setColor(flagYellow);
    }
    private void logo(){
        GOval logo = new GOval(85,85);
        add(logo, 290,400);
        logo.setFilled(true);
        logo.setFillColor(Color.GREEN);
        GLabel year= new GLabel("300");
        year.setFont("Arial-20");
        add(year,315,449);
    }
    private void dudeparechong(){
        GImage lasalle = new GImage("assets/lasalle.jpg");
        lasalle.setSize(130, 260);
        add(lasalle, 270, 548);
    }
    private void schoolName(){
        GLabel name = new GLabel("DE  LA  SALLE  UNIVERSITY ");
        name.setFont("Arial-40");
        add(name, 65, 338);
    }
    private void signature() {
        GLabel name = new GLabel("created by Hans Ongsitco");
        add(name, getWidth() - name.getWidth()-10, getHeight()-10);
    }

    public static void main (String [] args){
        (new DlsuFlag()).start(args);
    }
}