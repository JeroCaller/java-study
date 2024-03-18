import java.util.Arrays;

class ArraysMethods {
    public static void printIntArray(int[] arr) {
        for(int element : arr) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 초기화 되지 않은 int형 배열은 모두 0으로 자동 초기화됨.
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];
        int[] numbers3 = new int[10];
        int[] numbers4 = new int[10];

        printIntArray(numbers1);
        System.out.println("====================");

        // 배열 내 모든 요소들을 두 번째 인자로 초기화.
        Arrays.fill(numbers1, 1);
        Arrays.fill(numbers2, 2);
        Arrays.fill(numbers3, 3);

        printIntArray(numbers1);
        printIntArray(numbers2);
        printIntArray(numbers3);
        System.out.println("====================");

        numbers2 = Arrays.copyOf(numbers1, numbers1.length - 3);
        numbers3 = Arrays.copyOfRange(numbers1, 4, numbers1.length - 3);

        printIntArray(numbers1);
        printIntArray(numbers2);
        printIntArray(numbers3);
        // 복사 대상 배열의 원래 길이보다 더 짧게 복사한 경우, 길이도 변한다.
        System.out.println(numbers2.length);
        System.out.println(numbers3.length);
        System.out.println("====================");

        printIntArray(numbers4);
        // copyOf, copyOfRange와 달리, 복사 대상 배열의 원래 길이보다 더 짧게 복사해도 
        // 배열의 길이 자체는 변하지 않는다. 
        System.arraycopy(numbers1, 0, numbers4, 0, numbers1.length-2);
        printIntArray(numbers4);
    }
}
