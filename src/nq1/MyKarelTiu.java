package nq1;

import stanford.karel.Karel;

public class MyKarelTiu extends Karel{

    public void run(){
        do{
            while(frontIsClear()){
                move();
            }
            turnLeft();
        }while(true);
    }

    public static void main (String [] args){
        (new MyKarelTiu()).start(args);
    }

}
