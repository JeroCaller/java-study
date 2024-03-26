import java.util.HashSet;

class User9 {
    private String nickName;
    private int uniqueCode;

    User9(String nickName, int uniqueCode) {
        this.nickName = nickName;
        this.uniqueCode = uniqueCode;
    }

    @Override
    public String toString() {
        return "(" + this.nickName + " : " + this.uniqueCode + ")";
    }

    // 이미 정의된 해시 알고리즘 이용.
    // #1
    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.nickName, this.uniqueCode);
    }

    /*
    // 사용자 정의 해시 코드
    // #2
    @Override
    public int hashCode() {
        return this.uniqueCode % 10;
    }*/

    @Override
    public boolean equals(Object obj) {
        if(this.uniqueCode == ((User9)obj).uniqueCode) {
            return true;
        } else {
            return false;
        }
    }
}

class HashSetWithMyObj {
    public static <E> void printAllElementsInHashSet(HashSet<E> s) {
        System.out.print("(");
        for(E element : s) {
            System.out.print(element + ", ");
        }
        System.out.printf(") : %d\n", s.size());
    }

    public static void main(String[] args) {
        HashSet<User9> mySet = new HashSet<>();
        mySet.add(new User9("good123", 1212));
        mySet.add(new User9("bowWow9912", 1212));
        mySet.add(new User9("good123", 1000));

        printAllElementsInHashSet(mySet);
    }
}
