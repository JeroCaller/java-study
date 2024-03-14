package sublib.mathtools.add;

public class CalcTotal {
    /**
     * 1 부터 n까지의 모든 자연수를 더한 값을 반환.
     * @param n
     * @return int
     */
    public int getTotal(int n) {
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}
