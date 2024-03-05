public class ConstructorEx {
    public static void main(String[] args) {
        HomePageMember me = new HomePageMember();
        me.printProfile();

        HomePageMember me2 = new HomePageMember("가나다", "GaNaDa", 22, "IT 개발", 2000);
        me2.printProfile();
    }
}

class HomePageMember {
    // 필드(데이터)
    String name;
    String userName;
    int age;
    String job;
    int point;

    HomePageMember() {
        name = "홍길동";
        userName = "EastWest";
        age = 20;
        job = "유통업";
        point = 1000;
    }
    HomePageMember(String n, String un, int ag, String j, int p) {
        name = n;
        userName = un;
        age = ag;
        job = j;
        point = p;
    }

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