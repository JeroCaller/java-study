@FunctionalInterface
interface PrintBluePrint {
    void printSomething(String s);
    // void printAnother(String str); // 에러 발생.
}

class LambdaWithFuncInter {
    public static void main(String[] args) {
        PrintBluePrint printer = s -> {System.out.println(s);};
        printer.printSomething("hello, world!");
    }
}
