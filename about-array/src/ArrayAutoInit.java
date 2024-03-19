class SomeClass {};

class ArrayAutoInit {
    public static void main(String[] args) {
        int len = 3;
        int[] numArr = new int[len];
        boolean[] boolArr = new boolean[len];
        double[] doubleArr = new double[len];
        char[] charArr = new char[len];
        String[] strArr = new String[len];
        SomeClass[] someArr = new SomeClass[len];

        for(int i = 0; i < len; i++) {
            System.out.println(numArr[i]);
            System.out.println(boolArr[i]);
            System.out.println(doubleArr[i]);
            System.out.println(charArr[i]);
            System.out.println(strArr[i]);
            System.out.println(someArr[i]);
            System.out.println("===========");
        }
        // 유니코드 \u0000은 null을 의미.
        System.out.println(charArr[0] == '\u0000');
    }
}
