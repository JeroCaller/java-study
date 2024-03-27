import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class IntegerDesc implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

class CollectionSort {
    public static void main(String[] args) {
        List<Integer> numArr = new ArrayList<>(Arrays.asList(
            3, 12, 1, 99, 42
        ));

        System.out.println("=== 정렬 전 데이터 ===");
        System.out.println(numArr);

        Collections.sort(numArr);
        System.out.println("=== 오름차순 정렬 후 데이터 ===");
        System.out.println(numArr);

        Collections.sort(numArr, new IntegerDesc());
        System.out.println("=== 내림차순 정렬 후 데이터 ===");
        System.out.println(numArr);
    }
}
