public class SumD {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + sum);
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  
            num /= 10;  
        }
        return sum;
    }
}
