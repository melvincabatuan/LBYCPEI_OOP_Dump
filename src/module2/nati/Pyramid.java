package module2.nati;

import acm.program.*;
import acm.graphics.GRect;
import acm.graphics.GLabel;

public class Pyramid extends GraphicsProgram{

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;
    private static final int bWidth = 30;
    private static final int bHeight = 12;

    public void run()
    {
        int brickCount = 14;
        int level = (APPLICATION_HEIGHT -(bHeight*brickCount))/2+100;
        int offset = (APPLICATION_WIDTH -(bWidth*brickCount))/2;

        GLabel name = new GLabel("Justin Aaron S. Natividad");
        add(name,APPLICATION_WIDTH-150,APPLICATION_HEIGHT-50);

        while(brickCount>0)
        {
            for(int i = 0; i<brickCount; i++)
            {
                GRect brick = new GRect(bWidth,bHeight);
                add(brick,bWidth*i+offset,level);
            }
            level -= bHeight;
            brickCount--;
            offset+=bWidth/2;
        }
    }

    public static void main(String[] args)
    {
        (new Pyramid()).start(args);
    }


}
