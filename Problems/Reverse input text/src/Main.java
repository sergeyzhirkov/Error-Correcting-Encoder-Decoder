import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder(reader.readLine());
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
        reader.close();
    }
}