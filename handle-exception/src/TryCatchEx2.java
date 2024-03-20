import java.util.InputMismatchException;
import java.util.Scanner;

class TryCatchEx2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("정수 2개를 입력하세요.");
        try {
            int n1 = userInput.nextInt();
            int n2 = userInput.nextInt();
            int result = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch (ArithmeticException | InputMismatchException ex) {
            System.out.println("==========");
            ex.printStackTrace();
            System.out.println("==========");
        }
    }
}
