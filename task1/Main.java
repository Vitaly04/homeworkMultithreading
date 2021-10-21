package task1;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadGroup group1 =new ThreadGroup("group 1");
        MyThread myThread1 = new MyThread();
        myThread1.setName("поток 1");
        MyThread myThread2 = new MyThread();
        myThread2.setName("поток 2");
        MyThread myThread3 = new MyThread();
        myThread3.setName("поток 3");
        MyThread myThread4 = new MyThread();
        myThread4.setName("поток 4");
        final Thread thread1 =new Thread(group1, myThread1);
        final Thread thread2 =new Thread(group1, myThread2);
        final Thread thread3 =new Thread(group1, myThread3);
        final Thread thread4 =new Thread(group1, myThread4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
            group1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
