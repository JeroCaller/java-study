import java.util.Random;

class ExceptionEx {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = 22;
        int n2 = rand.nextInt(2);
        int result = n1 / n2;
        System.out.printf("%d / %d = %d\n", n1, n2, result);

    }
}
