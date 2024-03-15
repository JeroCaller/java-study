import java.util.ArrayList;
import java.util.Arrays;

class MyString {
    String getConCated(ArrayList<String> stringArrayList) {
        String concated = new String();

        for(String ele : stringArrayList) {
            concated = concated.concat(ele);
        }
        return concated;
    }

    String getConCatedByStringBuilder(ArrayList<String> stringArrayList) {
        StringBuilder sb = new StringBuilder();

        for(String ele : stringArrayList) {
            sb.append(ele);
        }
        return sb.toString();
    }
}

class OtherConCat {
    public static void main(String[] args) {
        MyString stool = new MyString();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("파이썬", "자바", "자바스크립트", "CSS", "HTML"));
        
        System.out.println(stool.getConCated(strings));
        System.out.println(stool.getConCatedByStringBuilder(strings));
    }
}
