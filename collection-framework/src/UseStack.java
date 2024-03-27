import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class UseStack {
    public static <T> void insertDeque
    (Deque dq, boolean insertFirst, T[] args) {
        for(T element : args) {
            if (insertFirst) {
                dq.offerFirst(element);
            } else {
                dq.offerLast(element);
            }
        }
    }

    public static <T> void pollAndPrintAllInDeque
    (Deque<T> dq, boolean pollFirst) {
        while(dq.peek() != null) {
            T data;
            if (pollFirst) {
                data = dq.pollFirst();
            } else {
                data = dq.pollLast();
            }
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque<String> myDeq = new ArrayDeque<>();
        // LinkedList로도 Deque 사용 가능.
        // Deque<String> myDeq = new LinkedList<>();

        String[] strData = {"wow", "good", "hi"};

        // 왼쪽에서 데이터를 넣고 왼쪽에서 꺼내는 스택.
        insertDeque(myDeq, true, strData);
        pollAndPrintAllInDeque(myDeq, true);
        System.out.println(myDeq.size());

        // 오른쪽에서 데이터를 삽입하고 오른쪽에서 꺼내는 스택.
        insertDeque(myDeq, false, strData);
        pollAndPrintAllInDeque(myDeq, false);

        // 왼쪽에서 데이터를 삽입하고 오른쪽에서 꺼내는 큐.
        insertDeque(myDeq, true, strData);
        pollAndPrintAllInDeque(myDeq, false);

        // 오른쪽에서 데이터를 삽입하고 왼쪾에서 꺼내는 큐.
        insertDeque(myDeq, false, strData);
        pollAndPrintAllInDeque(myDeq, true);
    }
}
