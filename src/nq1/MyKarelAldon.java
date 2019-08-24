package nq1;

import stanford.karel.Karel;


public class MyKarelAldon extends Karel {

    

    public void run() {
        while(true){
            frontIsClear();
            rotate();
        }



    }

    public void rotate(){
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
    }
/*
    public void goToNewspaper(){
        move();
        move();
        turnRight();
        move();
        turnLeft();
        move();

    }

    public void goBack(){


        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnRight();
        move();
        turnRight();
    }

    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }*/

    public static void main (String [] args){
        (new MyKarelAldon()).start(args);
    }

}