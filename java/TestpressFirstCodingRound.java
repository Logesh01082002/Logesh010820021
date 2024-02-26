import java.util.Scanner; 
import java.util.Arrays;

class TestpressFirstCodingRound {
	Scanner input = new Scanner(System.in);

	void questionOne() {
		/**
		 * 1) Write a program to print the reverse of the given string.
		 * ::input
		 * 	codecode
		 * ::output
		 * 	edocedoc
		 * 
		 * ::input constraints
		 * 	1<=Length of string<=100
		 * 	Input string contains only lowercase characters ['a' to 'z'].
		 * */

		System.out.println("Question 1)");
		System.out.print("Enter a string: ");
		String value = this.input.nextLine();

		// converting the characters of the string into char array
		char[] valueArray = value.toCharArray();

		// swapping the character from both end to centre direction (Like. `-> <-`)
		int start = 0;
		int end = valueArray.length;
		while (start < end) {
			char letter = valueArray[--end];
			valueArray[end] = valueArray[start];
			valueArray[start++] = letter;
		}
		System.out.println(new String(valueArray));
	}


	void questionTwo() {
		/**
		 * 2) Given a number, check whether it is a prime number or not.
		 * ::input - 1
		 * 	3
		 * ::output - 1
		 * 	Yes
		 * 
		 * ::input - 2
		 * 	4
		 * ::output - 2
		 * 	No
		 * */

		System.out.println("\nQuestion 2)");
		System.out.print("Enter a number: ");
		int value = this.input.nextInt();

		// counting how many times the given (value) is fully divided by the numbers 
		// from 2 to one less than given (value).
		int count = 0;
		for (int i = 2; i < value; i++)
			if(value % i == 0) count++;	

		System.out.println("The number " + value + " is" + (count == 0 ? "" : " not") + " a prime numer.");		
	}


	void questionThree() {
		/**
		 * 3) Given an array of numbers, arrange them in a way that it forms the largest value.
		 * 
		 * :: input
		 * 	[54, 546, 548, 60]
		 * 
		 * ::output
		 * 	6054854654
		 * 
		 * note:
		 * 	The arrangement 6054854654 gives the largest value.
		 * 
		 * ::constraint
		 * 	1 <= N <= 1000
		 * 	1 <= NUMBER <= 1000000
		 * */

		System.out.println("\nQuestion 3)");
		int[] values = { 54, 546, 548, 60 }; // given array
		String[] stringValues = new String[values.length];
		String result = "";

		// mapping the integer values to string values
		for (int i = 0; i < values.length; i++)
			stringValues[i] = String.valueOf(values[i]);
		
		// sorting the string value in descending order
		Arrays.sort(stringValues, (x, y) -> {
			String valueOne = x + y;
			String valueTwo = y + x;
			return valueTwo.compareTo(valueOne);
    	});

		// conceding the sorted string value to get largest arrangement.
		for (int i = 0; i < values.length; i++)
			result = result + stringValues[i];

		System.out.println("Largest arrangement: " + result);
	}

	void questionFour() {
		/**
		 * 4. Given a number N, print reverse of number N.
		 * 
		 * ::input 
		 * 	988
		 * 
		 * ::output
		 * 	889
		 * 
		 * ::note:
		 * 	Do not print leading zeros in output.
		 * 	For example N = 100, Reverse of N should be 1 not 001.
		 * 
		 * ::constraints
		 * 	1 <= N <=10000
		 * */

		System.out.println("\nQuestion 4)");
		System.out.print("Enter a number: ");

		int value = this.input.nextInt();

		// making a copy of given value, preserve to show output.
		int temp = value;
		int result = 0;

		// moving the digits from last to first.
		while (temp != 0) {
			int last_digit = temp % 10; // getting the last digit
			temp = temp / 10; // removing the last digit
			result = (result * 10) + last_digit; // adding the last digit to the first position
		}
		System.out.println("The reverse number of " + value + " is " + result);
	}

	void questionFive() {
		/**
		 * 5) Given an array of numbers, find the maximum and minimum element in the array.
		 * 	::input
		 * 	[54, 546, 548, 60]
		 * 
		 * 	::output
		 * 	548 54
		 * */

		System.out.println("\nQuestion 5)");
		int[] values = { 54, 546, 548, 60 }; // given array

		// initializing the maximum value of integer as small value and minimum value as large value
		int large = Integer.MIN_VALUE, small = Integer.MAX_VALUE;

		for (int value: values) {
			// if the value is smaller than small then assign the value to small.
			small = small > value ? value : small;

			// if the value is larger than large then assign the value to larger.
			large = large < value ? value : large;
		}

		System.out.println("Smallest value: " + small + ", Largest value: " + large);
	}

	public static void main(String[] args) {
		TestpressFirstCodingRound obj = new TestpressFirstCodingRound();
		
		obj.questionOne();
		obj.questionTwo();
		obj.questionThree();
		obj.questionFour();
		obj.questionFive();
	}
}
