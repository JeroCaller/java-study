public class StaticPreload {
    static int number;

    // 이름없는 블록 영역에도 static을 붙일 수 있다.
    static {
        number = 12;
    }
    
    public static void main(String[] args) {
        number += 1;
        System.out.println(number);
    }
}
