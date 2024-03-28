class Factory {
    String factoryName = "로봇조아";

    class Robot {
        public String goTo = "left";

        void moveTo() {
            System.out.printf("로봇이 %s 방향으로 움직입니다.\n", goTo);
        }

        void printMadeIn() {
            // 외부 클래스의 멤버 변수에 접근 가능.
            System.out.printf("해당 로봇은 %s 회사에서 제작되었습니다.\n", factoryName);
        }
    }

    void moveRobot() {
        // 외부 클래스에서 멤버 내부 클래스를 사용할 수 있다. 
        Robot robot = new Robot();
        robot.goTo = "right";
        robot.moveTo();
    }

    Robot getRobot() {
        return new Robot();
    }
}

class MemberInnerClass {
    public static void main(String[] args) {
        // 외부 클래스의 인스턴스 생성
        Factory fac = new Factory();
        fac.moveRobot();

        // 외부 클래스의 멤버 내부 클래스를 직접 인스턴스화.
        Factory.Robot innerRobot = fac.new Robot();
        // Factory.Robot innerRobot = new Factory().new Robot();
        innerRobot.goTo = "up";
        innerRobot.moveTo();
        innerRobot.printMadeIn();

        // 멤버 내부 클래스의 인스턴스를 반환하는 getter 메서드를 통해 
        // 멤버 내부 클래스의 인스턴스를 변수에 초기화함.
        Factory.Robot returnedRobot = fac.getRobot();
        returnedRobot.moveTo();
        returnedRobot.printMadeIn();
    }
}
