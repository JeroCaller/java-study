import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

class StreamOperators {
    public static void main(String[] args) {
        int[] myNums = {5, 1, 2, 7, 6};
        List<Integer> myNumList = Arrays.asList(5, 1, 2, 7, 6);

        // === int형 배열에 대한 스트림
        int totalSum = Arrays.stream(myNums).sum();
        System.out.println("합 : " + totalSum);

        long countNums = Arrays.stream(myNums).count();
        System.out.println("개수 : " + countNums);

        OptionalDouble aver = Arrays.stream(myNums).average();
        System.out.println("평균 : " + aver);

        OptionalInt myMin = Arrays.stream(myNums).min();
        System.out.println("최소 : " + myMin);

        OptionalInt myMax = Arrays.stream(myNums).max();
        System.out.println("최대 : " + myMax);
        // ===
        System.out.println("===============");

        // === 컬렉션 스트림
        long count2 = myNumList.stream().count();
        System.out.println("개수 : " + count2);

        System.out.println("최소 : " + myNumList.stream().min((n1, n2) -> n1 - n2));
        System.out.println("최대 : " + myNumList.stream().max((n1, n2) -> n1 - n2));
        // ===
    }
}
