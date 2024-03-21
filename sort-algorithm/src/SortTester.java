class SortTester {
    /**
     * 주어진 정수 배열이 오름차순으로 정렬되었는지 확인하는 메서드.
     * @param arr  정수 배열.
     * @return  true : 오름차순으로 정렬됨을 확인. false : 정렬 안됨.
     */
    public static boolean isSortedAsce(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
