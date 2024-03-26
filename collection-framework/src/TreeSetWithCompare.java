import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class User11 implements Comparable<User11>{
    String nickName;
    int uniqueCode;

    User11(String nickName, int uniqueCode) {
        this.nickName = nickName;
        this.uniqueCode = uniqueCode;
    }

    @Override
    public String toString() {
        return "(" + this.nickName + " : " + this.uniqueCode + ")";
    }

    @Override
    public int compareTo(User11 o) {
        return this.uniqueCode - o.uniqueCode;  // 고유번호 오름차순 정렬
        // return o.uniqueCode - this.uniqueCode;  // 고유번호 내림차순 정렬.
        // return this.nickName.compareTo(o.nickName);  // 닉네임 오름차순 정렬. 
        // return o.nickName.compareTo(this.nickName);  // 닉네임 내림차순 정렬.
    }
}

class StringLenComparator implements Comparator<User11> {
    @Override
    public int compare(User11 o1, User11 o2) {
        // 문자열의 길이가 같은 데이터는 중복 처리되어 추가되지 않음.
        return o1.nickName.length() - o2.nickName.length();
    }
}

class TreeSetWithCompare {
    public static <E> void printAllInSet(Set<E> s) {
        System.out.print("(");
        for(E element : s) {
            System.out.print(element + ", ");
        }
        System.out.print(") : " + s.size() + "\n");
    }

    public static void main(String[] args) {
        Set<User11> treeSet = new TreeSet<>(new StringLenComparator());
        treeSet.add(new User11("good123", 1212));
        treeSet.add(new User11("bowWow9912", 1302));
        treeSet.add(new User11("titan999", 1000));

        // "good123"과 길이가 동일함. 따라서 이 객체는 TreeSet에 추가되지 않음.
        treeSet.add(new User11("great12", 2000));
        
        printAllInSet(treeSet);
    }    
}
