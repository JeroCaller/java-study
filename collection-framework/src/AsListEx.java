import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

class AsListEx {
    public static void printListElements(List li) {
        String listType = "";
        if (li instanceof ArrayList) {
            listType = "ArrayList";
        } else if(li instanceof LinkedList) {
            listType = "LinkedList";
        } else {
            listType = "List";
        }

        System.out.printf("=== %s 순회 출력===\n", listType);
        for(int i = 0; i < li.size(); i++) {
            if (i == li.size() - 1) {
                // get(i) : i 인덱스의 요소 반환.
                System.out.println(li.get(i));
            } else {
                System.out.print(li.get(i) + ", ");
            }
        }
        System.out.println("======================");
    }

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("good", "bad", "java", "python");
        // myList.add("great");  // Arrays.asList()로 생성된 리스트는 요소 추가 및 삭제 불가.

        // 에러. 직접 생성자에 요소들을 초기화할 수 없음.
        // List<String> myArrList = new ArrayList<>("good", "bad", "java", "python");
        // List<String> myLinkedList = new LinkedList<>("good", "bad", "java", "python");

        // ArrayList 생성자에 Arrays.asList() 반환값 대입을 통해 
        // 변수 선언과 동시에 초기화 가능.
        List<String> otherList = new ArrayList<>(Arrays.asList("good", "bad", "java", "python"));
        printListElements(otherList);

        myList = new ArrayList<>(myList);  // ArrayList로 변환. 수정 가능.
        myList.add("great");  // 에러 없음.

        printListElements(myList);

        myList = new LinkedList<>(myList);  // ArrayList -> LinkedList 변환.
        myList.remove(myList.size()-1);
        printListElements(myList);
    }
}
