package correcter;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        FileIO fileOperator = new FileIO();
        if (choose.equals("encode")) {
            String inputString = fileOperator.getStringFromInput(FileIO.SEND_PATH);
            Encoder encoder = new Encoder(inputString);
            fileOperator.writeStringToOutput(encoder.getEncodeString(), FileIO.ENCODED_PATH);
        }
        if (choose.equals("send")) {
            String inputString = fileOperator.getStringFromInput(FileIO.ENCODED_PATH);
            Interference interference = new Interference(inputString);
            fileOperator.writeStringToOutput(interference.getString(), FileIO.RECIVED_PATH);
        }
//        FileIO fileOperator = new FileIO();
//        String inputString = fileOperator.getStringFromInput();
//        Interference interference = new Interference(inputString);
//        fileOperator.writeStringToOutput(interference.getString());

    }
}
