package correcter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        Encoder encoder = new Encoder(input);
        input = encoder.getEncodeString();
        System.out.println(input);
        Interference interference = new Interference(input);
        input = interference.getString();
        System.out.println(input);
        Decoder decoder = new Decoder(input);
        input = decoder.getDecodeString();
        System.out.println(input);
    }
}
