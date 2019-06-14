package baitap.lab7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Bai1 extends Applet {

    public void paint(Graphics frame) {
        
        // vi tri giua & tren cua snowman
        final int MID = 150;	
        final int TOP = 50;
        
        //  mau nen background
        setBackground(Color.cyan);

        // mau nen HCN
        frame.setColor(Color.blue);
        // HCN
        frame.fillRect(1, 175, 300, 50);
        
        //  ve 3 phan than
        frame.setColor(Color.white);

        // ve dau
        frame.fillOval(MID - 20, TOP, 40, 40);
        // ve than giua
        frame.fillOval(MID - 35, TOP + 35, 70, 50);
        // ve than duoi
        frame.fillOval(MID - 50, TOP + 80, 100, 60);

        
        frame.setColor(Color.black);

	//  ve mat
        // mat trai
        frame.fillOval(MID - 10, TOP + 10, 5, 5);
        // mat phai
        frame.fillOval(MID + 5, TOP + 10, 5, 5);

        // ve mieng
        frame.drawArc(MID - 10, TOP + 20, 20, 10, 190, 160);

	//  ve canh tay
        // tay trai
        frame.drawLine(MID - 25, TOP + 60, MID - 50, TOP + 40);
        // tay phai
        frame.drawLine(MID + 25, TOP + 60, MID + 55, TOP + 300);

	//  ve mu
        // ve vanh mu
        frame.drawLine(MID - 20, TOP + 5, MID + 20, TOP + 5);
        // ve mu
        frame.fillRect(MID - 15, TOP - 20, 30, 25);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
