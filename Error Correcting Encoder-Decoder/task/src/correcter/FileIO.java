package correcter;

import java.io.*;

public class FileIO {
    public static final String INPUT_PATH = "send.txt";
    public static final String OUTPUT_PATH = "received.txt";

    public String getStringFromInput() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(INPUT_PATH)))) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
        } catch (IOException e){
            return "";
        }
        return stringBuilder.toString();
    }

    public void writeStringToOutput(String outputString) {
        try (PrintStream printStream = new PrintStream(OUTPUT_PATH)) {
            printStream.print(outputString);
        } catch (IOException e) {
        }
    }
}
