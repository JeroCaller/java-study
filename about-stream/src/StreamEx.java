import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class StreamEx {
    public static void printIntArr(int[] arr) {
        for(int element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5};

        // 스트림 생성.
        IntStream stream1 = Arrays.stream(numArr);

        // 중간 연산.
        // 소수 판별기
        IntStream stream2 = stream1.filter(n -> {
            if (n == 1) {
                return false;
            }
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        }); 

        // 최종 연산
        int totalSum = stream2.sum();
        System.out.println(totalSum);

        // 최종 연산2. 필터링하고 나온 최종 요소들을 출력.
        // 최종 연산은 단 한 번만 가능하므로, sum()과 같이 사용하려고 하면 
        // 예외가 발생함.
        // stream2.forEach(System.out::println);

        // 스트림에서 연산이 일어나도 원본 데이터에 영향을 끼치지 않는다. 
        printIntArr(numArr);
    }
}
