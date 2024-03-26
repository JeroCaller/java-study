import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class IteratorEx {
    public static <T> void printListElements(List<T> li) {
        System.out.println("=== Enhanced for ===");
        for(T element : li) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("=====================");
    }

    public static void printListElementsWithIter(Iterator itr) {
        System.out.println("=== Iterator ===");
        while(itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
        System.out.println("=================");
    }

    public static void testListMethods(List li) {
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

        Iterator<String> itr = li.iterator();
        printListElementsWithIter(itr);

        System.out.println("=======================");
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> myArrList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();

        testListMethods(myArrList);
        testListMethods(myLinkedList);
    }
}
