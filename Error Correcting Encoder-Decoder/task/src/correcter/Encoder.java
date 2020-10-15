package correcter;

public class Encoder {
    private String input;
    private StringBuilder output;
    public static final String MASK = "00000000";

    public Encoder(String input) {
        this.input = input;
        output = new StringBuilder();
    }

    private void encode() {
        for (int i = 0; i < input.length(); i++) {
            int k = Integer.parseInt((int) (input.charAt(i)) + "");
            String stringToParse = Integer.toString(k, 2);
            output.append(MASK.substring(0, MASK.length() - stringToParse.length()));
            output.append(stringToParse);
        }
        System.out.println(output.toString());
    }

    private void encode2() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3 - (output.length() % 3); i++) {
            output.append("0");
        }
        int count = 0;
        for (int i = 0; i < output.length(); i++) {
            sb.append(output.charAt(i));
            sb.append(output.charAt(i));
            count += output.charAt(i) - '0';
            if (i % 3 == 2) {
                char insertChar = (char) ((int) ('0') + (count % 2));
                sb.append(insertChar);
                sb.append(insertChar);
                count = 0;
            }
        }
        output = sb;
        System.out.println(output.toString());
    }

    private void encode3() {
        StringBuilder sb = new StringBuilder();
        byte[] array = new byte[output.length()/8];
        System.out.println(array.length);
        for (int i = 0; i < output.length() /8 ; i++) {
            String number = output.substring(i*8,i*8+8);
            sb.append((char)(Integer.parseInt(number, 2)));
            array[i] = (byte)(Integer.parseInt(number,2));
        }
        output = sb;
        output = new StringBuilder(new String(array));
        System.out.println(output.toString());
    }

    public String getEncodeString() {
        encode();
        encode2();
        encode3();
        return output.toString();
    }
}
