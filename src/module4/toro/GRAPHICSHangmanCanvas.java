package module4.toro;

import acm.graphics.*;
public class GRAPHICSHangmanCanvas extends GCanvas {

    private static final int TEXT_HEIGHT = 20;   // you can modify this to suit your ascii art
    private static final int TEXT_X_OFFSET = 12;   // you can modify this to suit your ascii art
    private int textX;
    private int textY;


    /**
     * Resets the display so that only the HangmanAldon scaffold appears
     */
    public void reset() {
        textX = TEXT_X_OFFSET;
        textY = TEXT_HEIGHT;
    }

    public void printText(String text){
        GLabel line = new GLabel(text);
        textY += TEXT_HEIGHT;
        line.setFont("Monospaced-Bold-16");
        add(line,  textX , textY );
    }

    public void displayHangman(int guessCount) {
        clear();
        int midx = getWidth() / 2;
        int midy = getHeight() / 2;
        GLine line = new GLine(midx, 0, midx, 20);
        add(line);

        if(guessCount <= 7) {
            GOval head = new GOval(midx - 50, 20, 100, 100);
            add(head);
        }

        if(guessCount <= 6) {
            GLine body = new GLine(midx, 120, midx, 300);
            add(body);
        }

        if(guessCount <= 5) {
            GLine arml = new GLine(midx, 180, midx-50, 200);
            add(arml);
        }

        if(guessCount <= 4) {
            GLine armr = new GLine(midx, 180, midx+50, 200);
            add(armr);
        }

        if(guessCount <= 3) {
            GLine legl = new GLine(midx, 300, midx-30, 450);
            add(legl);
        }

        if(guessCount <= 2) {
            GLine legr = new GLine(midx, 300, midx+30, 450);
            add(legr);
        }

        if(guessCount <= 1) {
            GLine footl = new GLine(midx-30, 450, midx-45, 450);
            add(footl);
        }

        if(guessCount <= 0) {
            GLine footr = new GLine(midx+30, 450, midx+45, 450);
            add(footr);
        }
    }
}
