// Write a program to check if two LinkedLists are equal.

import java.util.LinkedList;

public class CheckLinkedListEquality {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();

        a.add(1);
        a.add(2);
        b.add(1);
        b.add(2);

        boolean result = areEqual(a, b);
        System.out.println(result);
    }

    public static boolean areEqual(
            LinkedList<Integer> a, LinkedList<Integer> b) {

        return a.equals(b);
    }
}

