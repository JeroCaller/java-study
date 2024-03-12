class TextBook {
    String bookKind;
}

class Korean extends TextBook {
    Korean() {bookKind = "국어";}
}

class Math extends TextBook {
    Math() {bookKind = "수학";}
}

class English extends TextBook {
    English() {bookKind = "영어";}
}

class Study {
    void printWhatYouStudy(TextBook tb) {
        System.out.println(tb.bookKind + " 과목을 공부하고 있습니다.");
    }
}

public class PolyEx1 {
    public static void main(String[] args) {
        Korean koreanBook = new Korean();
        Math mathBook = new Math();
        English engBook = new English();
        Study study = new Study();

        study.printWhatYouStudy(koreanBook);
        study.printWhatYouStudy(mathBook);
        study.printWhatYouStudy(engBook);
    }
}
