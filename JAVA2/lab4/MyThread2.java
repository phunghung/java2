package baitap.lab4;

public class MyThread2 extends Thread {

    public static void main(String[] args) {

        MyThread2 objThread = new MyThread2();

        Thread thread1 = new Thread() {
            public void run() {
                synchronized (this) {
                    for (int i = 1; i <= 10; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }

}
