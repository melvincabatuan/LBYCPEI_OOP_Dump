package module2.llars;/*
Author: Lenard Ryan S. Llarenas
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
public class Pyramid extends GraphicsProgram {
    public void run() {
        double x;
        double y;
        double n;
        double a=12;
        double b=0;

        for(n=390;n>=0;){
            for(x=((getWidth())/4)+b;x<=(((getWidth())/4)+b)+n;){
                y=(getHeight()-a);
                GRect rect = new GRect(30,12);
                add(rect, x, y);
                x=x+30;
            }
            n=n-30;
            a=a+12;
            b=b+15;
        }


    }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new Pyramid()).start(args);
    }
}