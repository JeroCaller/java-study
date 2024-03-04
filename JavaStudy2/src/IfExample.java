public class IfExample {
    public static void main(String[] args) {
        int num = 11;

        if (num % 2 == 0)
            System.out.println("짝수");
        else
            System.out.println("홀수");

        if (num % 2 == 1) System.out.println("홀수");
        else System.out.println("짝수");
    }
}
