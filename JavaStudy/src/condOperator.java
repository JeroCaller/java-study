public class condOperator {
    public static void main(String[] args) {
        // 조건 연산자 예제.
        int a = 10;
        int b = 20;

        // 조건 연산자를 이용하여 두 수의 양의 차이를 구한다. 
        // 조건식 ? 참일 경우 실행 : 거짓일 경우 실행;
        int positiveDiff = (a > b) ? (a - b) : (b - a);
        // 조건식 (a > b)가 거짓이므로, (b - a)식이 실행된 결과값이 해당 변수에 할당됨.
        System.out.println(positiveDiff);
    }
}
