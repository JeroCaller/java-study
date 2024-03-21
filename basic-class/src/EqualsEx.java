class User4 {
    String userId;

    User4(String userId) {
        this.userId = userId;
    }

    // equals 메서드 오버라이딩
    public boolean equals(Object obj) {
        if(this.userId.equals(((User4)obj).userId)) {
            return true;
        } else {
            return false;
        }
    }
}

class EqualsEx {
    public static void main(String[] args) {
        User4 me = new User4("bowWow123");
        User4 you = new User4("bowWow123");
        String meStr = new String("bowWow123");
        String youStr = new String("bowWow123");

        System.out.println(me.equals(you));
        System.out.println(meStr.equals(youStr));
    }
}
