// Write a program to find the intersection of two ArrayLists.

import java.util.ArrayList;

public class IntersectionOfTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(3); b.add(4); b.add(5); b.add(6);

        System.out.println("Original list: " + a);
        System.out.println("Original list: " + b);

        ArrayList<Integer> result = intersection(a, b);

        System.out.println(result);
    }

    public static ArrayList<Integer> intersection(
            ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> result = new ArrayList<>(a);
        result.retainAll(b);
        return result;
    }
}
