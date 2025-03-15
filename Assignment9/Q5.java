package demo12;

import java.util.*;

public class ColorSet {
    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Orange");

        System.out.println("TreeSet of Colors: " + colors);
    }
}
