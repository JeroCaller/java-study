enum MainFoodCode2 {HAMBURGER, POTATOSTICK}
enum Beverages2 {COLA, MILK}

class solveWithEnum {
    public static void printYourMainOrder(MainFoodCode2 menu) {
        String yourMenu = "";
        switch(menu) {
            case HAMBURGER:
                yourMenu = "햄버거";
                break;
            case POTATOSTICK:
                yourMenu = "감자튀김";
                break;
        }
        System.out.printf("주문하신 %s 나왔습니다!\n", yourMenu);
    }

    public static void printYourBeverageOrder(Beverages2 bev) {
        String yourMenu = "";
        switch(bev) {
            case COLA:
                yourMenu = "콜라";
                break;
            case MILK:
                yourMenu = "우유";
                break;
        }
        System.out.printf("주문하신 %s 나왔습니다!\n", yourMenu);
    }

    public static void main(String[] args) {
        printYourMainOrder(MainFoodCode2.HAMBURGER);
        // printYourMainOrder(Beverages.COLA);  // 에러

        printYourBeverageOrder(Beverages2.COLA);

        System.out.println(MainFoodCode2.HAMBURGER instanceof Enum);
    }
}
