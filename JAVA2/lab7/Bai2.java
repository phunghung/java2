package baitap.lab7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

public class Bai2 extends Applet {

    public void init() {
        // TODO start asynchronous download of heavy resources
    }   
    // TODO overwrite start(), stop() and destroy() methods
    
    public void paint(Graphics frame) {
        
        final int MID = 1;	
        int TOP = 30;
        final int WIDTH = 300;
        
        int n = 5;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                frame.setColor(Color.blue);
            }
            else {
                frame.setColor(Color.red);
            }           
            frame.drawLine(MID, TOP, WIDTH, TOP);
            TOP += 30;
        }
    }
}
