class User6 {
    String nickName;

    User6(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return nickName;
    }
}

class AnnoOveride {
    public static void main(String[] args) {
        User6 me = new User6("good123");

        System.out.println(me);
    }
}
