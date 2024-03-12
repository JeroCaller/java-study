class Device2 {}

class Computer2 extends Device2 {
    String kind = "컴퓨터";

    void printKind() {
        System.out.println(kind);
    }
}

class Phone2 extends Device2 {
    String kind = "폰";

    void printKind() {
        System.out.println(kind);
    }
}

class DeviceDetector {
    Device2 execMethod(Device2 dev) {
        if (dev instanceof Computer2) {
            Computer2 co = (Computer2)dev;
            co.printKind();
            return co;
        } else {
            Phone2 ph = (Phone2)dev;
            ph.printKind();
            return ph;
        }
    }
}

public class InstOfEx {
    public static void main(String[] args) {
        Device2 dev = new Device2();
        Computer2 com = new Computer2();
        Phone2 ph = new Phone2();
        DeviceDetector dd = new DeviceDetector();

        System.out.println(com instanceof Computer2);
        System.out.println(ph instanceof Phone2);
        System.out.println(com instanceof Device2);
        System.out.println(ph instanceof Device2);
        System.out.println(dev instanceof Computer2);
        dd.execMethod(com);
    }
}
