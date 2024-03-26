import java.util.Set;
import java.util.TreeSet;

class User10 implements Comparable<User10>{
    private String nickName;
    private int uniqueCode;

    User10(String nickName, int uniqueCode) {
        this.nickName = nickName;
        this.uniqueCode = uniqueCode;
    }

    @Override
    public String toString() {
        return "(" + this.nickName + " : " + this.uniqueCode + ")";
    }

    @Override
    public int compareTo(User10 o) {
        return this.uniqueCode - o.uniqueCode;  // 고유번호 오름차순 정렬
        // return o.uniqueCode - this.uniqueCode;  // 고유번호 내림차순 정렬.
        // return this.nickName.compareTo(o.nickName);  // 닉네임 오름차순 정렬. 
        // return o.nickName.compareTo(this.nickName);  // 닉네임 내림차순 정렬.
    }
}

class TreeSetWithCompareTo {
    public static <E> void printAllInSet(Set<E> s) {
        System.out.print("(");
        for(E element : s) {
            System.out.print(element + ", ");
        }
        System.out.print(") : " + s.size() + "\n");
    }
    
    public static void main(String[] args) {
        Set<User10> treeSet = new TreeSet<>();
        treeSet.add(new User10("good123", 1212));
        treeSet.add(new User10("bowWow9912", 1302));
        treeSet.add(new User10("titan999", 1000));
        
        printAllInSet(treeSet);
    }
}
