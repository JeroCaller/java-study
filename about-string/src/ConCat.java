class ConCat {
    public static void main(String[] args) {
        String str1 = new String("Pineapple");
        String str2 = "Apple";

        String result = str1.concat(str2);  // 문자열 리터럴과 String 합침 가능.
        System.out.println(result);
        System.out.println(str1);  // 원래 문자열에는 변함이 없다.
        System.out.println(str2);  // 원래 문자열에는 변함이 없다.

        System.out.println(result.concat("Pen"));
    }
}
