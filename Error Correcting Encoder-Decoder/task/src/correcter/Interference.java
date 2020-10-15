package correcter;

public class Interference {
    private StringBuilder sb;

    public Interference(String input) {
        this.sb = new StringBuilder(input);
    }

    private void toInterference() {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) % 2 == 0) {
                sb.setCharAt(i, (char) (sb.charAt(i) + 1));
            } else {
                sb.setCharAt(i, (char) (sb.charAt(i) - 1));
            }
        }
    }

    public String getString() {
        toInterference();
        return sb.toString();
    }
}
