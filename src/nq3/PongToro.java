package nq3;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PongToro extends GraphicsProgram {

    // PongGo CONSTANTS
    private static final double CANVAS_WIDTH = 640;
    private static final double CANVAS_HEIGHT = 720;
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30;    // from bottom
    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 3.0;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;
    private static final int BALL_DELAY = 1000 / 60;

    // PongGo class variables: main actors in the app
    private GRect paddle;
    private GRect comp;
    private GOval ball;
    // Ball velocity
    private double dx;
    private double dy;
    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        setUpGame();
        while (true) {
            setUpBall();
            setUpComp();
            displayClickConfirmation();
            runGame();
        }
    }

    private void setUpGame() {
        setTitle("LBYCPEI PongGo");
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);

        // Set Up Paddle
        paddle = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
        paddle.setFilled(true);
        add(paddle, (CANVAS_WIDTH / 2) - (PADDLE_WIDTH / 2), CANVAS_HEIGHT - PADDLE_HEIGHT - PADDLE_Y_OFFSET);
        addMouseListeners();
    }

    private void setUpBall() {
        ball = new GOval(BALL_RADIUS * 2, BALL_RADIUS * 2);
        ball.setFilled(true);
        ball.setFillColor(Color.GREEN);
        add(ball, (CANVAS_WIDTH / 2) - BALL_RADIUS, (CANVAS_HEIGHT / 2) - BALL_RADIUS);
    }

    private void setUpComp() {
        comp = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
        comp.setFilled(true);
        add(comp, (CANVAS_WIDTH / 2) - (PADDLE_WIDTH / 2), PADDLE_Y_OFFSET);
    }

    private void runGame() {
        //AudioClip hitSound = MediaTools.loadAudioClip("assets/boop.wav");                                             // DOES NOT WORK ON LATEST JAVA VERSIONS
        dx = rgen.nextDouble(VELOCITY_X_MIN + 0.1, VELOCITY_X_MAX);
        dy = VELOCITY_Y;
        while (true) {
            ball.move(dx, dy);

            if (ball.getX() <= 0 || ball.getX() >= CANVAS_WIDTH - (BALL_RADIUS * 2)) {
                dx *= -1;
            }

            if (ball.getY() > CANVAS_HEIGHT || ball.getY() < 0 - (BALL_RADIUS * 2)) {
                remove(ball);
                remove(comp);
                return;
            }

            if (ball.getX() >= comp.getX() + (comp.getWidth() / 2)) {
                comp.move(dx, 0);
            }

            if (ball.getX() < comp.getX() + (comp.getWidth() / 2)) {
                comp.move(-dx, 0);
            }

            GObject collider = getCollidingObject();
            if (collider != null) {
                if (ball.getY() <= CANVAS_HEIGHT - PADDLE_Y_OFFSET - PADDLE_HEIGHT - (BALL_RADIUS * 2)){
                    //hitSound.play();                                                                                  // DOES NOT WORK ON LATEST JAVA VERSIONS
                    dy *= -1;
                }
            }

            pause(BALL_DELAY);
        }
    }

    private GObject getCollidingObject() {
        if((getElementAt(ball.getX(), ball.getY())) != null) {
            return getElementAt(ball.getX(), ball.getY());
        }
        else if (getElementAt( (ball.getX() + BALL_RADIUS*2), ball.getY()) != null ) {
            return getElementAt(ball.getX() + BALL_RADIUS * 2, ball.getY());
        }
        else if(getElementAt((ball.getX() + BALL_RADIUS*2), (ball.getY() + BALL_RADIUS*2)) != null ){
            return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY() + BALL_RADIUS*2);
        }
        else if(getElementAt(ball.getX(), (ball.getY() + BALL_RADIUS*2)) != null ){
            return getElementAt(ball.getX(), ball.getY() + BALL_RADIUS*2);
        }
        else{
            return null;
        }
    }

    private void displayClickConfirmation() {
        GLabel confirmation = new GLabel("LEFT CLICK TO START");
        confirmation.setFont("*-bold-20");
        add(confirmation, (CANVAS_WIDTH - confirmation.getWidth()) / 2, ((CANVAS_HEIGHT - confirmation.getHeight()) / 2) - 50);
        waitForClick();
        remove(confirmation);
    }

    public void mouseMoved(MouseEvent mouse) {
        // Get the x coordinate of the mouse
        double mouseX = mouse.getX();
        if ((mouseX >= PADDLE_WIDTH / 2) && (mouseX <= CANVAS_WIDTH - (PADDLE_WIDTH / 2))) {
            paddle.setLocation(mouseX - (PADDLE_WIDTH / 2), CANVAS_HEIGHT - PADDLE_HEIGHT - PADDLE_Y_OFFSET);
        }
    }

    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new PongToro().start(args);
    }
}
