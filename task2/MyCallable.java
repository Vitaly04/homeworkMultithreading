package task2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    Integer count = 0;
    @Override
    public Integer call() throws Exception {
        Thread.currentThread().setName("Поток " + Thread.activeCount());
        Thread.sleep(2500);
        System.out.println("Я " + Thread.currentThread().getName() + ", Всем привет!" );
        count++;
        return count;
    }
}
