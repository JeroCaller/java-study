import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.Duration;
import java.time.Instant;

class FileCopyEx1 {
    public static void main(String[] args) {
        String src = "IOStream/src/FileReadEx.java";
        String dest = "IOStream/test3.txt";

        try (InputStreamReader reader = new InputStreamReader(
                new FileInputStream(src), "utf-8");
            OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream(dest), "utf-8")
            ) {
                // 복사 작업 시간을 구하기 위한 용도. 
                // 시작 시간 기록.
                Instant timeStart = Instant.now();

                // 복사 작업.
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
