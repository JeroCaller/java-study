import java.util.StringTokenizer;

class ParseInto {
    public static void main(String[] args) {
        String source = "000-111-222-333";
        StringTokenizer strToken = new StringTokenizer(source, "-");
        int total = 0;

        while(strToken.hasMoreTokens()) {
            String token = strToken.nextToken();
            total += Integer.parseInt(token);
        }
        System.out.println(total);
    }
}
