package nq1;

import stanford.karel.Karel;

public class MyKarelGo extends Karel {

    public void run() {

        while(true){
            if (frontIsClear()){
                move();
            }
            else if(frontIsBlocked()){
                turnLeft();
            }
        }
    }

    public static void main (String [] args){
        (new MyKarelGo()).start(args);
    }

}
