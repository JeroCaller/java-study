import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

class StringWriteWithTryCatch {
    public static void main(String[] args) {
        OutputStreamWriter textWriter = null;

        // FileWriter()는 문자열을 파일 대상으로 출력시켜 
        // 파일에 정보를 기록할 때 사용하는 클래스.

        try {
            textWriter = new OutputStreamWriter(
                new FileOutputStream("IOStream/test2.txt"), "utf-8");
            textWriter.write("안녕하세요. 텍스트 파일에 저장된 텍스트입니다.");
            // close() 메서드 호출을 하지 않아 파일을 닫는 것을 깜빡했다.
        } catch (IOException e) {}
        finally {
            // finally 구문을 통해 파일을 무조건 닫게끔 하고 있음.
            if (textWriter != null) {
                // close() 메서드를 호출할 때에도 예외가 발생할 수도 있다고 함.
                try {
                    textWriter.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
