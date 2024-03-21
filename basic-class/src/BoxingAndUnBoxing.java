class BoxingAndUnBoxing {
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf(5);
        int num = intObj.intValue();

        System.out.println(intObj.intValue() == num);
        System.out.printf("%d : %d\n", intObj.intValue(), num);

        // 새 Integer 객체 생성 후, 이를 intObj 참조 변수가 참조함.
        intObj = Integer.valueOf(intObj.intValue() + 7);
        num += 10;

        System.out.printf("%d : %d\n", intObj.intValue(), num);
    }
}
