public class IntegerToDigits {
    public static void main(String[] args) {
        int number = 123456;

        System.out.println("Digits of the number " + number + ":");
        printDigits(number);
    }

    public static void printDigits(int number) {
        if (number == 0) {
            System.out.println(number); // Special case for number 0
            return;
        }

        int divisor = 1;
        int digit;
        boolean leadingZeros = true;

        while (number / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor > 0) {
            digit = (number / divisor) % 10;

            if (digit != 0) {
                leadingZeros = false; // Mark the end of leading zeros
            }

            if (!leadingZeros) {
                System.out.println(digit);
            }

            divisor /= 10;
        }
    }
}
