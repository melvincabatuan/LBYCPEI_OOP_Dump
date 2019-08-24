package nq1;

import stanford.karel.Karel;

public class NanoquizKarelLlars extends Karel {
    public void run(){
        while (true){
            while (frontIsClear()){
                move();
            }
            turnLeft();
            if (frontIsBlocked()){
                turnLeft();
            }
        }
    }

    public static void main (String [] args){
        (new NanoquizKarelLlars()).start(args);
    }

}
