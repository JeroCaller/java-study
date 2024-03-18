import java.util.Arrays;

class ArraySort {
    public static void main(String[] args) {
        int[] numArr = {12, 5, 11, 7};
        double[] realArr = {1.3, 4.2, 3.141592, 12.0};
        String[] strArr = {"great", "wow", "cool", "jar"};

        String delimiter = "   ";

        Arrays.sort(numArr);
        Arrays.sort(realArr);
        Arrays.sort(strArr);
        
        for(int n : numArr) {
            System.out.print(n + delimiter);
        }
        System.out.println();

        for(double d : realArr) {
            System.out.print(d + delimiter);
        }
        System.out.println();

        for(String s : strArr) {
            System.out.print(s + delimiter);
        }
        System.out.println();
    }
}
