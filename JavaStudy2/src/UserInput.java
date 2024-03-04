import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);  // Scanner 객체 생성.

        // 한 줄씩 나눠서 입력해도 되고, 한 줄에 공백 또는 탭으로 구분하여 작성해도 됨.
        // 입력 예1)
        // 1
        // 2
        // 입력 예2)
        // 1 2
        System.out.println("정수를 총 두 번 입력하고, 각각 엔터키를 입력.");

        int a = userInput.nextInt();  // 숫자 입력을 받음.
        int b = userInput.nextInt();

        System.out.printf("입력한 숫자들: %d %d", a, b);
    }
}
