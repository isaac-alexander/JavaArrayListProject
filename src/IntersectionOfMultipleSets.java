// Write a program to find the intersection of multiple Sets.


import java.util.HashSet;

public class IntersectionOfMultipleSets {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();

        a.add(1); a.add(2);
        b.add(2); b.add(3);
        c.add(2); c.add(4);

        HashSet<Integer> result = intersect(a, b, c);
        System.out.println(result);
    }

    public static HashSet<Integer> intersect(
            HashSet<Integer> a, HashSet<Integer> b, HashSet<Integer> c) {

        HashSet<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        result.retainAll(c);
        return result;
    }
}
