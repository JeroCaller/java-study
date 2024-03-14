public class MyApp {
    public static void main(String[] args) {
        CalcTotal ct = new CalcTotal();
        sublib.mathtools.add.CalcTotal oneToN = new sublib.mathtools.add.CalcTotal();
        sublib.mathtools.product.CalcTotal fact = new sublib.mathtools.product.CalcTotal();

        System.out.println("두 피연산자 간 덧셈 결과 : " + ct.getIntAdd(3, 2));
        System.out.println("10까지의 모든 자연수 덧셈 결과 : " + oneToN.getTotal(10));
        System.out.println("5! : " + fact.factorial(5));
    }
}
