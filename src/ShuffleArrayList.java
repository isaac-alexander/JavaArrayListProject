// Write a program to shuffle the elements of an ArrayList.


import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        ArrayList<String> result = shuffle(list);
        System.out.println(result);
    }

    public static ArrayList<String> shuffle(ArrayList<String> list) {
        Collections.shuffle(list);
        return list;
    }

}
