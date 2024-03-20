class ExceptionVar {
    public static int getDivide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        try {
            int result = getDivide(1, 0);
        } catch(ArithmeticException arEx) {
            System.out.println(arEx instanceof ArithmeticException);
            System.out.println(arEx instanceof Exception);
        }
    }
}
