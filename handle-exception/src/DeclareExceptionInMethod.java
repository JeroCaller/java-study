class DeclareExceptionInMethod {
    public static void printIntArray(int[] numArr, int len) 
        throws IndexOutOfBoundsException 
    {
        for(int i = 0; i < len; i++) {
            System.out.println(numArr[i]);
        }
    }
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5};

        try {
            printIntArray(numArr, 10);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            printIntArray(numArr, numArr.length);
        }
    }
}
