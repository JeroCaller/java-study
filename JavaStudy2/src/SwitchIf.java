public class SwitchIf {
    public static void main(String[] args) {
        // SwitchExample.java 내 내용을 if문으로 재구성함.
        int myScore = 100;
        char myGrade;
        int q = myScore / 10;

        if (9 <= q && q <= 10) {
            myGrade = 'A';
        } else if (q == 8) {
            myGrade = 'B';
        } else if (5 <= q && q <= 7) {
            myGrade = 'C';
        } else if (2 <= q && q <= 4) {
            myGrade = 'D';
        } else {
            myGrade = 'F';
        }
        System.out.println(myGrade);
    }
}
