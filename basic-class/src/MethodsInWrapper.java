class MethodsInWrapper {
    public static void main(String[] args) {
        // 메서드 오버로딩.
        Integer n1 = Integer.valueOf(10);
        Integer n2 = Integer.valueOf("32");

        System.out.println("Max : " + Integer.max(n1, n2));
        System.out.println("Min : " + Integer.min(n1, n2));
        System.out.println("Sum : " + Integer.sum(n1, n2));
        System.out.println("To Binary : " + Integer.toBinaryString(n1));
        System.out.println("To Octal : " + Integer.toOctalString(n1));
        System.out.println("To Hex : " + Integer.toHexString(n1));
    }
}
