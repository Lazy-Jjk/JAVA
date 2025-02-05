public class ArrayContains {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};  // Example array
        int valueToCheck = 3;  // Value to check

        // Check if array contains the specific value
        boolean contains = false;
        for (int num : array) {
            if (num == valueToCheck) {
                contains = true;
                break;
            }
        }

        // Output result
        System.out.println("Array contains " + valueToCheck + ": " + contains);
    }
}
