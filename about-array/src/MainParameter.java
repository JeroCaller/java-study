class MainParameter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("main 메서드로 넘어온 인자 없음.");
        } else {
            for(String element : args) {
                System.out.println(element);
            }
        }
    }
}
