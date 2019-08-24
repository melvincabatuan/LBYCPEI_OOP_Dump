package nq1;

import stanford.karel.Karel;

public class InfiniteKarelFortiz extends Karel {

    public void run() {
        while(true){
            while(frontIsClear()) move();
            while(notFacingNorth()) turnLeft();
            while(frontIsClear()) move();
            while(notFacingWest()) turnLeft();
            while(frontIsClear()) move();
            while(notFacingSouth()) turnLeft();
            while(frontIsClear()) move();
            while(notFacingEast()) turnLeft();
        }
    }

    public static void main (String [] args){
        (new InfiniteKarelFortiz()).start(args);
    }
}
