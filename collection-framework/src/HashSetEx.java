import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(12);
        mySet.add(3);
        mySet.add(5);
        mySet.add(12);  // 데이터 중복 삽입 시 맨 마지막에 삽입되는 데이터는 무시됨.

        for(Iterator<Integer> itr = mySet.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

        System.out.println(mySet.size());
    }
}
