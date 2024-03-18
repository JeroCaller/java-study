import java.util.StringTokenizer;

class Token {
    public static void printTokens(StringTokenizer stTo) {
        // hasMoreTokens() : 토큰이 아직 하나라도 남아있다면 true 반환.
        while (stTo.hasMoreTokens()) {
            // nextToken() : 토큰을 순서대로 하나씩 반환한다. 
            System.out.println(stTo.nextToken());
        }
    }

    public static void main(String[] args) {
        // 첫 번째 인자 : 분할할 문자열.
        // 두 번째 인자 : 구분자. (생략 시 공백, 탭 또는 개행(\n)으로 기본 설정)
        StringTokenizer st = new StringTokenizer("1 2 3");
        StringTokenizer st2 = new StringTokenizer("1-2-3", "-");

        printTokens(st);
        System.out.println("=======");
        printTokens(st2);
    }
}
