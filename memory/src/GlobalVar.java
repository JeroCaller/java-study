class Consumer {
    static int bankMoney = 1000;
    int myMoney = 0;
    String name = "";

    Consumer(String name, int myMoney) {
        this.name = name;
        this.myMoney = myMoney;
    }

    void printMoney() {
        System.out.printf("====== %s ======\n", this.name);
        System.out.println("내 머니 : " + myMoney);
        System.out.println("은행이 소유한 총 금액: " + bankMoney);
        System.out.println("============");
    }
}

public class GlobalVar {
    public static void main(String[] args) {
        Consumer person1 = new Consumer("냥이", 300);
        person1.bankMoney = 1500;
        person1.printMoney();

        Consumer person2 = new Consumer("멍이", 500);
        person2.bankMoney = 1200;
        person2.printMoney();
        person1.printMoney();
    }
}
