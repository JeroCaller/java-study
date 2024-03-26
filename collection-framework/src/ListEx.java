import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListEx {
    public static void printListElements(List li) {
        for(int i = 0; i < li.size(); i++) {
            if (i == li.size() - 1) {
                // get(i) : i 인덱스의 요소 반환.
                System.out.println(li.get(i));
            } else {
                System.out.print(li.get(i) + ", ");
            }
        }
    }

    public static void testListMethods(List<String> li) {
        if (li instanceof ArrayList) {
            System.out.println("=== ArrayList 테스트 ===");
        } else if (li instanceof LinkedList) {
            System.out.println("=== LinkedList 테스트 ===");
        } else {
            System.out.println("=== List 테스트 ===");
        }

        li.add("good");  // 값을 맨 마지막에 추가.
        li.add("well done");
        li.add(1, "bad");  // 해당 index에 값 삽입.

        printListElements(li);
        li.remove(li.size() - 1);  // 맨 마지막 요소 삭제.
        printListElements(li);

        System.out.println("===================");
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> myArrList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();

        testListMethods(myArrList);
        testListMethods(myLinkedList);
    }
}