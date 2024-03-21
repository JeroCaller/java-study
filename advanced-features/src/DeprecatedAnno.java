class User7 {
    String userId;
    int point;

    User7(String userId, int point) {
        this.userId = userId;
        this.point = point;
    }

    @Deprecated
    void printProfile() {
        System.out.println(this.userId);
        System.out.println(this.point);
    }

    void showProfile() {
        System.out.println("====== 사용자 정보 ======");
        System.out.println("사용자 아이디 : " + userId);
        System.out.println("보유 포인트 : " + point);
        System.out.println("========================");
    }
}

class DeprecatedAnno {
    public static void main(String[] args) {
        User7 me = new User7("good123", 1000);

        me.printProfile();
        me.showProfile();
    }
}
