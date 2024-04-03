import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ASyncCollectionObj {
    public static List<Integer> unitsHp = new ArrayList<>();

    public static void initFillList(List li, int num, int liSize) {
        li.clear();
        for(int i = 0; i < liSize; i++) {
            li.add(num);
        }
    }

    public static synchronized void doHeal() {
        ListIterator<Integer> itr = unitsHp.listIterator();
        while(itr.hasNext()) {
            itr.set(itr.next() + 1);
        }
    }

    public static synchronized void doAttack() {
        ListIterator<Integer> itr = unitsHp.listIterator();
        while(itr.hasNext()) {
            itr.set(itr.next() - 1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int endLimit = 1000;

        initFillList(unitsHp, 1, 10);

        Runnable heal = () -> {
            for(int i = 0; i < endLimit; i++) {
                doHeal();
            }
        };

        Runnable attack = () -> {
            for(int i = 0; i < endLimit; i++) {
                doAttack();
            }
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.submit(heal);
        threadPool.submit(attack);
        
        threadPool.shutdown();

        // 스레드 풀 내 모든 작업들이 다 완료될 때까지 그 뒤의 코드를 실행시키지 않고 대기.
        threadPool.awaitTermination(100, TimeUnit.SECONDS);

        System.out.println(unitsHp);
    }
}
