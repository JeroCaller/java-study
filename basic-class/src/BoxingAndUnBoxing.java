class BoxingAndUnBoxing {
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf(5);
        int num = intObj.intValue();

        System.out.println(intObj.intValue() == num);
        System.out.printf("%d : %d\n", intObj.intValue(), num);

        intObj = Integer.valueOf(intObj.intValue() + 7);
        num += 10;

        System.out.printf("%d : %d\n", intObj.intValue(), num);
    }
}
