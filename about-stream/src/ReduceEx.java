import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReduceEx {
    public static void main(String[] args) {
        int[] myNums = {4, 1, 2, 6, 3};
        List<String> myStrs = Arrays.asList(
            "java", "javascript", "python"
        );

        // 모든 수의 총합을 구하기
        int total = Arrays.stream(myNums)
                           .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println("총합 : " + total);

        // 모든 문자열 데이터들 중 가장 길이가 긴 문자열을 반환.
        String lengthy = myStrs.stream()
                               .reduce(myStrs.get(0), (s1, s2) -> 
                               (s1.length() > s2.length()) ? s1 : s2);
        System.out.println("가장 길이가 긴 문자열 : " + lengthy);
    }
}
