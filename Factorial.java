public class Factorial{
    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
