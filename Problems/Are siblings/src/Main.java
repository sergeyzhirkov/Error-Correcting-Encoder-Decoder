import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        return f1.getParent().equals(f2.getParent());
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\serge\\Downloads\\dataset_91007.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            arrayList.add(scanner.nextInt());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.get(arrayList.size() - 1));
        scanner.close();
    }
}