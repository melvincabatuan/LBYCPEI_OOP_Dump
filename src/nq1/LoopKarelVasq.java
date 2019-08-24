package nq1;

import stanford.karel.Karel;

public class LoopKarelVasq extends Karel {

    public void run() {
        walkUntilBlocked();
    }

    private void walkUntilBlocked() {
        while (frontIsClear()) {
            move();
            if (frontIsBlocked()) {
                turnLeft();
                if(frontIsBlocked()){
                    turnLeft();
                }
                move();
            }
        }
    }

    public static void main (String [] args){
        (new LoopKarelVasq()).start(args);
    }
}
