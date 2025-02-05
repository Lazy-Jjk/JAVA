public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};  // Example array
        int valueToRemove = 3;  // Element to remove

        // Remove the element
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                newArray[j++] = array[i];
            }
        }

        // Print the new array
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
