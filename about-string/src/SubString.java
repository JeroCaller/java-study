class SubString {
    public static void main(String[] args) {
        String src = "Cat-Cow-Bowl";
        int idx1 = src.indexOf("Cow");
        int idx2 = src.indexOf("Bowl");

        String subStr1 = src.substring(idx1, idx2 - 1);
        String subStr2 = src.substring(idx2);

        System.out.println(subStr1);
        System.out.println(subStr2);

        // 원본 문자열은 보존되는가?
        System.out.println(src);
    }
}
