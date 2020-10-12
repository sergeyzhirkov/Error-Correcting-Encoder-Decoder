package correcter;

public class Encoder {
    private String input;
    private StringBuilder output;

    public Encoder(String input) {
        this.input = input;
        output = new StringBuilder();
    }

    private void encode() {
        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(i));
            output.append(input.charAt(i));
            output.append(input.charAt(i));
        }
    }

    public String getEncodeString() {
        encode();
        return output.toString();
    }
}
