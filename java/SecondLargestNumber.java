public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 20, 15, 25 };
        int secondLargest = findSecondLargest(numbers);

        System.out.println("The second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        return secondLargest;
    }
}
