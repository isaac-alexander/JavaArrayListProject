// Write a program to find the second-largest element in an ArrayList of Integers.

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20);

        Collections.sort(numbers);

        System.out.println(numbers.get(numbers.size() - 2));
    }
}
