class InsertionSort {
    public static void executeInsertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0 && arr[j-1] > arr[j]; j--) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
