import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class FileWriterEx {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("IOStream/test4.txt")) {
            writer.write((int)'A');
            writer.write("\nTest code.\n");
            writer.write("If you wanna write or read non-english such as Korean in the text file, \n");
            writer.write("It's recommended that you use InputStreamReader and OutputStreamWriter instead.\n");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
