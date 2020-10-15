package correcter;

import java.io.*;

public class FileIO {
    public static final String SEND_PATH = "send.txt";
    public static final String ENCODED_PATH = "encoded.txt";
    public static final String RECIVED_PATH = "received.txt";
    public static final String DECODED_PATH = "decoded.txt";

    public String getStringFromInput(String inputPath) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath)))) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
        } catch (IOException e){
            return "";
        }
        return stringBuilder.toString();
    }

    public void writeStringToOutput(String outputString, String outputPath) {
        try (PrintStream printStream = new PrintStream(outputPath)) {
            printStream.print(outputString);
        } catch (IOException e) {
        }
    }
}
