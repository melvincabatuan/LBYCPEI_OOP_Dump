package nq1;//Panes, Michael Ryan B.
import stanford.karel.Karel;


public class InfiniteCirclePanes extends Karel {

    public void run() {
        goCircle();
    }


    public void goCircle() {
        if(frontIsBlocked()){
            turnLeft();
            while(frontIsClear()) {
            move();
            if (frontIsBlocked()) {
                turnLeft();
                if(frontIsBlocked()) turnLeft();
                }
            }
        }
        else{
            while(frontIsClear()) {
                move();
                if (frontIsBlocked()) {
                    turnLeft();
                    if(frontIsBlocked()) turnLeft();
                }
            }
        }
    }


    public static void main (String [] args){
        (new InfiniteCirclePanes()).start(args);
    }
}