import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;  // 리스트 정렬에 쓰임.

public class LottoGenerator {
    // private LottoGenerator() {}  // 인스턴스화 방지 코드.

    public static ArrayList getSixLotto() {
        ArrayList lottoNumbers = new ArrayList();
        ArrayList AllNumbers = new ArrayList();
        Random rand = new Random();

        // 1부터 45까지의 자연수들을 AllNumbers 변수에 초기화.
        for(int i = 1; i < 46; i++) {
            AllNumbers.add(i);
        }

        // 무작위로 중복되지 않는 숫자 6개를 뽑음.
        for(int i = 0; i < 6; i++) {
            int AllNumIdx = rand.nextInt(0, AllNumbers.size());
            lottoNumbers.add(AllNumbers.remove(AllNumIdx));
        }

        lottoNumbers.sort(Comparator.naturalOrder());
        return lottoNumbers;
    }
}
