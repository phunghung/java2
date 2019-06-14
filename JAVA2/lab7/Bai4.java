package baitap.lab7;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

public class Bai4 extends Applet {

    Label lblnum, lblrsDT, lblrsCV;
    TextField txtnum, txtrsDT, txtrsCV;
    Button btnAdd;

    public void init() {
        // TODO start asynchronous download of heavy resources
        lblnum = new Label("Ban kinh: ");
        txtnum = new TextField(10);
        btnAdd = new Button(" Result "); 
        
        lblrsDT = new Label("Dien tich hinh tron: ");
        txtrsDT = new TextField(10);
        
        lblrsCV = new Label("Chu vi hinh tron: ");
        txtrsCV = new TextField(10);
          
        BoxLayout b = new BoxLayout(this, BoxLayout.Y_AXIS);

        this.setLayout(b);
        this.add(lblnum); this.add(txtnum);
        this.add(lblrsDT); this.add(txtrsDT);
        this.add(lblrsCV); this.add(txtrsCV);
        this.add(btnAdd);
        btnAdd.addActionListener(new addlistener());
        this.setSize(300, 200);
        this.setVisible(true);
    }

    class addlistener implements ActionListener { //inner class
        @Override
        public void actionPerformed(ActionEvent e) {
            double bk = Double.parseDouble(txtnum.getText());
            double dt = Math.PI * Math.pow(bk, 2);
            txtrsDT.setText(dt + "");
            double cv = 2 * Math.PI * bk;
            txtrsCV.setText(cv + "");
            
            
        }
    }
}
