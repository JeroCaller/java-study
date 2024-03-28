class Factory2 {
    String factoryName = "로봇조아";

    void showDemonstration() {
        class Robot2 {
            public String goTo = "left";

            void moveTo() {
                System.out.printf("로봇이 %s 방향으로 움직입니다.\n", goTo);
            }
    
            void printMadeIn() {
                // 외부 클래스의 멤버 변수에 접근 가능.
                System.out.printf("해당 로봇은 %s 회사에서 제작되었습니다.\n", factoryName);
            }
        }

        System.out.println("로봇 시연회");
        System.out.println("저희 로봇 제조 비법은 비밀이랍니다~!");
        Robot2 rob = new Robot2();
        rob.moveTo();
        rob.printMadeIn();
    }
}

class LocalInnerClass {
    public static void main(String[] args) {
        Factory2 fac = new Factory2();

        fac.showDemonstration();
    }
}
