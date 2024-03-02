public class SCE {
    public static void main(String[] args) {
        // Short-Circuit Evalution 예제
        int math = 90;
        int english = 95;

        // 조건문 1
        if (math++ % 2 == 0 || english++ % 2 == 0) {
            System.out.println("적어도 점수 하나는 짝수이다.");
        } else {
            System.out.println("모든 점수가 홀수이다.");
        }
        System.out.println("math: " + math);
        System.out.println("english: " + english);
        System.out.println("=========");

        // 조건문 2
        if (math++ >= 100 && english++ >= 100) {
            System.out.println("점수가 이상합니다.");
        }
        System.out.println("math: " + math);
        System.out.println("english: " + english);
    }
}
