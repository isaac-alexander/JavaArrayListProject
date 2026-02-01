// Write a program to remove all duplicate elements from an ArrayList.

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println("Original list: " + list);

        ArrayList<Integer> result = removeDuplicates(list);
        System.out.println(result);
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }
}

