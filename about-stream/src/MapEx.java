import java.util.Arrays;
import java.util.List;

class MapEx {
    public static void main(String[] args) {
        int[] myNums = {1, 5, 3, 12, 4};
        List<String> myStrs = Arrays.asList("java", "javascript", "python");

        myStrs.stream()
              .map(s -> s + "-" + s.length())
              .sorted((s1, s2) -> s2.length() - s1.length())
              .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        Arrays.stream(myNums)
              .map(n -> n + 1)
              .sorted()
              .forEach(n -> System.out.print(n + ", "));
        System.out.println();
    }
}
