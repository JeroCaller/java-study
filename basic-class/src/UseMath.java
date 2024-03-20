class UseMath {
    public static void main(String[] args) {
        System.out.println("5 ^ 3 = " + Math.pow(5, 3));
        System.out.println("root(2) = " + Math.sqrt(2));
        System.out.println("log(e) e = " + Math.log(Math.E));  // base e
        System.out.println("PI : " + Math.PI);

        System.out.println("max(10, 20) : " + Math.max(10, 20));
        System.out.println("min(10, 20) : " + Math.min(10, 20));

        System.out.println("Math random : " + Math.random());

        // 소수부를 무조건 올림
        System.out.println("PI : " + Math.ceil(Math.PI));
        
        // 소수부를 무조건 버림.
        System.out.println(Math.floor(3.796));

        // 소수점 첫째 자리에서 반올림한 정수 반환.
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));

        // 인자의 double형 값과 가장 가까운 정수를 double형으로 반환.
        System.out.println("PI : " + Math.rint(Math.PI));
    }
}
