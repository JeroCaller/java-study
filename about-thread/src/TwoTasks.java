class TwoTasks {
    public static void main(String[] args) {
        Runnable thread1 = () -> {
            String threadName = Thread.currentThread().getName();
            int n = 10;
            for(int i = 0; i < n; i++) {
                System.out.printf("From %s : %d\n", threadName, i);
            }
        };

        Runnable thread2 = () -> {
            String threadName = Thread.currentThread().getName();
            int n = 10;
            for(int i = n; i > 0; i--) {
                System.out.printf("From %s : %d\n", threadName, i);
            }
        };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}
