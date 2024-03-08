public class Sample {
    public static void main(String[] args) {
        SimpleObj sim = new SimpleObj();
        sim.printNumber();
    }
}

class SimpleObj {
    int number = 100;

    void printNumber() {
        System.out.println(this.number);
    }
}