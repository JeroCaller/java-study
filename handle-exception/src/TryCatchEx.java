import java.util.InputMismatchException;
import java.util.Scanner;

class TryCatchEx {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("정수 2개를 입력하세요.");
        try {
            int n1 = userInput.nextInt();
            int n2 = userInput.nextInt();
            int result = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch(ArithmeticException arEx) {
            String strExMsg = arEx.getMessage();
            System.out.println(strExMsg);
            if (strExMsg.equals("/ by zero")) {
                System.out.println("예외 : 분모에 0이 들어가선 안됩니다.");
            }
        } catch(InputMismatchException inputEx) {
            System.out.println(inputEx.getMessage());
            inputEx.printStackTrace();
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
