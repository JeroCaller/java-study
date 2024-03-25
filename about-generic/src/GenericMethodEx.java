class DataDisplayer {
    public static <T extends Number> void printDataWithType(T data) {
        System.out.print(data + " ");
        if (data instanceof Integer) {
            System.out.println("Integer");
        } else if (data instanceof Double) {
            System.out.println("Double");
        } else {
            System.out.println("Number class");
        }
    }
}

class GenericMethodEx {
    public static void main(String[] args) {
        DataDisplayer.<Integer>printDataWithType(12);
        DataDisplayer.printDataWithType(12.4);
    }
}
