import stanford.karel.SuperKarel;

public class MyKarel extends SuperKarel {

    public void run() {
        move();
        paintCorner(GREEN);
        move();
        paintCorner(GREEN);
        turnRight();
        move();
        paintCorner(GREEN);
        turnLeft();
        move();
        paintCorner(GREEN);
        pickBeeper();
        turnAround();
        move();
        paintCorner(GREEN);
        move();
        paintCorner(GREEN);
        move();
        paintCorner(GREEN);
        turnRight();
        move();
        turnRight();
    }
}
