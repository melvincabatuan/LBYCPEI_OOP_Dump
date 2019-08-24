package nq1;//Infinite Karel
import stanford.karel.Karel;

public class InfiniteKarelSabu extends Karel {

    public void run(){
        while (noBeepersPresent()){
            karelMove();
            move();
        }
    }

    private void karelMove(){
        while (frontIsBlocked()){
            turnLeft();
        }
    }

    public static void main (String [] args){
        (new InfiniteKarelSabu()).start(args);
    }

}
