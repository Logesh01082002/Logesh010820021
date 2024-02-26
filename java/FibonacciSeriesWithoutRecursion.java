public class FibonacciSeriesWithoutRecursion {
    public static void main(String[] args) {
        int count = 10; // Number of Fibonacci numbers to generate

        System.out.println("Fibonacci Series:");
        generateFibonacciSeries(count);
    }

    public static void generateFibonacciSeries(int count) {
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 3; i <= count; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");

            num1 = num2;
            num2 = nextNum;
        }
    }
}
