import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

class FileCopyEx2 {
    public static void main(String[] args) {
        String src = "IOStream/src/FileReadEx.java";
        String dest = "IOStream/test3.txt";

        try(InputStream reader = new FileInputStream(src);
            OutputStream writer = new FileOutputStream(dest)) {
            byte[] buf = new byte[1024]; // 1kb 크기의 버퍼
            int len;
            Instant timeStart = Instant.now();

            while(true) {
                len = reader.read(buf);
                if (len == -1) {
                    break;
                }
                writer.write(buf, 0, len);
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
