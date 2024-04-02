public class ThreadsUsingCommonData {
    public static int hp = 1;

    public static void main(String[] args) throws InterruptedException {
        int endLimit = 100000;

        Runnable heal = () -> {
            for(int i = 0; i < endLimit; i++) {
                hp++;
            }
        };
        
        Runnable attack = () -> {
            for(int i = 0; i < endLimit; i++) {
                hp--;
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
