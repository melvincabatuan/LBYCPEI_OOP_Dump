package module5.port;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;
public class Breakout extends GraphicsProgram {
    // Breakout CONSTANTS
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;


    // Breakout class variables: main actors in the app
    private PaddleClass paddle  = new PaddleClass();
    private BallClass ball = new BallClass();;
    private BrickClass bricks;
    private GLabel scoreCounter;
    private GLabel attemptsLeft;
    // Ball velocity
    private double dx;
    private double dy;
    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();

    // Global Label Values
    private int score;
    private int attempts = 3;

    // variables
    double paddleWidth = paddle.generateWidth();
    double paddleHeight = paddle.generateHeight();
    double paddleYOffeset = paddle.generateOffset();
    double ballRadius = ball.generateRadius();
    double yVelocity= ball.generateYVelocity();
    double xMinVel = ball.generateXMinV();
    double xMaxVel = ball.generateXMaxV();
    double ballDelay = ball.generateDelay();


    @Override
    public void run() {

        setTitle("LBYCPEI Breakout");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        /* You fill this in */
        score = 0;

        generatePaddle();
        generateBricks();
        initializeGame();
        while (true) {
            ballMovement();
        }

    }
    /* You fill this in with methods*/

    private void initializeGame(){
        generateBall();
        generateCounters();
    }

    private void generateBricks() {

        bricks = new BrickClass();
        add(bricks);

    }

    private void generatePaddle() {

        paddle = new PaddleClass();



        double x = (CANVAS_WIDTH - paddleHeight) / 2;
        paddle.setLocation(x, getHeight() - paddleYOffeset);

        add(paddle);

        addMouseListeners();
    }

    private void generateBall() {

        double ballInitXPos = (getWidth() - ballRadius) / 2;
        double ballInitYPos = (getHeight() - ballRadius) / 2;

        add(ball, ballInitXPos, ballInitYPos);
    }

    private void generateCounters() {
        scoreCounter = new GLabel("SCORE: " + score);
        scoreCounter.setFont("Arial-bold-16");
        scoreCounter.setColor(Color.LIGHT_GRAY);
        add(scoreCounter, 0, 12);

        attemptsLeft = new GLabel("ATTEMPTS LEFT: " + score);
        attemptsLeft.setFont("Arial-bold-16");
        attemptsLeft.setColor(Color.LIGHT_GRAY);
        add(attemptsLeft, getWidth() - 115, 12);
    }

    public void mouseMoved(MouseEvent mouse) {
        double mouseX = mouse.getX();
        if (mouseX > (paddleWidth / 2) && mouseX < CANVAS_WIDTH - (paddleWidth / 2) ){
            paddle.setLocation(mouseX - (paddleWidth / 2), getHeight() - (paddleYOffeset + paddleHeight));
        }

    }

    public void mouseClicked(MouseEvent mouse){
        if(dx == 0 && dy == 0) {
            dy = yVelocity;
            dx = rgen.nextDouble(xMinVel, xMinVel);
        }
    }

    private void ballMovement() {

        ball.move(dx, dy);
        scoreCounter.setLabel("SCORE: " + score);
        attemptsLeft.setLabel("Attempts Left " + attempts);

        if (ball.getX() <= 0 || ball.getX() >= CANVAS_WIDTH-ballRadius) {
            dx = -dx;
        }

        if (ball.getY() <= 0) {
            dy = -dy;
        }

        if (ball.getY() >= getHeight()) {

            if(attempts == 1){
                GRect blankScreen = new GRect(CANVAS_WIDTH,CANVAS_HEIGHT);
                blankScreen.setFilled(true);
                blankScreen.setFillColor(Color.black);
                add(blankScreen);

                GLabel losingMessage = new GLabel("Game Over");
                losingMessage.setFont("Times New Roman-bold-60");
                losingMessage.setColor(Color.RED);
                add(losingMessage, (getWidth() - losingMessage.getWidth())/2, (getHeight() - losingMessage.getAscent())/2);
            }

            else if(attempts < 4){
                remove(scoreCounter);
                remove(attemptsLeft);
                initializeGame();
                attempts = attempts - 1;

            }

        }

        if(score >= 200){
            GLabel winningMessage = new GLabel("YOU WIN");
            winningMessage.setFont("Times New Roman-bold-60");
            winningMessage.setColor(Color.BLUE);
            add(winningMessage, (getWidth() - winningMessage.getWidth())/2, (getHeight() - winningMessage.getAscent())/2);
        }

        GObject collider = getCollidingObject();
        GObject colliderBrick = bricks.getBrick(ball.getX(), ball.getY());

        if (collider == paddle) {
            dy = -dy;
        }

        else if (collider == scoreCounter) {

        }

        if (colliderBrick instanceof GImage) {
            bricks.remove(colliderBrick);
            dy = -dy;
            score = score + 1;
        }

        pause (ballDelay);
    }

    private GObject getCollidingObject(){
        if((getElementAt(ball.getX(), ball.getY())) != null) {
            return getElementAt(ball.getX(), ball.getY());
        }
        else{
            return null;
        }
    }

    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Breakout().start(args);
    }
}