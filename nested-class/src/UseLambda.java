interface RobotBluePrint2 {
    void moveTo(String direction);
}

interface Adder {
    int getAdd(int a, int b);
}

interface CombineStr {
    String getCombinedStr(String a, String b);
}

interface Printer {
    void printSomething();
}

class UseLambda {
    public static void main(String[] args) {
        RobotBluePrint2 robot;

        // 람다식 사용 예. 화살표 왼쪽에는 매개변수들을, 
        // 화살표 오른쪽에는 실행할 코드를 작성.
        robot = (String direction) -> {System.out.println(direction);};
        robot.moveTo("Up");

        // 매개변수가 하나일 경우 소괄호 생략 가능.
        // 중괄호 내 코드가 한 줄일 경우 중괄호 생략 가능.
        robot = direction -> System.out.println(direction);
        robot.moveTo("Down");

        Adder calc;

        // 중괄호 블록 내부에 값을 반환하는 반환문 하나만 존재한다면 
        // return 키워드와 중괄호 모두 생략가능.
        calc = (a, b) -> a + b;
        System.out.println(calc.getAdd(3, 1));

        CombineStr com;

        // 중괄호 블록 내에 return 문이 있을 경우, 중괄호 생략 불가능.
        com = (a, b) -> {return a + "-" + b;};
        System.out.println(com.getCombinedStr("hi", "good"));

        // 매개변수가 하나도 없다고 해서 소괄호를 생략해선 안된다.
        Printer prin = () -> System.out.println("hi");
        prin.printSomething();
    }
}
