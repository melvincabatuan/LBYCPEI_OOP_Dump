package nq1;

import stanford.karel.Karel;

public class GazingKarelAli extends Karel {

    public void run() {
        /* Solution 1*/
        moveForward();
    }

    public void moveForward() {
       while(frontIsClear()){
           move();
       }
       while(frontIsBlocked()){
           turnLeft();
           moveForward();
       }
    }

    public static void main (String [] args){
        (new GazingKarelAli()).start(args);
    }
}
