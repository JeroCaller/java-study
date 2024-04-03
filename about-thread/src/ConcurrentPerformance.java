import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ConcurrentPerformance {
    public static Map<String, Integer> syncMap = 
        Collections.synchronizedMap(new HashMap<>());
    public static Map<String, Integer> concMap =
        new ConcurrentHashMap<>();
    
    public static void timeTest(Map<String, Integer> mapObj) 
        throws InterruptedException 
    {
        String threadName = Thread.currentThread().getName();
        int repeat = 10000;
        int threadNum = 3;

        System.out.println(threadName + " 스레드 실행 시작.");
        Instant timeStart = Instant.now();

        Runnable insertData = () -> {
            for(int i = 0; i < repeat; i++) {
                mapObj.put(String.valueOf(i), i);
            }
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(threadNum);
        for(int i = 0; i < threadNum; i++) {
            threadPool.submit(insertData);
        }

        threadPool.shutdown();
        threadPool.awaitTermination(100, TimeUnit.SECONDS);

        Instant timeEnd = Instant.now();
        System.out.println("작업 끝. 걸린 시간 : " + Duration.between(timeStart, timeEnd).toMillis());
    }

    public static void main(String[] args) throws InterruptedException {
        timeTest(syncMap);
        timeTest(concMap);
    }
}
