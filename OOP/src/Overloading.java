class TotalObj {

    /**
     * 1부터 n까지의 자연수를 모두 더한 값을 반환.
     * @param n 자연수
     * @return 1부터 n까지의 모든 자연수의 합.
     */
    int getTotalOfSeries(int n) {
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    /**
     * 정수 start부터 end까지의 모든 정수를 더한 값을 반환.
     * @param start 시작 부분의 정수
     * @param end 끝 부분의 정수
     * @return start부터 end까지의 모든 정수들의 합
     */
    int getTotalOfSeries(int start, int end) {
        int total = 0;
        for(int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }

    /**
     * 0부터 정수 또는 실수 n까지 interval 간격으로 존재하는 모든 실수
     * 또는 정수들을 모두 더한 값을 반환.
     * @param n  합의 끝 부분이 되는 실수.
     * @param interval  간격
     * @return  0부터 n까지의 interval 간격으로 더한 결과값.
     */
    double getTotalOfSeries(double n, double interval) {
        double total = 0.0;
        for(double i = 0.0; i <= n; i = i + interval) {
            total += i;
        }
        return total;
    }
}

public class Overloading {
    public static void main(String[] args) {
        TotalObj calc = new TotalObj();
        int s1 = calc.getTotalOfSeries(100);
        int s2 = calc.getTotalOfSeries(-5, 100);
        double s3 = calc.getTotalOfSeries(10.5, 3.3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
