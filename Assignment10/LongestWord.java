package demo09;
import java.io.*;
import java.util.*;

public class LongestWord {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String longestWord = "";
        
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        reader.close();
        
        System.out.println("Longest word: " + longestWord);
    }
}
