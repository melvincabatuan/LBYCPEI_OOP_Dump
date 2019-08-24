package nq1;

import stanford.karel.Karel;

public class CircleCedo extends Karel {

    public void run() {
    while(frontIsClear()){
        move();
        if(frontIsBlocked()){
            turnLeft();
        }
        if(frontIsBlocked()){
            turnLeft();
        }
        if(frontIsBlocked()){
            turnLeft();
        }
    }

    }

    public static void main (String [] args){
        (new CircleCedo()).start(args);
    }
}



