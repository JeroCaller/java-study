import java.util.Arrays;

class PipeLine {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5};

        // 주어진 데이터들 중 소수만 감별하여 이 소수들의 합을 구함.
        int totalSum = Arrays.stream(numArr)
                    .filter(n -> {
                        if (n == 1) {
                            return false;
                        }
                        for(int i = 2; i < n; i++) {
                            if(n % i == 0) {
                                return false;
                            }
                        }
                        return true;
                    })
                    .sum();
        System.out.println(totalSum);
    }
}
