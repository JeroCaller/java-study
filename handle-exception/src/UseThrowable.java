import java.util.Scanner;

class UseThrowable {
    public static void inputAndPrint() {
        Scanner scan = new Scanner(System.in);

        System.out.println("두 정수 입력.");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int result = getDivide(n1, n2);
        System.out.println(result);
    }

    public static int getDivide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            inputAndPrint();
        } catch(Throwable e) {  // Throwable로 던져진 예외 처리.
            System.out.println("====== 에러 발생 ======");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("======================");
        }
    }
}
