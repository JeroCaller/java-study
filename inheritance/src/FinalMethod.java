public class FinalMethod {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.tryToPrintFinal();
        // sub.tryToPrintPrivate(); 에러 발생 부분.
    }
}

class SuperClass {
    final void printFinal() {
        System.out.print("Hi from printFinal");
    }

    private void printPrivate() {
        System.out.println("Hi from printPrivate");
    }
}

class SubClass extends SuperClass {
    // java.lang.IncompatibleClassChangeError
    // 다음의 코드는 에러 발생.
    //void printFinal() {
    //    System.out.println("Hi from printFinal in SubClass");
    //}

    void tryToPrintFinal() {
        super.printFinal();  // final로 정의된 메서드 호출은 가능.
    }

    // 다음의 코드는 에러 발생.
    //void tryToPrintPrivate() {
    //    super.printPrivate();  // 에러 발생 부분.
    //}
}