class StringOperators {
    public static void main(String[] args) {
        String str1 = "hi" + "good";
        String str2 = "hi".concat("good");
        String str3 = "hi";
        str3 += "good";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // String thisYear = "이번년도 : ".concat(String.valueOf(2024));
        String thisYear = "이번년도 : " + 2024;
        System.out.println(thisYear);

        String suceedStr = "aa".concat("bb").concat("cc");
        System.out.println(suceedStr);
    }
}
