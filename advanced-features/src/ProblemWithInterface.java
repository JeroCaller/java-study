interface MainFoodCode {
    int HAMBURGER = 10;
    int POTATOSTICK = 15;
}

interface Beverages {
    int COLA = 10;
    int MILK = 15;
}

class ProblemWithInterface {
    public static void printYourMainOrder(int menu) {
        String yourMenu = "";
        switch(menu) {
            case MainFoodCode.HAMBURGER:
                yourMenu = "햄버거";
                break;
            case MainFoodCode.POTATOSTICK:
                yourMenu = "감자튀김";
                break;
        }
        System.out.printf("주문하신 %s 나왔습니다!\n", yourMenu);
    }

    public static void main(String[] args) {
        printYourMainOrder(MainFoodCode.HAMBURGER);
        printYourMainOrder(Beverages.COLA);
    }
}
