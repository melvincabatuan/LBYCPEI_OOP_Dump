package nq1;

import stanford.karel.Karel;

public class InfiniteKarelDong extends Karel {

    public void run(){
        turn();

    }
    private void turn(){
        while (frontIsClear()){
            move();
        }
        if (frontIsBlocked()){
            turnLeft();
        infi();
        }

    }

    private void infi(){
        while (frontIsClear()){
            move();
        }
        turn();
    }

    public static void main (String [] args){
        (new InfiniteKarelDong()).start(args);
    }
}