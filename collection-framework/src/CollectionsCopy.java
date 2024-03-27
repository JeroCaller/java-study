import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CollectionsCopy {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>(Arrays.asList(
            "자바", "파이썬", "자바스크립트", "자료구조", "알고리즘"
        ));
        List<String> copiedList = new ArrayList<>(originalList);

        // 기존 요소의 값을 변경
        copiedList.set(3, null);
        System.out.println(copiedList);

        // copy(dest, src) : src 리스트를 dest 리스트에 모든 요소 복사.
        // 만약 dest 리스트의 길이가 src보다 작다면 IndexOutOfBoundsException 
        // 예외가 발생하여 복사가 안됨. 
        Collections.copy(copiedList, originalList);

        System.out.println(originalList);
        System.out.println(copiedList);

        copiedList.set(copiedList.size()-1, null);

        // 복사된 배열 리스트의 요소 변경이 원본 배열 리스트에 영향을 미치는지 확인.
        // (즉, 깊은 복사가 되었는가를 확인)
        System.out.println(originalList);
        System.out.println(copiedList);
    }
}
