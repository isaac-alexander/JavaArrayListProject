// Write a program to find the maximum element from an ArrayList of Integers.

import java.util.ArrayList;
import java.util.Collections;

public class FindMaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);

        int max = findMax(numbers);

        System.out.println("Maximum = " + max);
    }
    public static int findMax(ArrayList<Integer> list) {
        return Collections.max(list);
    }
}
