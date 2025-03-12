import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String To Count Words:");
        String s = sc.nextLine().trim(); 
        int wordcount = 0;
        boolean isWord = false; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (!isWord) {
                    wordcount++; 
                    isWord = true; 
                }
            } else {
                isWord = false; 
            }
        }

        System.out.println("Total words: " + wordcount);
    }
}
