package correcter;

public class Decoder {
    private String input;
    private StringBuilder sb;

    public Decoder(String input) {
        this.input = input;
        sb = new StringBuilder();
    }

    private void decode() {
        for (int i = 0; i < input.length() / 3; i++) {
            char c1 = input.charAt(3 * i);
            char c2 = input.charAt(3 * i + 1);
            char c3 = input.charAt(3 * i + 2);
            if (c1 == c2) {
                sb.append(c1);
            } else if (c2 == c3) {
                sb.append(c2);
            } else {
                sb.append(c3);
            }
        }
    }

    public String getDecodeString() {
        decode();
        return sb.toString();
    }
}
