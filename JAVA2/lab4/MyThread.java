package baitap.lab4;

public class MyThread implements Runnable{
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
    
    public static void main(String[] args) {
        MyThread objThread1 = new MyThread();
        MyThread objThread2 = new MyThread();
        
        Thread thread1 = new Thread(objThread1);
        Thread thread2 = new Thread(objThread2);
        
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        
        thread1.start();
        thread2.start();
                
    }
}


