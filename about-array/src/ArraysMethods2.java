import java.util.Arrays;

class ArraysMethods2 {
    public static void main(String[] args) {
        boolean[] boolArr = {true, false, true};
        boolean[] boolArr2 = {true, false, true};
        boolean[] boolArr3 = {false, true, false};
        boolean[] boolArr4 = {true};
        boolean[] boolArr5 = {true, true, true, true};

        System.out.println(Arrays.equals(boolArr, boolArr2));
        System.out.println(Arrays.equals(boolArr, boolArr3));
        System.out.println(Arrays.equals(boolArr, boolArr4));
        System.out.println(Arrays.equals(boolArr, boolArr5));
    }
}
