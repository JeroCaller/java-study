import java.util.ArrayList;
import java.util.Arrays;

class SiteUser {
    String userName;
    String siteName = "Yeah";
    int myPoint;
    ArrayList shoppingBasket = null;

    SiteUser(String userName, int point) {
        this.userName = userName;
        this.myPoint = point;
    }

    void printProfile() {
        System.out.println("======================");
        System.out.println("사이트명: " + siteName);
        System.out.println("유저 네임 : " + userName);
        System.out.println("현재 보유 포인트 : " + myPoint);
        System.out.println("현재 장바구니 : " + shoppingBasket);
        System.out.println("======================");
    }
}

class FoodMarketUser extends SiteUser {
    String favoriteFood;

    FoodMarketUser(String userName, int point, String favoriteFood) {
        super(userName, point);
        this.favoriteFood = favoriteFood;
        siteName = "푸드 마켓";
    }

    void printFoodMarket() {
        printProfile();
        System.out.println("가장 좋아하는 음식 : " + favoriteFood);
        System.out.println("======================");
    }
}

class BookStoreUser extends SiteUser {
    int myBookNums;

    BookStoreUser(String userName, int point, int bookNums) {
        super(userName, point);
        this.myBookNums = bookNums;
        siteName = "서점";
    }

    void printBookStore() {
        printProfile();
        System.out.println("현재 보유 책 권수 : " + myBookNums);
        System.out.println("======================");
    }
}

public class MySite {
    public static void main(String[] args) {
        FoodMarketUser foodUser = new FoodMarketUser("healthyFood", 2000, "사과");
        foodUser.shoppingBasket = new ArrayList(Arrays.asList("바나나", "사과"));
        foodUser.printFoodMarket();

        BookStoreUser bookUser = new BookStoreUser("bookAndLib", 1000, 12);
        bookUser.shoppingBasket = new ArrayList(Arrays.asList("자바에 대한 모든 것", "코딩의 미래"));
        bookUser.printBookStore();
    }
}
