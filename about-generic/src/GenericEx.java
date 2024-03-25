abstract class SiteBluePrint2 {
    String nickName;
    String siteName;
    String address;

    SiteBluePrint2(String nickName) {
        this.nickName = nickName;
    }

    // siteName을 가져오는 getter 메서드 추가
    public String getSiteName() {
        return this.siteName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class FoodSite2 extends SiteBluePrint2 {
    FoodSite2(String nickName) {
        super(nickName);
        this.siteName = "foodmarket";
    }
}

class BeautySite2 extends SiteBluePrint2 {
    BeautySite2(String nickName) {
        super(nickName);
        this.siteName = "beautysite";
    }
}

class EmailAddressMaker2<T extends SiteBluePrint2> {
    private T siteObj;

    void createAddress(T siteObj) {
        // 형변환 안해도 됨. 이미 제네릭에서 타입 매개변수의 타입을 SiteBluePrint2 객체로 한정했기 때문.
        // siteName을 가져오고, 이메일 주소를 생성하는 로직
        String email = siteObj.nickName + "@" + siteObj.getSiteName() + ".com";
        siteObj.setAddress(email); // 생성한 이메일 주소를 설정
        this.siteObj = siteObj;
    }

    T getSiteObj() {
        return this.siteObj;
    }
}

class GenericEx {
    public static void main(String[] args) {
        FoodSite2 foodUser = new FoodSite2("hanggicheum");
        BeautySite2 beautyUser = new BeautySite2("handsome123");
        EmailAddressMaker2<FoodSite2> foodEmail = new EmailAddressMaker2<>();
        EmailAddressMaker2<BeautySite2> beautyEmail = new EmailAddressMaker2<>();
        EmailAddressMaker2<FoodSite2> wrongEmail = new EmailAddressMaker2<>(); // 잘못된 코드.

        foodEmail.createAddress(foodUser);
        beautyEmail.createAddress(beautyUser);

        // 잘못된 입력. 에러가 발생함으로써 개발자의 실수를 바로 잡을 수 있음.
        // wrongEmail.createAddress("굳");

        // 형 변환 안해도 됨.
        foodUser = foodEmail.getSiteObj();
        beautyUser = beautyEmail.getSiteObj();

        System.out.println(foodUser.address);
        System.out.println(beautyUser.address);
        //System.out.println(wrongEmail.getSiteObj()); // 잘못된 코드.
    }
}