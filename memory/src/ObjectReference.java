public class ObjectReference {
    public static void main(String[] args) {
        User me = new User();
        me.name = "가나다";
        me.age = 23;
        me = null;
    }
}