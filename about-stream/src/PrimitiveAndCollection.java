import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User10 {
    String nickName;
    int point;

    User10(String nickName, int point) {
        this.nickName = nickName;
        this.point = point;
    }

    @Override
    public String toString() {
        return this.nickName + " : " + this.point;
    }
}

class PrimitiveAndCollection {
    public static void main(String[] args) {
        int[] numArray = {5, 2, 52, 12, 7}; 
        List<User10> userList = new ArrayList<>(Arrays.asList(
            new User10("bowWow110", 1000),
            new User10("goodAsWell99", 600),
            new User10("dogcat33", 2000)
        ));

        // 기본 자료형의 배열을 소스로 하는 스트림 생성법.
        Arrays.stream(numArray)
              .sorted()
              .forEach(n -> System.out.print(n + ", "));
        System.out.println();

        // 객체 데이터들이 담긴 컬렉션 자료구조를 소스로 하는 스트림 생성법.
        userList.stream()
                .sorted()
                .forEach(n -> System.out.print(n + ", "));
        System.out.println();
    }
}
