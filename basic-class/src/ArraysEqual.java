import java.util.Arrays;

class MyInteger {
    int num;

    MyInteger(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Integer.valueOf(this.num).toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this.num == ((MyInteger)obj).num) {
            return true;
        } else {
            return false;
        }
    }
}

class ArraysEqual {
    public static void printMyIntegerArray(MyInteger[] myArr) {
        for(MyInteger num : myArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        MyInteger[] arr1 = {new MyInteger(1), new MyInteger(2)};
        MyInteger[] arr2 = {new MyInteger(1), new MyInteger(2)};

        printMyIntegerArray(arr1);
        printMyIntegerArray(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
