import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableAndFuture {
    public static int getTotal(int n) {
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) 
    throws InterruptedException, ExecutionException {
        Callable<Integer> shortTask = () -> {
            String threadName = Thread.currentThread().getName();
            int total = getTotal(10);
            System.out.println(threadName + " : " + total);
            return total;
        };

        Callable<Integer> midTask = () -> {
            String threadName = Thread.currentThread().getName();
            int total = getTotal(10000);
            System.out.println(threadName + " : " + total);
            return total;
        };

        Callable<Integer> longTask = () -> {
            String threadName = Thread.currentThread().getName();
            int total = getTotal(100000);
            System.out.println(threadName + " : " + total);
            return total;
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Future<Integer> longFuture = threadPool.submit(longTask);
        Future<Integer> shortFuture = threadPool.submit(shortTask);
        Future<Integer> midFuture = threadPool.submit(midTask);

        List<Integer> resultList = Arrays.asList(
            shortFuture.get(), midFuture.get(), longFuture.get()
        );
        System.out.println(resultList);

        threadPool.shutdown();
    }
}
