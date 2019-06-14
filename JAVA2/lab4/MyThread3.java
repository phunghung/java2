package baitap.lab4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread3 {

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public synchronized void DisplayNumber() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            setN(i);
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread3.class.getName()).log(Level.SEVERE, null, ex);
            }
            notify();
        }
    }

    public synchronized void DisplayString() {
        for (int i = 1; i <= 10; i++) {
            if (getN() % 2 == 0) {
                System.out.println("Chan");
            } else {
                System.out.println("Le");
            }
            notify();
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        final MyThread3 objThread = new MyThread3();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                objThread.DisplayNumber();
            }
        };
        thread1.start();

        Thread Thread2 = new Thread() {
            @Override
            public void run() {
                objThread.DisplayString();
            }
        };
        Thread2.start();
    }
}
