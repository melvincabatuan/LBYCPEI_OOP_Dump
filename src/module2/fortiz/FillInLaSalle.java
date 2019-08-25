package module2.fortiz;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/1/19
 *
 */

import acm.graphics.GImage;
import acm.program.*;

public class FillInLaSalle extends GraphicsProgram{
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public void run(){
        GImage dlsu = new GImage("assets/DLSU2.png");
        GImage logo1 = new GImage("assets/logoDLSU.png");
        GImage logo2 = new GImage("assets/logo.png");
        GImage flag1 = new GImage("assets/Flag.png");
        GImage flag2 = new GImage("assets/Flag.png");
        GImage saint = new GImage("assets/saintLaSalle.png");
        
        logo1.setSize(550,38);
        logo2.setSize(92,90);
        flag1.setSize(184,400);
        flag2.setSize(184,400);
        saint.setSize(128,225);

        add(dlsu);
        add(logo1,60,305);
        add(flag1,60,384);
        add(flag2,415,384);
        add(logo2,288,398);
        add(saint,270,557);
    }




}
