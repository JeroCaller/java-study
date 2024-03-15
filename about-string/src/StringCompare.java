public class StringCompare {
    public static void printIfMatchStrs(String s1, String s2) {
        if(s1.equals(s2)) {
            System.out.println("Match");
        } else {
            System.out.println("Dismatch");
        }
    }

    public static void printCompareStrs(String s1, String s2, boolean ignoreCase) {
        int compareNum;
        
        if(ignoreCase) {
            compareNum = s1.compareToIgnoreCase(s2);
        } else {
            compareNum = s1.compareTo(s2);
        }

        if(compareNum == 0) {
            System.out.print("Match");
        } else if(compareNum > 0) {
            System.out.print(s1 + " > " + s2);
        } else {
            System.out.print(s1 + " < " + s2);
        }
        System.out.print(" | ");
        System.out.println("compare number: " + compareNum);
    }

    public static void main(String[] args) {
        String strObj1 = new String("wow");
        String strObj2 = new String("Wow");
        String strObj3 = new String("bow");
        String strObj4 = "good";

        printIfMatchStrs(strObj1, strObj2);
        printCompareStrs(strObj1, strObj2, true);
        printCompareStrs(strObj1, strObj2, false);
        printCompareStrs(strObj3, strObj4, false);
    }
}
