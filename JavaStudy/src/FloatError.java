public class FloatError {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 100;
        System.out.println(a * b);

        double total = 0.0;
        for (int i = 0; i < 100; i++) {
            total = total + 0.1;
        }
        System.out.print(total);
    }
}
