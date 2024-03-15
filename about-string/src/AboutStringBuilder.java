class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("자바");
        
        sb.append("파이썬");
        System.out.println(sb.toString());

        sb.append("JavaScript");
        System.out.println(sb.toString());

        // delele(start, end) : start 인덱스부터 end - 1까지를 삭제
        sb.delete(2, 5);
        System.out.println(sb.toString());

        // replace(start, end, newStr) : start 인덱스부터 end - 1까지를 newStr 문자열로 대체.
        sb.replace(1, 4, "CSS");
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());
    }
}
