public class FinalClass {
    public static void main(String[] args) {
        ImYourFather obj = new ImYourFather();
        obj.printNumber();
        obj.printSomething();
    }
}

final class NotYourParent {
    int number = 1000;

    void printSomething() {
        System.out.println("This is message from method \"printSomething\" in class \"NotYourParent0");
    }
}

class ImYourFather extends NotYourParent {
    void printSomething() {
        super.printSomething();
        System.out.println("This is from class ImYourFather");
    }

    void printNumber() {
        System.out.println(super.number);
    }
}