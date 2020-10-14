import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String inputString = bufferedReader.readLine();
        byte[] bytes = inputString.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte);
        }
    }
}