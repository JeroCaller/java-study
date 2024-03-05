import java.util.Scanner;

public class Calculator {

    static String title = "사칙연산 계산기";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            displayMenu();

            int menuNum = userInput.nextInt();
            if (menuNum == 0) {
                break;
            } else if (menuNum > 4) {
                System.out.println("정해진 메뉴 내 번호를 입력하셔야 합니다.");
                continue;
            }

            System.out.println("두 개의 정수를 공백 한 칸으로 구분하여 입력하세요.");
            int x = userInput.nextInt();
            int y = userInput.nextInt();

            displayResult(menuNum, x, y);
        }
        System.out.printf("%s를 종료하였습니다.", title);
    }

    public static void displayMenu() {
        System.out.println("==========");
        System.out.println(title);
        System.out.println("다음 메뉴 중 원하는 메뉴 번호를 입력 후, 엔터키를 입력하세요.");
        System.out.println("1. 덧셈");
        System.out.println("2. 뺄셈");
        System.out.println("3. 곱셈");
        System.out.println("4. 나누기");
        System.out.println("0. 프로그램 종료");
        System.out.println("==========");
    }

    public static void displayResult(int menu, int a, int b) {
        int result = 0;
        int result2 = 0;
        char operator = 'A';

        switch (menu) {
            case 1:
                result = addNum(a, b);
                operator = '+';
                break;
            case 2:
                result = subtractNum(a, b);
                operator = '-';
                break;
            case 3:
                result = multiplyNum(a, b);
                operator = '*';
                break;
            case 4:
                result = divideNumQ(a, b);
                result2 = divideNumR(a, b);
                operator = '/';
                break;
        }
        System.out.println();  // 개행.
        System.out.println("====== 연산 결과 ======");
        if (menu == 4) {
            System.out.printf("%d %c %d = 몫: %d, 나머지: %d\n", a, operator, b, result, result2);
        } else {
            System.out.printf("%d %c %d = %d\n", a, operator, b, result);
        }
        System.out.println("======================");
    }

    public static int addNum(int a, int b) {
        return a + b;
    }

    public static int subtractNum(int a, int b) {
        return a - b;
    }

    public static int multiplyNum(int a, int b) {
        return a * b;
    }

    public static int divideNumQ(int a, int b) {
        return a / b;
    }

    public static int divideNumR(int a, int b) {
        return a % b;
    }
}
