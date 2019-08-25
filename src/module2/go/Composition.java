package module2.go;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Composition extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;

    public static void main(String[] args) {
        (new Composition()).start(args);
    }

    public void run() {





        sign(getHeight(), getWidth());

    }


    public void sign(int height, int width) {
        GLabel name = new GLabel("Marc Christian Go");
        name.setFont("Segoe Script-18");
        name.setColor(Color.BLACK);
        add(name, width - name.getWidth(), height - name.getHeight());
    }
}