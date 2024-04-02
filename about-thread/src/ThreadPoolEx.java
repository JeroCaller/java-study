import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolEx {
    public static int getTotal(int n) {
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Runnable shortTask = () -> {
            String threadName = Thread.currentThread().getName();
            int total = getTotal(10);
            System.out.println(threadName + " : " + total);
        };

        Runnable midTask = () -> {
            String threadName = Thread.currentThread().getName();
            int total = getTotal(1000);
            System.out.println(threadName + " : " + total);
        };

        Runnable longTask = () -> {
            String threadName = Thread.currentThread().getName();
            int total = getTotal(10000);
            System.out.println(threadName + " : " + total);
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.submit(longTask);
        threadPool.submit(shortTask);
        threadPool.submit(midTask);

        threadPool.shutdown();
    }
}
