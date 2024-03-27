import java.util.Set;
import java.util.TreeMap;

enum HowToIter{KEY, VALUE, ALL};

class UseTreeMap {
    public static <K, V> void printAllInTreeMap
    (TreeMap<K, V> hm, HowToIter how) {
        // 해시맵의 키만 담고 있는 Set 객체 반환.
        Set<K> ks = hm.keySet();
        for(K myKey : ks) {
            switch(how) {
                case KEY:
                    System.out.print(myKey + ", ");
                    break;
                case VALUE:
                    System.out.print(hm.get(myKey) + ", ");
                    break;
                case ALL:
                    System.out.print("(" + myKey + " : " + hm.get(myKey) + "), ");
                    break;
            }
        }
        System.out.println();  // 개행.
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> userDatabase = new TreeMap<>();
        // 고유ID : 닉네임
        userDatabase.put(120, "wow221");
        userDatabase.put(50, "bowWow200");
        userDatabase.put(80, "titan889");

        printAllInTreeMap(userDatabase, HowToIter.KEY);
        printAllInTreeMap(userDatabase, HowToIter.VALUE);
        printAllInTreeMap(userDatabase, HowToIter.ALL);
    }
}
