class OtherStringMethods {
    public static void main(String[] args) {
        String con = "shape";
        System.out.println(con.contains("a"));

        // stringSrc.startsWith(string) : 문자열이 string으로 시작하는지를 조사 후 boolean으로 반환.
        System.out.println("good".startsWith("g"));
        System.out.println("good for you".startsWith("good"));

        // stringSrc.endsWith(string) : 문자열이 string으로 끝나는지를 조사 후 boolean으로 결과값 반환.
        System.out.println("good for you".endsWith("you"));

        // boolean string.isEmpty() : 문자열의 길이가 0인지 확인. (string.length == 0)
        System.out.println("".isEmpty());

        // toUpperCase() : 문자열의 모든 영문자들을 대문자로 변경.
        // toLowerCase() : 문자열의 모든 영문자들을 소문자로 변경.
        System.out.println("how ARE you".toUpperCase());
        System.out.println("HOW are YOU".toLowerCase());

        String strWithSpace = "  굳 아이디어  ";
        // 문자열 양쪽 공백 제거한 결과물을 반환.
        String strWithoutSpace = strWithSpace.trim();
        System.out.println(strWithoutSpace);
        System.out.println(strWithSpace.length());
        System.out.println(strWithoutSpace.length());
    }
}
