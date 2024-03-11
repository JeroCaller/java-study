interface SomeInter {
    int interNum = 1000;
    void printInfo();
}

class Person implements SomeInter {
    String name;
    String job;
    int uniqueId;

    Person(String name, String job, int id) {
        this.name = name;
        this.job = job;
        this.uniqueId = id;
    }

    public void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("직업 : " + job);
        System.out.println("id : " + uniqueId);
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Person me = new Person("가나다", "시민", 10000);
        me.printInfo();
    }
}
