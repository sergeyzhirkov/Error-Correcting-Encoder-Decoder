import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int min = k;
        int countSeed = a;

        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            int max = 0;
            for (int j = 0; j < n; j++) {
                int randomInt = random.nextInt(k);
                if (randomInt > max) {
                    max = randomInt;
                }
            }
            if (max < min) {
                min = max;
                countSeed = i;
            }
        }
        System.out.println(countSeed);
        System.out.println(min);
    }
}