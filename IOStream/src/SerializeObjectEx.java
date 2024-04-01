import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User12 implements Serializable {
    private String nickName;
    private int uniqueNumber;

    User12(String nickName, int uniqueNumber) {
        this.nickName = nickName;
        this.uniqueNumber = uniqueNumber;
    }

    String getNickName() {
        return this.nickName;
    }

    int getUniqueNumber() {
        return uniqueNumber;
    }

    void printProfile() {
        System.out.println("=== 사용자 정보 ===");
        System.out.println("닉네임 : " + this.nickName);
        System.out.println("고유번호 : " + this.uniqueNumber);
        System.out.println("====================");
    }
}

class SerializeObjectEx {
    public static void main(String[] args) {
        User12 foodSiteUser = new User12("bowWow123", 1523);
        User12 beautySiteUser = new User12("great230", 39);

        try(FileOutputStream fileout = new FileOutputStream("IOStream/obj-data.bin");
            ObjectOutputStream objoutStream = new ObjectOutputStream(fileout)) {
            objoutStream.writeObject(foodSiteUser);
            objoutStream.writeObject(beautySiteUser);
        } catch(IOException e) {
            System.out.println("=== 입출력 관련 예외 발생 ===");
            e.printStackTrace();
        }
    }
}
