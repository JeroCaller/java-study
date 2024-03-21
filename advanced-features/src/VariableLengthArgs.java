class VariableLengthArgs {
    public static int getAdd(int... args) {
        int total = 0;
        for(int num: args) {
            total += num;
        }
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println(getAdd(1));
        System.out.println(getAdd(1, 2));
        System.out.println(getAdd(1, 2, 3));
    }
}
