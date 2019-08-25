package module2.go;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Pyramid extends GraphicsProgram {
    int bricks = 15;
    int bWidth = 30;
    int bHeight = 12;

    public static void main(String[] args) {
        (new Pyramid()).start(args);
    }

    public void run() {
        for (int row = 1; row <= bricks; row++) {
            int rowBricks = bricks - row;

            for (int bricksAmount = 1; bricksAmount <= rowBricks; bricksAmount++) {
                int xBrick = (getWidth() / 2) - (bWidth * rowBricks) / 2 + bricksAmount * bWidth;
                int yBrick = getHeight() - bHeight * row;

                GRect brick = new GRect(xBrick, yBrick, bWidth, bHeight);
                add(brick);
            }

        }

        name(getHeight(), getWidth());
    }

    public void name(int height, int width) {
        GLabel name = new GLabel("Marc Christian Go");
        name.setFont("Segoe Script-18");
        name.setColor(Color.BLACK);
        add(name, width - name.getWidth(), height - name.getHeight());
    }

}