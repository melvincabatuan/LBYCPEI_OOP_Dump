package nq1;

import stanford.karel.Karel;

public class KarelRunChiu extends Karel {
    public void run() {
        while(frontIsBlocked())
        {
            turnLeft();
        }
        while(frontIsClear())
        {
            move();
            while (frontIsBlocked())
            {
                turnLeft();
            }
        }
    }

    public static void main (String [] args){
        (new KarelRunChiu()).start(args);
    }
}
