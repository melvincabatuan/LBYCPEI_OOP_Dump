package nq1;

import stanford.karel.Karel;

public class CircleKarelToro extends Karel {

    public void run() {
        while (true) {
            while (frontIsClear()) {move();}
            turnLeft();
        }
    }

    public static void main (String [] args){
        (new CircleKarelToro()).start(args);
    }

}
