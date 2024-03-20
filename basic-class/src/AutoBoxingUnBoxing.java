class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        Integer intObj = 5;  // auto boxing
        int num = intObj;  // auto unboxing

        System.out.println(intObj == num);
        System.out.printf("%d : %d\n", intObj, num);

        intObj += 7;  // intObj = Integer.valueOf(intObj.intValue() + 7);
        intObj++;  // intObj = Integer.valueOf(intObj.intValue() + 1);
        num += 10;

        System.out.printf("%d : %d\n", intObj, num);
    }
}
