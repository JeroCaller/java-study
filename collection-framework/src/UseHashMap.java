import java.util.HashMap;
import java.util.Set;

enum HowToIter{KEY, VALUE, ALL};

class UseHashMap {
    public static <K, V> void printAllInHashMap
    (HashMap<K, V> hm, HowToIter how) {
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
        HashMap<Integer, String> userDatabase = new HashMap<>();
        // 고유ID : 닉네임
        userDatabase.put(120, "wow221");
        userDatabase.put(50, "bowWow200");
        userDatabase.put(80, "titan889");

        printAllInHashMap(userDatabase, HowToIter.KEY);
        printAllInHashMap(userDatabase, HowToIter.VALUE);
        printAllInHashMap(userDatabase, HowToIter.ALL);

        System.out.println(userDatabase);
    }
}
