public class ObjectReference2 {
    public static void main(String[] args) {
        User me = new User();
        me.name = "가나다";
        me.age = 24;

        User myClone = me;
        System.out.println("myClone name: " + myClone.name);
        System.out.println("myClone age: " + myClone.age);

        myClone.name = "다라마";
        myClone.age = 29;
        System.out.println("=== me ===");
        System.out.println(me.name);
        System.out.println(me.age);

        System.out.println(me);
        System.out.println(myClone);
    }
}
