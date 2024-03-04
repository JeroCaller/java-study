public class SwitchExample {
    public static void main(String[] args) {
        int myScore = 100;
        char myGrade;

        switch(myScore / 10) {
            case 10:
            case 9:
                myGrade = 'A';
                break;
            case 8:
                myGrade = 'B';
                break;
            case 7:
            case 6:
            case 5:
                myGrade = 'C';
                break;
            case 4:
            case 3:
            case 2:
                myGrade = 'D';
                break;
            default:
                myGrade = 'F';
        }
        System.out.println(myGrade);
    }
}
