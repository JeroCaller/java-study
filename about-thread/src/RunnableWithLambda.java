class RunnableWithLambda {
    public static void main(String[] args) {
        Runnable factorialTask = () -> {
            long total = 1;
            long n = 5;
            for(long i = 2; i <= n; i++) {
                total *= i;
            }
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " : " + total);
        };

        Thread mt = new Thread(factorialTask);
        String mainThread = Thread.currentThread().getName();

        mt.start();
        System.out.println("main : " + mainThread);
    }
}
