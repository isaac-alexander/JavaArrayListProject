// Write a program to check if a HashSet is a subset of another HashSet.

import java.util.HashSet;

public class CheckHashSetSubset {
    public static void main(String[] args) {
        HashSet<Integer> big = new HashSet<>();
        HashSet<Integer> small = new HashSet<>();

        big.add(1); big.add(2); big.add(3);
        small.add(2); small.add(3);

        boolean result = isSubset(big, small);
        System.out.println(result);
    }

    public static boolean isSubset(
            HashSet<Integer> big, HashSet<Integer> small) {

        return big.containsAll(small);
    }
}
