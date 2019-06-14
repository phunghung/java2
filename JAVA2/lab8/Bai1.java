package baitap.lab8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bai1 {
    JFrame jframe;
    JButton btnClick;
    JLabel lblMessage;
    private int count;
    
    Bai1() {
        jframe = new JFrame("Count button hit");
        lblMessage = new JLabel("Click to the button");
        lblMessage.setFont(new Font("Arial", 1, 25));
        btnClick = new JButton("Click Here");
        btnClick.setFont(new Font("Arial", 1, 25));
        count = 0;
        jframe.add(btnClick, BorderLayout.CENTER);
        jframe.add(lblMessage, BorderLayout.SOUTH);
        btnClick.addActionListener(new actionButton());
        jframe.setSize(300, 200);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
    class actionButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ++count;
            lblMessage.setText("You have clicked: " + count);          
        }
    }
    
    public static void main(String[] args) {
        Bai1 objBai1 = new Bai1();
    }
}
