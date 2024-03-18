class User2 {
    String userID;
    int point;

    User2(String userID, int point) {
        this.userID = userID;
        this.point = point;
    }

    void printProfile() {
        System.out.println("====== 사용자 정보 ======");
        System.out.println("사용자 아이디 : " + userID);
        System.out.println("보유 포인트 : " + point);
    }
}

class ArrayClass {
    public static void main(String[] args) {
        User2[] userArray = new User2[3];

        userArray[0] = new User2("kalguksu123", 1000);
        userArray[1] = new User2("chobocoding111", 2000);
        userArray[2] = new User2("bowwow00", 3000);

        for(int i = 0; i < userArray.length; i++) {
            userArray[i].printProfile();
        }
    }
}
