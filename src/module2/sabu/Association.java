package module2.sabu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Association extends GraphicsProgram {

    public void run() {
        bg();
        bank();
        money();
        texts();
    }

    public static void main(String[] args) { // Solves java.lang.NoClassDefFoundError
        (new Association()).start(args);
    }

    public static final int MONEY_WIDTH = 170;
    public static final int MONEY_HEIGHT = 70;

    private void bank(){
        bankOutline();
        bpi();
        arrows();
    }

    private void money(){
        oneThousand();
        fiveHundred();
        oneHundred();
    }

    private void oneThousand(){
        GRect money = new GRect(MONEY_WIDTH,MONEY_HEIGHT);
        money.setColor(Color.CYAN);
        money.setFilled(true);
        money.setFillColor(Color.CYAN);
        double x = 75;
        double y = 300;
        add(money,x,y);
        GLabel text = new GLabel("1000");
        text.setFont("Moon 2.0-48");
        text.setColor(Color.BLACK);
        double x1 = 100;
        double y1 = 350;
        add(text,x1,y1);
    }

    private void fiveHundred(){
        GRect money = new GRect(MONEY_WIDTH,MONEY_HEIGHT);
        money.setColor(Color.yellow);
        money.setFilled(true);
        money.setFillColor(Color.yellow);
        double x = 275;
        double y = 300;
        add(money,x,y);
        GLabel text = new GLabel("500");
        text.setFont("Moon 2.0-48");
        text.setColor(Color.BLACK);
        double x1 = 315;
        double y1 = 350;
        add(text,x1,y1);
    }

    private void oneHundred(){
        GRect money = new GRect(MONEY_WIDTH,MONEY_HEIGHT);
        money.setColor(Color.green);
        money.setFilled(true);
        money.setFillColor(Color.green);
        double x = 475;
        double y = 300;
        add(money,x,y);
        GLabel text = new GLabel("200");
        text.setFont("Moon 2.0-48");
        text.setColor(Color.BLACK);
        double x1 = 510;
        double y1 = 350;
        add(text,x1,y1);
    }

    private void bankOutline(){
        GRect bank = new GRect(250,135);
        bank.setColor(Color.BLACK);
        bank.setFilled(true);
        bank.setFillColor(Color.RED);
        double x = 240;
        double y = 100;
        add(bank,x,y);
    }

    private void bpi(){
        GLabel bpi = new GLabel("BPI");
        bpi.setFont("Aleo-Bold-72");
        bpi.setColor(Color.WHITE);
        double x = 305;
        double y = 195;
        add(bpi,x,y);
    }

    private void texts(){
        GLabel explain = new GLabel("People use the bank to store their money and earn interest" +
                " and in return, ");
        explain.setFont("Comic Sans-14");
        explain.setColor(Color.BLACK);
        double x = (getWidth() - explain.getWidth())/2;
        double y = 40;
        add(explain,x,y);
        GLabel explain2 = new GLabel("the bank also earns interest from each account.");
        explain2.setFont("Comic Sans-14");
        explain2.setColor(Color.BLACK);
        double x2 = (getWidth() - explain2.getWidth())/2;
        double y2 = 60;
        add(explain2,x2,y2);
        GLabel text = new GLabel("Matthew Sabularse");
        text.setFont("Ostrich Sans Black-20");
        text.setColor(Color.BLACK);
        double x1 = 570;
        double y1 = 450;
        add(text,x1,y1);
    }

    private void arrows(){
        GArc larc = new GArc(185,185,180,-90);
        double x = 110;
        double y = 160;
        add(larc,x,y);
        GLine line1 = new GLine(202,161,170,135);
        add(line1);
        GLine line2 = new GLine(202,161,170,190);
        add(line2);
        GLine line3 = new GLine(522,161,554,135);
        add(line3);
        GLine line4 = new GLine(522,161,554,190);
        add(line4);
        GLine line5 = new GLine(615,253,640,227);
        add(line5);
        GLine line6 = new GLine(615,253,590,227);
        add(line6);
        GLine line7 = new GLine(110,253,85,227);
        add(line7);
        GLine line8 = new GLine(110,253,135,227);
        add(line8);
        GArc rarc = new GArc(185,185,90,-90);
        double x1 = 430;
        double y1 = 160;
        add(rarc,x1,y1);

    }

    private void bg(){
        GRect box = new GRect(getWidth() + 25,getHeight() + 25);
        box.setFilled(true);
        box.setFillColor(Color.decode("#9003CF"));
        box.setColor(Color.decode("#9003CF"));
        double x = -5; //340
        double y = -5; //110
        add(box,x,y);
    }
}