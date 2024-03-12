class Device {
    String kind;

    Device(String kind) {
        this.kind = kind;
    }

    void showScreen() {
        System.out.println("화면이 켜졌습니다.");
    };
}

class Computer extends Device {
    int deviceId;

    Computer(String kind, int deviceId) {
        super(kind);
        this.deviceId = deviceId;
    }

    void showScreen() {
        System.out.println("컴퓨터 화면이 켜졌습니다. " + deviceId);
    }

    void printDeviceKind() {
        System.out.println(kind);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Device dev = new Computer("컴퓨터", 1002);
        dev.showScreen();
        // dev.printDeviceKind();  // 에러. 상위 클래스에는 해당 메서드가 없기 때문.

        // 에러. 더 큰 규모의 상위 클래스 객체를 더 작은 규모의 하위 클래스 참조 변수에 대입 불가.
        // Computer dev2 = new Device("컴퓨터");  
    }
}
