class ParaReturn {
    public static String combineStrings(String[] strSource) {
        StringBuilder sb = new StringBuilder();

        // 향상된 for문 (Enhanced for)
        for(String token : strSource) {
            sb.append(token);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // 배열 생성 및 초기화.
        String[] myStrs = {"000", "-", "111", "-", "222"};
        String result = combineStrings(myStrs);

        System.out.println(result);

        // 배열은 그 크기가 고정되어서 크기 이상의 값을 추가할 수 없다.
        // 다음의 코드는 에러가 발생함.
        // myStrs[5] = "333";
        // System.out.println(myStrs.length);
    }
}
