import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class FileReadEx {
    public static void main(String[] args) {
        try(InputStreamReader readFile = new InputStreamReader(
            new FileInputStream("IOStream/test3.txt"), "utf-8")) {
            int ch;
            while(true) {
                ch = readFile.read();
                if(ch == -1) {
                    break;
                }
                System.out.print((char)ch);
            }
            System.out.println();
        } catch(IOException e) {
            System.out.println("예외 발생");
            e.printStackTrace();
        }
    }
}
