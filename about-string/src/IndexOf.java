class IndexOf {
    public static void main(String[] args) {
        String src1 = "HelloWorld";
        int n1 = src1.indexOf("o");
        int n2 = src1.indexOf("o", n1+1);
        int n3 = src1.indexOf("q");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        String src2 = "가는 말이 고와야 오는 말도 곱다.";
        // 한 글자 뿐만 아니라 여러 글자의 단어를 검색할 수도 있다.
        int targetIdx = src2.indexOf("고와야"); 
        System.out.println(targetIdx);
    }
}
