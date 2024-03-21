interface UserMust {
    @Deprecated
    void printProfile();
    void showProfile();
}

class User8 {
    String userId;
    int point;

    User8(String userId, int point) {
        this.userId = userId;
        this.point = point;
    }

    //@Deprecated
    @SuppressWarnings("deprecation")
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

class SuppressWarningsAnno {
    //@SuppressWarnings("deprecation")
    public static void main(String[] args) {
        User8 me = new User8("good123", 1000);

        me.printProfile();
        me.showProfile();
    }
}
