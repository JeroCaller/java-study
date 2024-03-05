public class VariableScope {
    // 1
    static String name = "가나다";
    static byte age = 22;

    public static void main(String[] args) {
        String bookName = "자바에서 살아남기";
        int bookSold = 300;
        boolean isGood = true;

        int n = 10;
        int total = 0;
        // int total = 111;

        {
            // 2
            System.out.println(name);
            System.out.println(age);
            System.out.println(bookName);
        }

        for(int i = 1; i <= n; i++) {
            // 3
            total += i;
        }
        System.out.println(total);

        if (isGood) {
            // 4
            // int bookSold = 301;  
            bookSold++;
            System.out.println(bookSold);
            // System.out.println(i);
        }

        {
            // 5
            int localNum = 11;
            System.out.println(localNum);
        }
        // System.out.println(++localNum);
        
    }
}
