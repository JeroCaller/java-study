import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class UseBinarySearch {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>(Arrays.asList(
            9, 4, 12, 5, 29, 17
        ));

        Collections.sort(myArrList);
        Integer idx1 = Collections.binarySearch(myArrList, 4);
        System.out.println(idx1);

        // 해당 자료구조 내에 없는 값을 검색하려 함.
        Integer idx2 = Collections.binarySearch(myArrList, 100); 
        System.out.println(idx2);
    }
}
