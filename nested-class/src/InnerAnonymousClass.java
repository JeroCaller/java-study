interface RobotBluePrint {
    void moveTo();
    void printMadeIn();
}

class Factory3 {
    String factoryName = "로봇조아";

    RobotBluePrint getRobot(String direction) {
        /* // 지역 내부 클래스
        class Robot3 implements RobotBluePrint {
            String goTo;

            Robot3(String goTo) {
                this.goTo = goTo;
            }

            public void moveTo() {
                System.out.printf("로봇이 %s 방향으로 움직입니다.\n", goTo);
            }

            public void printMadeIn() {
                // 외부 클래스의 멤버 변수에 접근 가능.
                System.out.printf("해당 로봇은 %s 회사에서 제작되었습니다.\n", factoryName);
            }
        }

        return new Robot3(direction); */
        // 익명 내부 클래스
        return new RobotBluePrint() {
            // 외부로부터 전달받을 인자가 있다면 이런 식으로 초기화하여 사용한다. 
            String goTo = direction;

            public void moveTo() {
                System.out.printf("로봇이 %s 방향으로 움직입니다.\n", goTo);
            }

            public void printMadeIn() {
                // 외부 클래스의 멤버 변수에 접근 가능.
                System.out.printf("해당 로봇은 %s 회사에서 제작되었습니다.\n", factoryName);
            }
        };
    }
}

class InnerAnonymousClass {
    public static void main(String[] args) {
        Factory3 fac = new Factory3();
        RobotBluePrint robot = fac.getRobot("Up");

        robot.moveTo();
        robot.printMadeIn();
    }
}
