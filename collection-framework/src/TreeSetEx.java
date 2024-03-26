import java.util.TreeSet;

class TreeSetEx {
    public static <E> void printAllInTreeSet(TreeSet<E> ts) {
        System.out.print("(");
        for(E element: ts) {
            System.out.print(element + ", ");
        }
        System.out.print(")  : " + ts.size() + "\n");
    }
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(12);
        treeSet.add(23);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(13);
        treeSet.add(3);  // 중복되어서 무시됨.

        printAllInTreeSet(treeSet);
    }
}
