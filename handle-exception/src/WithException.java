import java.util.InputMismatchException;
import java.util.Scanner;

class WithException {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("정수 2개를 입력하세요.");
        try {
            int n1 = userInput.nextInt();
            int n2 = userInput.nextInt();
            int result = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch(Exception e) {
            System.out.println("========= 예외 발생 =========");
            System.out.println("자세한 사항은 다음 에러 메시지를 참고.\n");
            e.printStackTrace();
            System.out.println("============================");
        }
    }
}
