public class MemoryStack {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int sumResult = getSum(a, b);

        System.out.println(sumResult);
    }

    public static int getSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
}
