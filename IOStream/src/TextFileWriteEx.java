import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class TextFileWriteEx {
    public static void main(String[] args) throws IOException {
        OutputStream outStream = new FileOutputStream("IOStream/test.txt");

        outStream.write(67);
        outStream.close();
    }
}
