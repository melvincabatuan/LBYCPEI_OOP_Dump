package nq1;

import stanford.karel.Karel;

public class CircleKarelNati extends Karel {
    public void run() {
        while(true)
        {
            if(frontIsClear())
                move();
            else
                turnLeft();
        }
    }

    public static void main (String [] args){
        (new CircleKarelNati()).start(args);
    }
}
