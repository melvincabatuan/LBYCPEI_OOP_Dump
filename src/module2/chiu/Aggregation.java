package module2.chiu;
/*
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

public class Aggregation extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 1280;
    public static final int APPLICATION_HEIGHT = 720;

    public static void main(String[] args) {    // Solves java.lang.NoClassDefFoundError 
        (new Aggregation()).start(args);
    }

    public void run() {
        wallet();
        money();
        GLabel relation = new GLabel("Wallet has money but money");
        GLabel relation2 = new GLabel("does not need the wallet to function.");
        relation.setFont("Arial-Bold-20");
        relation2.setFont("Arial-Bold-20");
        add(relation, 100, 550);
        add(relation2, 100, 570);
    }

    private void wallet() {
        GRect wallet = new GRect(300, 190);
        GRect logo = new GRect(80, 30);

        add(wallet, 100, 100);
        wallet.setFilled(true);
        wallet.setFillColor(Color.RED);
        wallet.setColor(Color.RED);

        logo.setFilled(true);
        logo.setFillColor(Color.LIGHT_GRAY);
        logo.setColor(Color.LIGHT_GRAY);
        add(logo, 300, 230);
        pocket(120);
        pocket(122);
        pocket(140);
        pocket(142);

        GLabel name = new GLabel("Java");
        name.setFont("Serif-italic-18");
        name.setColor(Color.YELLOW);
        add(name, 325, 250);

        labels("wallet", 120, 120, 180, 400);
    }

    private void money() {
        GRect bill = new GRect(250, 100);
        GOval num = new GOval(95, 95);
        bill.setFilled(true);
        bill.setFillColor(Color.GREEN);
        bill.setColor(Color.GREEN);
        add(bill, 600, 100);
        add(num, 675, 102.5);
        num.setFilled(true);
        num.setFillColor(Color.WHITE);
        num.setColor(Color.WHITE);
        sign(620, 180);
        sign(775, 180);

        GLabel number = new GLabel("30");
        number.setFont("Arial-Bold-65");
        add(number, 685, 170);

        labels("money", 630, 120, 725, 400);
    }

    private void pocket(double y) {
        GLine pocket = new GLine(100, y, 400, y);
        add(pocket);
    }

    private void sign(double x, double y) {
        GLabel sign = new GLabel("$");
        sign.setFont("Arial-90");
        add(sign, x, y);
    }

    private void labels(String part, double x0, double y0, double x1, double y1) {
        GLabel name = new GLabel(part);
        name.setFont("Arial-Bold-45");
        GLine point = new GLine(x0, y0, x1, y1);
        add(point);
        add(name, x1, y1);
    }

}