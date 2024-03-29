import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

class ImprovedIOClose {
    public static void main(String[] args) {
        try (OutputStreamWriter output = new OutputStreamWriter(
            new FileOutputStream("IOStream/test3.txt"), "utf-8"
        )) {
            output.write("try ~ with ~ source를 적용한 텍스트");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
