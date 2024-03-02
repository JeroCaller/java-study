public class AssignOperators {
    public static void main(String[] args) {
        // 복합 대입 연산자 예
        int a = 1;
        a += 10l;  // 자동 형변환
        System.out.println(a);

        a = (int)(a + 20l); // 강제 형변환
        System.out.println(a);
    }
}
