import java.util.Arrays;
import java.util.List;

class SortedEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 3, 5, 2);

        // Collection 객체의 stream() 메서드에는 인자를 넣지 않는다.
        list.stream()
            .sorted((n1, n2) -> n2 - n1)  // 내림차순 정렬.
            .forEach(n -> System.out.print(n + ", "));
        System.out.println();

        int[] myNums = {12, 3, 5, 2};
        Arrays.stream(myNums)  // Arrays.stream()에는 데이터 배열을 인자로 대입해야함.
              .sorted()  // IntStream.sorted() 인자에는 따로 정렬 메서드를 넣을 수 없다.
              .forEach(n -> System.out.print(n + ", "));
        System.out.println();
    }
}
