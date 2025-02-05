import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1};  // Example array

        // Remove duplicates using HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : array) set.add(num);

        // Print the updated array (unique elements)
        set.forEach(num -> System.out.print(num + " "));
    }
}
