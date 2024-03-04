public class LableBreak {
    public static void main(String[] args) {
        // 2부터 n단 까지의 곱셈들을 모두 더하는 프로그램. 
        // 만약 두 숫자의 곱셈 결과가 n을 넘어가면 반복문을 중단하게끔 함.
        int n = 100;
        int total = 0;
        escape: for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= 9; j++) {
                total += i * j;
                if ((i * j) > n) {
                    System.out.printf("마지막 곱셈 : %d * %d = %d\n", i, j, i * j);
                    break escape;
                }
            }
        }
        System.out.println(total);
    }
}
