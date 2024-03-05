public class InfoHiding {
    public static void main(String[] args) {
        PageMemeber me = new PageMemeber("가나다", "GaNaDa", 22, "IT 개발", 3000);
        me.printProfile();

        // 다음의 두 줄은 에러 발생.
        //me.point += 4000;
        //System.out.println(me.point);

        me.setPoint(5000);
        System.out.println(me.getPoint());
    }
}

class PageMemeber {
    String name;
    String userName;
    int age;
    String job;
    private int point;

    PageMemeber() {
        name = "홍길동";
        userName = "EastWest";
        age = 20;
        job = "유통업";
        point = 1000;
    }
    PageMemeber(String n, String un, int ag, String j, int p) {
        name = n;
        userName = un;
        age = ag;
        job = j;
        point = p;
    }

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

    // point 변수에 대한 getter 메서드.
    public int getPoint() {
        return point;
    }

    // point 변수에 대한 setter 메서드.
    public void setPoint(int point) {
        if (point < 0) {
            System.out.println("포인터가 음수가 될 수 없습니다.");
            return;
        }
        this.point = point;
    }
}