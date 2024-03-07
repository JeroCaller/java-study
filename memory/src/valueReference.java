public class valueReference {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = n1;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println("=======");

        n2 = 30;
        System.out.println(n1);
        System.out.println(n2);
    }
}
