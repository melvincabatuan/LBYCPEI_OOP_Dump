package nq1;/*
 * NAME: Johnal Khow
 * ID# : ***deleted***
 * COURSE SECTION: EQ3
 * DATEl MAY 28, 2019
 * */

import stanford.karel.Karel;

public class NanoQuizKhow extends Karel {


    public void run() {
        /* Write Solution HERE*/
        while (true) {
            move();
            if (frontIsBlocked()) {
                turnLeft();
                if (frontIsBlocked())
                    turnLeft();
            }


        }
    }

    public static void main (String [] args){
        (new NanoQuizKhow()).start(args);
    }
}


