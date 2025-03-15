package demo06;
import java.util.ArrayList;
import java.util.Collections;

public class ColorList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        
        Collections.sort(colors);
        
        System.out.println(colors);
    }
}
