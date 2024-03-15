import java.util.StringTokenizer;

class Token {
    public static void printTokens(StringTokenizer stTo) {
        while (stTo.hasMoreTokens()) {
            System.out.println(stTo.nextToken());
        }
    }

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("1 2 3");
        StringTokenizer st2 = new StringTokenizer("1-2-3", "-");

        printTokens(st);
        System.out.println("=======");
        printTokens(st2);
    }
}
