// Write a program to find the frequency of each element in an ArrayList.


import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");

        int result = frequency(list, "A");
        int result2 = frequency(list, "B");
        int result3 = frequency(list, "B");
        System.out.println("A: " + result + " B: " + result2 + " C: " + result3);
    }

    public static int frequency(ArrayList<String> list, String value) {
        return Collections.frequency(list, value);
    }
}
