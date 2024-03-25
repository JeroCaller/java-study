abstract class SiteBluePrint {
    String nickName;
    String siteName;
    String address;

    SiteBluePrint(String nickName) {
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

class FoodSite extends SiteBluePrint {
    FoodSite(String nickName) {
        super(nickName);
        this.siteName = "foodmarket";
    }
}

class BeautySite extends SiteBluePrint {
    BeautySite(String nickName) {
        super(nickName);
        this.siteName = "beautysite";
    }
}

class EmailAddressMaker {
    private Object siteObj;

    void createAddress(Object siteObj) {
        // 성가신 형변환...
        // siteName을 가져오고, 이메일 주소를 생성하는 로직
        if (siteObj instanceof SiteBluePrint) {
            String email = ((SiteBluePrint)siteObj).nickName + "@" + ((SiteBluePrint)siteObj).getSiteName() + ".com";
            ((SiteBluePrint)siteObj).setAddress(email); // 생성한 이메일 주소를 설정
        }
        this.siteObj = siteObj;
    }
    
    Object getSiteObj() {
        return this.siteObj;
    }
}

class NoneGenericEx {
    public static void main(String[] args) {
        FoodSite foodUser = new FoodSite("hanggicheum");
        BeautySite beautyUser = new BeautySite("handsome123");
        EmailAddressMaker foodEmail = new EmailAddressMaker();
        EmailAddressMaker beautyEmail = new EmailAddressMaker();
        EmailAddressMaker wrongEmail = new EmailAddressMaker();

        foodEmail.createAddress(foodUser);
        beautyEmail.createAddress(beautyUser);

        // 잘못된 입력. 그런데 에러가 발생하지 않는다.
        wrongEmail.createAddress("굳");

        // 형변환(type casting) 필요.
        foodUser = (FoodSite)foodEmail.getSiteObj();
        beautyUser = (BeautySite)beautyEmail.getSiteObj();

        System.out.println(foodUser.address);
        System.out.println(beautyUser.address);
        System.out.println(wrongEmail.getSiteObj());  // 잘못된 코드.
    }
}
