package module2.nati;

import acm.graphics.GLabel;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class Composition extends GraphicsProgram{

    public void run()
    {
        GPolygon open = new GPolygon();
        open.addVertex(100,0);
        open.addVertex(0,0);
        open.addVertex(0,100);
        open.addVertex(100,100);
        open.addVertex(100,99);
        open.addVertex(1,99);
        open.addVertex(1,1);
        open.addVertex(99,1);

        GPolygon line = new GPolygon();
        line.addVertex(0,0);
        line.addVertex(0,100);

        GLabel explanation = new GLabel("Composition: A box without its side is not a box.");

        add(open, 50, 50);
        add(line, 200, 50);
        add(explanation, 50, 200);
    }

    public static void main(String[] args)
    {
        (new Composition()).start(args);
    }

}
