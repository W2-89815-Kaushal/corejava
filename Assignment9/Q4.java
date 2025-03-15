package demo11;

import java.util.*;

public class MaxNumber {

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        T max = list.get(0);
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Double> list3 = new Vector<>();
        List<Float> list4 = new Stack<>();

        list1.add(10);
        list1.add(5);
        list1.add(15);
        list1.add(25);
        list1.add(20);

        list2.add(50);
        list2.add(30);
        list2.add(70);
        list2.add(60);
        list2.add(40);

        list3.add(25.5);
        list3.add(35.2);
        list3.add(10.7);
        list3.add(45.1);

        list4.add(3.5f);
        list4.add(2.7f);
        list4.add(4.8f);
        list4.add(1.9f);

        Integer max1 = findMax(list1);
        Integer max2 = findMax(list2);
        Double max3 = findMax(list3);
        Float max4 = findMax(list4);

        System.out.println("Max in list1: " + max1);
        System.out.println("Max in list2: " + max2);
        System.out.println("Max in list3: " + max3);
        System.out.println("Max in list4: " + max4);
    }
}
