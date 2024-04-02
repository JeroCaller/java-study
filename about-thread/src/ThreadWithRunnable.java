class MyThread2 implements Runnable {
    public long factorial(int n) {
        if (n < 0) {
            // 음수의 팩토리얼은 이 메서드에서는 구할 수 없음.
            return -1;
        }
        long total = 1;
        for(int i = 2; i <= n; i++) {
            total *= i;
        }
        return total;
    }
    
    @Override
    public void run() {
        long total = factorial(5);
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " : " + total);
    }
}

class ThreadWithRunnable {
    public static void main(String[] args) {
        Thread mt = new Thread(new MyThread2());
        String mainThread = Thread.currentThread().getName();
        mt.start();
        System.out.println("main : " + mainThread);
    }
}
