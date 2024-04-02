class MainThread {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 스레드 이름 : " + threadName);
    }
}