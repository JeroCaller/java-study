import java.util.Random;

class SortMain {
    public static void printIntArray(int[] arr, boolean addNewLine) {
        System.out.print("{");
        for(int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.print("}");
        if(addNewLine) {
            System.out.println();
        }
    }

    public static int[] getRandIntArray(int len, int rangeStart, int rangeEnd) {
        Random rand = new Random();
        int[] arr = new int[len];

        for(int i = 0; i < len; i++) {
            arr[i] = rand.nextInt(rangeStart, rangeEnd);
        }
        return arr;
    }

    public static void testSortTester() {
        int[] arr = {1, 3, 5, 12, 14};
        int[] arr2 = {2, 4, 5, 10, 9};
        int[] arr3 = {1, 1, 2, 3, 4};

        printIntArray(arr, false);
        System.out.print(" : " + SortTester.isSortedAsce(arr) + "\n");
        printIntArray(arr2, false);
        System.out.print(" : " + SortTester.isSortedAsce(arr2) + "\n");
        printIntArray(arr3, false);
        System.out.print(" : " + SortTester.isSortedAsce(arr3) + "\n");
    }

    public static void doBubbleSort() {
        int[] arr = getRandIntArray(10, 0, 21);

        System.out.println("정렬 전");
        printIntArray(arr, true);

        BubbleSort.executeBubbleSort(arr);
        System.out.println("정렬 후");
        printIntArray(arr, true);
        System.out.println("정렬 확인 : " + SortTester.isSortedAsce(arr));
    }

    public static void doInsertionSort() {
        int[] arr = getRandIntArray(10, 0, 21);

        System.out.println("정렬 전");
        printIntArray(arr, true);
        
        InsertionSort.executeInsertionSort(arr);
        System.out.println("정렬 후");
        printIntArray(arr, true);
        System.out.println("정렬 확인 : " + SortTester.isSortedAsce(arr));
    }

    public static void main(String[] args) {
        // testSortTester();
        // doBubbleSort();
        doInsertionSort();
    }
}
