package nq1;

/*
Ongsitco Hans
*/
import stanford.karel.Karel;


public class MyKarelHans extends Karel {

    public void run() {
        while (notFacingEast()){
            turnLeft();
        }
        while(true) {
            while (frontIsClear()) {
                move();
            }
            turnLeft();
        }

    }

    public static void main (String [] args){
        (new MyKarelHans()).start(args);
    }
}


