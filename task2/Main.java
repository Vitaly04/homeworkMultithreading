package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Callable<Integer>> list = new ArrayList<>();
        MyCallable myCallable = new MyCallable();
        while (true) {
            ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            list.add(myCallable);
            Integer resultTask = threadPool.invokeAny(list);
            if (resultTask > 20) {
                threadPool.shutdown();
                System.out.println(resultTask);
                break;
            }
        }
    }
}
