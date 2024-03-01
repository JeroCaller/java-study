public class App {
    public static void main(String[] args)
    {
        // case 1
        double n1 = 1.0000001;
        double n2 = 2.0000001;
        
        System.out.println(n1 + n2);

        // case 2
        double total = 0.0;
        for (int i = 0; i < 100; i = i + 1) {
            total = total + 0.1; 
        }
        System.out.println(total);
    }
}
