public class While {
    public static void main(String[] args) {
        // 1부터 n까지의 자연수 중, 소수만을 더하는 프로그램.
        int n = 100;
        int total = 0;
        int i = 1;
        int root;
        boolean isPrime;

        while(i <= n) {
            // 해당 숫자가 소수인지 판별.
            root = (int)Math.sqrt(i);
            isPrime = false;
            for (int j = 2; j <= root; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (i == 2 || i == 3) {
                isPrime = true;
            }

            if (isPrime) {
                total += i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("결과 : " +total);
    }
}
