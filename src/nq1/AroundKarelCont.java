package nq1;

import stanford.karel.Karel;

public class AroundKarelCont extends Karel {
    public void run() {
    while(frontIsClear()){
        move();
        while (frontIsBlocked()) turnLeft();
    }

    }

    public static void main (String [] args){
        (new AroundKarelCont()).start(args);
    }
}
