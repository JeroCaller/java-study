public class ClassAndObject {
    public static void main(String[] args) {
        // 클래스의 인스턴스 생성 및 변수에 할당.
        SiteMember me = new SiteMember();
        
        // 필드 접근
        me.name = "가나다";
        me.userName = "GaNaDa";
        me.age = 22;
        me.job = "IT 개발";
        me.point = 1000;

        // 메서드 호출
        me.welcome();
        me.printProfile();
    }
}

// 사용자 정의 클래스
class SiteMember {
    // 필드(데이터)
    String name;
    String userName;
    int age;
    String job;
    int point;

    // 메서드(동작)
    void welcome() {
        System.out.printf("어서오세요, %s님.\n", userName);
    }

    void printProfile() {
        System.out.println("===== 회원 정보 =====");
        System.out.println("이름 : " + name);
        System.out.println("유저 닉네임 : " + userName);
        System.out.println("나이 : " + age);
        System.out.println("직업 : " + job);
        System.out.println("현재 포인트 : " + point);
        System.out.println("=====================");
    }
}