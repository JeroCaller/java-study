import java.util.ArrayList;

public class LottoExample {
    public static void main(String[] args) {
        LottoGenerator lotge = new LottoGenerator();
        ArrayList lastWeek = lotge.getSixLotto();
        System.out.println(lastWeek);

        ArrayList thisWeek = LottoGenerator.getSixLotto();
        System.out.println(thisWeek);
    }
}
