import java.util.LinkedList;
import java.util.Queue;

class UseQueue {
    public static void printAllInQueue(Queue ll) {
        while(ll.peek() != null) {
            // size() : 현재 큐 내부의 요소들의 개수.
            System.out.println("The number of elements in the queue: " + ll.size());
            // peek() : 다음에 나올 큐 내부의 맨 마지막에 있는 요소 출력. 
            // 실제로 꺼내진 않는다. 
            System.out.println("What's next? " + ll.peek());
            // poll() : 큐 맨 마지막에 있는 요소를 꺼낸 후 반환한다. 
            System.out.println(ll.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        // 요소 삽입
        qu.offer(12);
        qu.offer(5);
        qu.offer(200);

        printAllInQueue(qu);
    }
}
