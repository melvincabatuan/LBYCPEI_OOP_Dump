package nq1;

import stanford.karel.Karel;

public class MyKarelSimon extends Karel{

    public void run() {
        while(noBeepersPresent()){
            if(frontIsBlocked()){
                turnLeft();
            }
            move();
            if(frontIsBlocked()){
                turnLeft();
                if(frontIsBlocked()){
                    turnLeft();
                }
            }
        }

    }

    public static void main (String [] args){
        (new MyKarelSimon()).start(args);
    }
}
