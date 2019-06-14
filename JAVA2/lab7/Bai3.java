package baitap.lab7;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai3 extends Applet {

    Label lblnum;
    TextField txtnum;
    Button btnAdd;

    public void init() {
        // TODO start asynchronous download of heavy resources
        lblnum = new Label("So hang: ");
        txtnum = new TextField(10);
        btnAdd = new Button(" Ve ");       
        this.add(lblnum);
        this.add(txtnum);
        this.add(btnAdd);
        btnAdd.addActionListener(new addlistener());
        //this.setSize(20, 20);
        this.setVisible(true);
    }

    public void paint(Graphics frame) {

        final int MID = 1;
        int TOP = 30;
        final int WIDTH = 300;

        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                frame.setColor(Color.blue);
            } else {
                frame.setColor(Color.red);
            }
            frame.drawLine(MID, TOP, WIDTH, TOP);
            TOP += 30;
        }
    }

    class addlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtnum.getText());
            
            
        }
    }
}
