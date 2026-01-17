// Write a program to find the kth smallest element in an ArrayList.


import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);

        int result = kthSmallest(list, 2);
        System.out.println(result);
    }

    public static int kthSmallest(ArrayList<Integer> list, int k) {
        Collections.sort(list);
        return list.get(k - 1);
    }
}
