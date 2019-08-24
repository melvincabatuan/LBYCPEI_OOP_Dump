package nq1;

import stanford.karel.Karel;

public class NQChan extends Karel {
    public void run(){
        while(true){
            if(frontIsBlocked()){
                turnLeft();
            }
            move();
        }
    }

    public static void main (String [] args){
        (new NQChan()).start(args);
    }
}
