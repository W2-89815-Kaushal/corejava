package demo09;

import java.io.*;

public class HiddenFile {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        if (file.isHidden()) {
            System.out.println("File is hidden.");
        } else {
            System.out.println("File is not hidden.");
        }
    }
}
