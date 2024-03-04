public class For {
    public static void main(String[] args) {
        int total = 0;
        int n = 100;

        // for문 사용 예1. 1부터 100까지 연속된 자연수들을 모두 더하기.
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println(total);

        // for문 사용 예2. 초기식을 생략하고, 증감식 자리에 연산식을 사용.
        int j = 1;
        int total2 = 0;
        for(; j <= n; j = j + 1) {
            total2 += j;
        }
        System.out.println(total2);
    }
}
