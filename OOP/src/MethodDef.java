public class MethodDef {
    public static void main(String[] args) {
        int num = 10;
        int total = getTotal(num);

        System.out.println(total);
        nothing();
    }

    public static int getTotal(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }
        
        return total;
    }

    public static void nothing() {
        System.out.println("nothing");
        return;
    }
}
