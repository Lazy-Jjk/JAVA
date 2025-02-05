import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};  // First array
        int[] array2 = {3, 4, 5, 6, 7};  // Second array

        // Use HashSet to find common elements
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) set1.add(num);
        
        for (int num : array2) if (set1.contains(num)) System.out.print(num + " ");
    }
}
