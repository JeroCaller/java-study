import java.util.Random;

class UseRandom {
    public static void printRandRepeatly(Random rand, int endNum, int repeatNum) {
        for(int i = 0; i < repeatNum; i++) {
            System.out.print(rand.nextInt(endNum) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random completelyRand = new Random();
        Random seedRand = new Random(102134);
        int rangeEnd = 10;
        int repeatNum = 10;

        System.out.println(completelyRand.nextInt());

        printRandRepeatly(completelyRand, rangeEnd, repeatNum);
        printRandRepeatly(seedRand, rangeEnd, repeatNum);
    }
}
