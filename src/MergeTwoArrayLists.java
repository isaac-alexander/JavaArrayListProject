// Write a program to merge two ArrayLists into a single ArrayList.


import java.util.ArrayList;

public class MergeTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");

        ArrayList<String> b = new ArrayList<>();
        b.add("C");

        ArrayList<String> result = merge(a, b);
        System.out.println(result);
    }

    public static ArrayList<String> merge(
            ArrayList<String> a, ArrayList<String> b) {

        ArrayList<String> result = new ArrayList<>(a);
        result.addAll(b);
        return result;
    }
}
