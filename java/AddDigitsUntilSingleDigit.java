public class AddDigitsUntilSingleDigit {
    public static void main(String[] args) {
        int number = 9875;
        int result = addDigits(number);

        System.out.println("Final Result: " + result);
    }

    public static int addDigits(int number) {
        while (number > 9) {
            int sum = 0;

            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            number = sum;
        }

        return number;
    }
}