public class Fibonacci {
    public static void main(String[] args) {
        int terms = 10;
        printFibonacci(terms);
    }
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
