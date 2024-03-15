public class StringRefCompare {
    public static void main(String[] args) {
        String sayHello1 = new String("Hello");
        String sayHello2 = new String("Hello");
        String sayHello3 = "Hello";
        String sayHello4 = "Hello";

        System.out.println("sayHello1 vs sayHello2");
        if (sayHello1 == sayHello2) {
            System.out.println("match");
        } else {
            System.out.println("dismatch");
        }

        System.out.println("sayHello3 vs sayHello4");
        if (sayHello3 == sayHello4) {
            System.out.println("match");
        } else {
            System.out.println("dismatch");
        }

        System.out.println("sayHello2 vs sayHello3");
        if (sayHello2 == sayHello3) {
            System.out.println("match");
        } else {
            System.out.println("dismatch");
        }
    }
}
