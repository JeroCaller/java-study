import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializeObjectEx {
    public static void main(String[] args) {
        try(FileInputStream filein = new FileInputStream("IOStream/obj-data.bin");
            ObjectInputStream objinStre = new ObjectInputStream(filein)) {
            User12 foodSiteUser = (User12)objinStre.readObject();
            System.out.println(foodSiteUser.getNickName());
            System.out.println(foodSiteUser.getUniqueNumber());
            foodSiteUser.printProfile();

            User12 beautySiteUser = (User12)objinStre.readObject();
            System.out.println(beautySiteUser.getNickName());
            System.out.println(beautySiteUser.getUniqueNumber());
            beautySiteUser.printProfile();
        } catch(IOException e) {
            System.out.println("=== 입출력 예외 발생 ===");
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            System.out.println("대상 클래스 발견 못함.");
            e.printStackTrace();
        }
    }
}
