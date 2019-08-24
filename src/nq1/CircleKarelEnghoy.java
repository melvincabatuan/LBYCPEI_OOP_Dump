package nq1;

import stanford.karel.Karel;

public class CircleKarelEnghoy extends Karel {

    public void run() {
        moveAndTurn();
    }

    public void moveAndTurn(){
        if(frontIsBlocked()) {
            turnLeft();
            while (frontIsClear()) {
                moveForward();
                while (frontIsBlocked()) {
                    turnLeft();
                }
            }
        }
        else
            while(frontIsClear()) {
                moveForward();
                while (frontIsBlocked()) {
                    turnLeft();
                }
            }
    }


    public void moveForward(){
        while(frontIsClear()){
            move();
        }
    }

    public static void main (String [] args){
        (new CircleKarelEnghoy()).start(args);
    }

}
