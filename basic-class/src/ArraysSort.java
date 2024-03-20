import java.util.Arrays;

class User5 implements Comparable {
    String userId;
    int point;

    User5(String userId, int point) {
        this.userId = userId;
        this.point = point;
    }

    @Override
    public int compareTo(Object o) {
        User5 otherUser = (User5)o;

        // 현 객체의 변수값 > 비교 대상 객체의 변수값 에 대해 양수 반환 시
        // 이 객체의 배열을 정렬하면 오름차순으로 정렬됨.
        // 반대로, 같은 상황에서 음수 반환 시 
        // 내림차순으로 정렬됨. 

        // 오름차순 정렬을 위한 코드. 
        // 내림차순으로 바꾸고자 한다면 첫 if문의 반환값을 음수로, 
        // 두 번째 if문의 반환값을 양수로 바꾸면 된다. 
        if(this.point > otherUser.point) {
            return 1;
        } else if(this.point < otherUser.point) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return userId + " : " + point;
    }
}

class ArraysSort {
    public static void main(String[] args) {
        User5[] arr = {
            new User5("bowWow123", 2000),
            new User5("goodWorld111", 1000),
            new User5("checkGPT", 1500),
        };

        Arrays.sort(arr);

        for(User5 u : arr) {
            System.out.println(u);
        }
    }
}
