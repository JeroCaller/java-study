import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("아무거나 입력한 후 엔터키를 입력.");
        String userInput = scan.nextLine();

        System.out.println("3개의 단어를 공백으로 구분하여 입력.");
        String info1 = scan.next();
        String info2 = scan.next();
        String info3 = scan.next();

        System.out.println("출력 결과");
        System.out.println(userInput);
        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info3);
    }
}
