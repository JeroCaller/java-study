import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
    public static ReentrantLock threadLock = new ReentrantLock();
    public static int hp = 1;

    public static void doHeal() {
        threadLock.lock();
        hp++;
        threadLock.unlock();
    }

    public static void doAttack() {
        threadLock.lock();
        hp--;
        threadLock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        int endLimit = 100000;

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

        Thread healThread = new Thread(heal);
        Thread attackThread = new Thread(attack);

        healThread.start();
        attackThread.start();

        // Thread의 종료를 기다린다. 
        // 이로 인해 그 뒤의 코드는 thread들이 종료되어야 실행될 수 있다.
        healThread.join();
        attackThread.join();

        System.out.println(hp);
    }
}
