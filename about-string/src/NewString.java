public class NewString {
    public static void main(String[] args) {
        String sayHello1 = new String("Hello");
        String sayHello2 = new String("Hello");
        String sayHello3 = "Hello";
        String sayHello4 = "Hello";

        System.out.println(sayHello1 + " " + System.identityHashCode(sayHello1));
        System.out.println(sayHello2 + " " + System.identityHashCode(sayHello2));
        System.out.println(sayHello3 + " " + System.identityHashCode(sayHello3));
        System.out.println(sayHello4 + " " + System.identityHashCode(sayHello4));
    }
}
