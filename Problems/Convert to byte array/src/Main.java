import java.io.IOException;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        int charArrayLength = 0;
        for (String s : words
        ) {
            charArrayLength += s.length();
        }
        char[] resultCharArray = new char[charArrayLength];
        int countSymbols = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                resultCharArray[countSymbols++] = word.charAt(i);
            }
        }
        return resultCharArray;
    }
}