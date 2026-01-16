// Write a program to shuffle the elements of an ArrayList.


import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        Collections.shuffle(names);

        System.out.println(names);
    }
}
