package nq1;

import stanford.karel.Karel;

public class NanoQuizJob extends Karel {

    public void run() {
        while (frontIsClear()) {
            move();
            turn();
        }
        if ((frontIsBlocked()) && (leftIsClear())) {
            while (leftIsClear()) {
                turnLeft();
                while (frontIsClear()) {
                    move();
                    turn();
                }
            }
        }
    }

    public void turn() {
        if (facingEast()) {
            if ((frontIsBlocked()) && (leftIsClear()))  {
                turnLeft();
            }
            else if ((frontIsBlocked()) && leftIsBlocked()) {
                turnLeft();
                turnLeft();
            }
        }

        else if (facingNorth()) {
            if ((frontIsBlocked()) && (leftIsClear())) {
                turnLeft();
            }

            else if ((frontIsBlocked()) && (leftIsBlocked())) {
                turnLeft();
                turnLeft();
            }
        }

        else if (facingWest()) {
            if  ((frontIsBlocked()) && (leftIsClear())) {
                turnLeft();
            }

            else if ((frontIsBlocked() && (leftIsBlocked()))) {
                turnLeft();
                turnLeft();
            }
        }

        else if (facingSouth()) {
            if ((frontIsBlocked()) && (leftIsClear())) {
                turnLeft();
            }

            else if ((frontIsBlocked()) && (leftIsBlocked())) {
                turnLeft();
                turnLeft();
            }
        }
    }

    public static void main (String [] args){
        (new NanoQuizJob()).start(args);
    }

}