package module2.port;/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 05 - 22 - 2019
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class PHFlagvert extends GraphicsProgram {

    public void run() {

        int x = 0;
        int y = 0;

        generateFlag(x,y);

    }

    public void generateFlag(int x, int y){

        generateBlueRectangle(x,y);
        generateRedRectangle(x,y);
        generateTriangle(x,y);
        generateRays(x,y);
        generateCircle(x,y);
        generateStar1(x,y);
        generateStar2(x,y);
        generateStar3(x,y);

    }

    private void generateBlueRectangle(int x, int y){

        GRect square = new GRect(90,400);

        square.setFilled(true);
        square.setFillColor(Color.BLUE);

        add(square, 0 + x, 0 + y);


    }

    private void generateRedRectangle(int x, int y){

        GRect square = new GRect(90,400);

        square.setFilled(true);
        square.setFillColor(Color.RED);

        add(square, 90+x, 0+y);

    }

    public void generateTriangle(int x, int y) {

        GPolygon triangle = new GPolygon();

        triangle.addVertex(0,0);

        triangle.addVertex(180,0);

        triangle.addVertex(90,90 * java.lang.Math.sqrt(3));

        triangle.setColor(Color.WHITE);

        triangle.setFilled(true);

        add(triangle, 0+x, 0+y);

    }

    public void generateCircle(int x, int y){

        GOval sun = new GOval(36,36);

        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);

        add(sun, 72+x, 35+y);

    }

    public void generateStar1(int x, int y) {

        GPolygon star = new GPolygon();

        double size = 15;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;

        star.addVertex(-size / 2, -b * size);

        int angle = 30;
        for (int i = 0; i < 5; i++) {
            star.addPolarEdge(edge, angle);
            star.addPolarEdge(edge, angle + 72);
            angle -= 72;
        }

        star.setColor(Color.YELLOW);

        star.setFilled(true);

        add(star, 28+x, 18+y);

    }


    public void generateStar2(int x, int y) {

        GPolygon star = new GPolygon();

        double size = 15;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;

        star.addVertex(-size / 2, -b * size);

        int angle = -35;
        for (int i = 0; i < 5; i++) {
            star.addPolarEdge(edge, angle);
            star.addPolarEdge(edge, angle + 72);
            angle -= 72;
        }

        star.setColor(Color.YELLOW);

        star.setFilled(true);

        add(star, 93+x,120+y);

    }

    public void generateStar3(int x, int y) {

        GPolygon star = new GPolygon();

        double size = 15;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;

        star.addVertex(-size / 2, -b * size);

        int angle = 15;
        for (int i = 0; i < 5; i++) {
            star.addPolarEdge(edge, angle);
            star.addPolarEdge(edge, angle + 72);
            angle -= 72;
        }

        star.setColor(Color.YELLOW);

        star.setFilled(true);

        add(star, 150+x, 18+y);

    }

    public void generateRays(int x, int y) {

        GPolygon ray = new GPolygon();

        double size = 25;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;

        ray.addVertex(-size / 2, -b * size);

        int angle = 0;
        for (int i = 0; i < 8; i++) {
            ray.addPolarEdge(edge, angle);
            ray.addPolarEdge(edge, angle + 45);
            angle -= 45;
        }

        ray.setColor(Color.YELLOW);

        ray.setFilled(true);

        add(ray, 86+x, 40+y);

    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError 
        (new PHFlagvert()).start(args);
    }

}