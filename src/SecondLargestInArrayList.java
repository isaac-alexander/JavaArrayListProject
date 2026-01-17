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

        int result = secondLargest(numbers);
        System.out.println(result);
    }

    public static int secondLargest(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(numbers.size() - 2);
    }
}
