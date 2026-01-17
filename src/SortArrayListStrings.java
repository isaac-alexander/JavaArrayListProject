// Write a program to sort an ArrayList of Strings alphabetically.



import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mimi");
        names.add("Stephen");
        names.add("Alex");
        names.add("Mercy");

        ArrayList<String> result = sortNames(names);

        System.out.println(result);
    }

    public static ArrayList<String> sortNames(ArrayList<String> list) {
        Collections.sort(list);
        return list;
    }
}
