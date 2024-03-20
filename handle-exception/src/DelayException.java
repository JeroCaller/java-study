class DelayException {
    public static void methodCaller(int n) {
        System.out.println(getDivideQuotient(n, 0));
    }

    public static int getDivideQuotient(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        methodCaller(10);
    }
}
