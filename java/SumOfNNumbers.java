import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = calculateSum(n);

        System.out.println("Sum of the first " + n + " numbers is: " + sum);

        scanner.close();
    }

    public static int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
