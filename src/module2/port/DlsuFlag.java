package module2.port;/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 05 - 22 - 2019
 */

import acm.graphics.*;

import java.awt.*;

public class DlsuFlag extends PHFlagvert {

    public static final int APPLICATION_WIDTH = 640;

    public static final int APPLICATION_HEIGHT = 832;

    public void run() {

        addImageMain(0,0);

        //addImage300(290,399);

        addImageLaSalle(271,558);

        generateFlag(62, 384);

        generateFlag(416, 385);

        addDLSUText(61,305);

    }

    private void addImageMain(int x, int y){

        GImage addImages = new GImage("assets/DLSU2.png");

        add(addImages, x, y);

    }

//    private void addImage300(int x, int y){
//        GImage addImages = new GImage("300.jpg");
//
//        addImages.scale(0.0425, 0.0425);
//
//        add(addImages, x, y);
//    }

    private void addImageLaSalle(int x, int y){
        GImage addImages = new GImage("lasalle.jpg");

        addImages.scale(0.5, 0.5);

        add(addImages, x, y);
    }


    private void addDLSUText(int x, int y){

        GRect grayRect = new GRect(549, 36);

        grayRect.setFilled(true);
        grayRect.setFillColor(Color.GRAY);

        add(grayRect, x,y);

        GLabel DLSUText = new GLabel("DE LA SALLE UNIVERSITY");

        DLSUText.setFont("Times New Roman-28");

        DLSUText.setColor(Color.DARK_GRAY);

        add(DLSUText, 110+x, 27+y);

    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError 
        (new DlsuFlag()).start(args);
    }

}