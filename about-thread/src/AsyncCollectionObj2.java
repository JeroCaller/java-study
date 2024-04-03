import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class AsyncCollectionObj2 {
    public static List<Integer> myList = new ArrayList<>();

    public static void fillList(List li, int num, int liSize) {
        li.clear();
        for(int i = 0; i < liSize; i++) {
            li.add(num);
        }
    }

    public static synchronized void appendOne() {
        myList.add(1);
    }

    public static synchronized void removeOne() {
        myList.remove(myList.size()-1);
    }

    public static void main(String[] args) throws InterruptedException {
        int endLimit = 100;

        fillList(myList, 1, 3);
        System.out.println(myList);
        System.out.println(myList.size());

        Runnable add = () -> {
            for(int i = 0; i < endLimit; i++) {
                appendOne();
            }
        };

        Runnable remove = () -> {
            for(int i = 0; i < endLimit; i++) {
                removeOne();
            }
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.submit(add);
        threadPool.submit(remove);

        threadPool.shutdown();

        // 스레드 풀 내 모든 작업들이 다 완료될 때까지 그 뒤의 코드를 실행시키지 않고 대기.
        threadPool.awaitTermination(100, TimeUnit.SECONDS);

        System.out.println(myList);
        System.out.println(myList.size());
    }
}
