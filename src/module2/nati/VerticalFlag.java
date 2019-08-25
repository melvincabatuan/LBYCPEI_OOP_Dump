package module2.nati;

import acm.program.GraphicsProgram;

public class VerticalFlag extends GraphicsProgram{

//    public void addRectangles(GCanvas canvas, double width, double height, int x, int y)
//    {
//        // rectangle dimensions
//        double rWidth  = width/2;
//        double rHeight = height;
//
//        // create object
//        GRect leftRectangle  = new GRect(rWidth, rHeight);
//        GRect rightRectangle = new GRect(rWidth, rHeight);
//
//        // give color
//        leftRectangle.setColor(Color.BLUE);
//        rightRectangle.setColor(Color.RED);
//        leftRectangle.setFillColor(Color.BLUE);
//        rightRectangle.setFillColor(Color.RED);
//
//        leftRectangle.setFilled(true);
//        rightRectangle.setFilled(true);
//
//        // add object
//        canvas.add(leftRectangle ,x,y);
//        canvas.add(rightRectangle,x+rWidth,y);
//    }
//
//    public double pythagorean(double width)
//    {
//        // hypotenuse = width
//
//        double c = width;
//        double b = width/2;
//
//        // c^2 - b^2 = a^2
//
//        double a = Math.sqrt((c*c)-(b*b));
//
//        return a;
//    }
//
//    public void addTriangle(GCanvas canvas, double width, double height, int x, int y)
//    {
//        GPolygon triangle = new GPolygon();
//
//        double triangleVertex = pythagorean(width);
//
//        // vertex 1 LEFT
//        triangle.addVertex(0,0);
//        // vertex 2 RIGHT
//        triangle.addVertex(width,0);
//        // vertex 3 PYTHAGOREAN VERTEX
//        triangle.addVertex(width/2,triangleVertex);
//
//        // give color
//        triangle.setColor(Color.WHITE);
//        triangle.setFillColor(Color.WHITE);
//
//        triangle.setFilled(true);
//
//        // add triangle
//        canvas.add(triangle,x,y);
//    }
//
//    public void addSun(GCanvas canvas, double width, double height, int x, int y)
//    {
//        // sun's diameter is 1/10 the height
//        double d = height/10;
//        // sun's ray diameter is 1/18 the height
//        double rayD = (d/2)+(height/18);
//        // sun's distance from top of flag is 1/9.47
//        double yOffset = height/9.47;
//        // xOffset for centering
//        double xOffset = (width - d)/2;
//
//        // initialize circle
//        GOval circle = new GOval(d,d);
//
//        // add GRays
//        for(int i=0; i<360; i+=360/8)
//        {
//            GRay ray = new GRay(rayD,i);
//
//            canvas.add(ray, x+xOffset+(d/2), y+yOffset+(d/2));
//        }
//
//        // give color
//        circle.setColor(Color.YELLOW);
//        circle.setFillColor(Color.YELLOW);
//        circle.setFilled(true);
//
//        canvas.add(circle, x+xOffset, y+yOffset);
//    }
//
//    public void addStars(GCanvas canvas, double width, double height, int x, int y)
//    {
//        double cCirc = height/36;
//        double iCirc = cCirc*0.5;
//        double offset = height/12.86;
//        double verticalOffset = height/18;
//        double verticalOffset2 = height/12.86;
//        double vertex = pythagorean(width);
//        GStar lStar = new GStar(cCirc,iCirc,0);
//        GStar rStar = new GStar(cCirc,iCirc,0);
//        GStar bStar = new GStar(cCirc,iCirc,270);
//
//        canvas.add(lStar,x+offset,y + verticalOffset);
//        canvas.add(rStar,x+width-offset,y + verticalOffset);
//        canvas.add(bStar,x+width/2,y+vertex-verticalOffset2);
//    }
//
//    public void render(GCanvas canvas, double width, double height, int x, int y)
//    {
//        addRectangles(canvas,width,height,x,y);
//        addTriangle(canvas,width,height,x,y);
//        addSun(canvas,width,height,x,y);
//        addStars(canvas,width,height,x,y);
//    }
//
//    public void run()
//    {
//        GCanvas gc = new GCanvas();
//        render(gc,400,800,0,0);
//    }
//
//    public static void main(String[] args)
//    {
//        (new VerticalFlag()).start(args);
//    }

}
