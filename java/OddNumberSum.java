public class OddNumberSum {
    public static void main(String[] args) {
        int start = 1;
        int end = 50;
        int sum = 0;

        for (int number = start; number <= end; number++) {
            if (number % 2 != 0) {
                sum += number;
            }
        }

        System.out.println("Sum of odd numbers between " + start + " and " + end + " is: " + sum);
    }
}
