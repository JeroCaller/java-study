import java.io.Serializable;

public class AddressInfo implements Serializable {
    String name;
    String phoneNum;
    String email;

    public AddressInfo(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public AddressInfo(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public void showAddressInfo() {
        System.out.println("====== 연락처 정보 ======");
        System.out.println("이름 : " + name);
        System.out.println("전화 번호 : " + phoneNum);
        if (email != null) {
            System.out.println("이메일 주소 : " + email);
        }
        System.out.println("=======================");
    }
}
