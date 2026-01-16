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

        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}
