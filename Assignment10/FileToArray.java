package demo09;

import java.io.*;
import java.util.*;

public class FileToArray {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        
        String[] arr = lines.toArray(new String[0]);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
