import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

class FileCopyWithBuffer {
    public static void main(String[] args) {
        String src = "IOStream/src/FileReadEx.java";
        String dest = "IOStream/test3.txt";

        try(BufferedInputStream reader = new BufferedInputStream(
            new FileInputStream(src));
            BufferedOutputStream writer = new BufferedOutputStream(
                new FileOutputStream(dest))
        ) {
            Instant timeStart = Instant.now();

            // buffer 역할을 할 byte[] 배열 변수를 선언할 필요가 없다.
            
            int data;
            while(true) {
                data = reader.read();
                if(data == -1) {
                    break;
                }
                writer.write(data);
            }

            Instant timeEnd = Instant.now();
            System.out.println("복사 시간 : " + 
            Duration.between(timeStart, timeEnd).toMillis() + "초");
        } catch(IOException e) {
            System.out.println("에러 발생");
            e.printStackTrace();
        }
    }
}
