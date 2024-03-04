public class Prints {
    public static void main(String[] args){
        char alp = 'A';
        String food = "banana";
        int year = 2024;
        double pi = 3.141592;

        System.out.print("nice to meet you.");
        System.out.println("Hello, World!");
        System.out.printf("%c %s %d %f %e %.2f", alp, food, year, pi, pi, pi);
    }
}
