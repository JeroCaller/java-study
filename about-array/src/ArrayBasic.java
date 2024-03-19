class ArrayBasic {
    public static void main(String[] args) {
        // 배열 선언.
        String[] books = new String[3];
        int bookSold[] = new int[3];

        books[0] = "프로그래밍 배우기";
        books[1] = "습관 정립하기";
        books[2] = new String("너가 코딩을 못하는 이유 10가지");

        bookSold[0] = 50;
        bookSold[1] = 21;
        bookSold[2] = 70;

        // 이 방식으론 배열 내 모든 요소들을 출력하여 확인해볼 수 없음.
        System.out.println(books);
        System.out.println(bookSold);

        // 순회하여 배열 내 요소들을 출력.
        for(int i = 0; i < books.length; i++) {
            System.out.printf("%s : %d\n", books[i], bookSold[i]);
        }
    }
}
