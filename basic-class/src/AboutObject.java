class User3 {
    String userId;

    User3(String userId) {
        this.userId = userId;
    }

    // 메서드 오버라이딩.
    // 객체 자체의 원래 출력 결과를 알고 싶으면 다음 메서드를 주석 처리.
    public String toString() {
        return userId;
    }
}

class AboutObject {
    public static void main(String[] args) {
        User3 me = new User3("goodworld");
        String someStr = "hello";

        System.out.println(me);
        System.out.println(me.toString());
        System.out.println(someStr);
        System.out.println(someStr.toString());
    }
}
