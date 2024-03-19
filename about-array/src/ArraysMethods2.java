import java.util.Arrays;

class ArraysMethods2 {
    public static void main(String[] args) {
        boolean[] boolArr = {true, false, true};
        boolean[] boolArr2 = {true, false, true};
        boolean[] boolArr3 = {false, true, false};
        boolean[] boolArr4 = {true};
        // 배열 길이가 달라도 false를 반환.
        boolean[] boolArr5 = {true, false, true, true};

        System.out.println(Arrays.equals(boolArr, boolArr2));
        System.out.println(Arrays.equals(boolArr, boolArr3));
        System.out.println(Arrays.equals(boolArr, boolArr4));
        System.out.println(Arrays.equals(boolArr, boolArr5));
    }
}
