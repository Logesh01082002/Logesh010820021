import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class KaprekarConstant {
	final static int CONSTANT = 6174;

	private ArrayList<Integer> toIntegerList(int num) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (num !=0) {
		    array.add(num % 10);
		    num = num / 10;
		}
		return array;
	}

	private int toInteger(ArrayList<Integer> nums) {
		int num = 0;
		for (int i:nums) {
			num = (num * 10) + i;
		}
		return num;
	}

	public boolean isValid(int num) {
		String numstr = String.valueOf(num);
		char[] numchar = numstr.toCharArray();
		if (numstr.length() != 4) {
			return false;
		}

		if (
			(numchar[0] == numchar[1] && numchar[1] == numchar[2]) || 
			(numchar[0] == numchar[2] && numchar[0] == numchar[3]) || 
			(numchar[1] == numchar[2] && numchar[2] == numchar[3]) ||
			(numchar[0] == numchar[3] && numchar[1] == numchar[3])
		) {
			return false;
		}
		return true;
	}

	private int order(int num, String by) {
		ArrayList<Integer> nums = this.toIntegerList(num);
		if (by == "asc") {
			Collections.sort(nums);
		} else if (by == "desc") {
			Collections.sort(nums, Collections.reverseOrder());
		} else {}

		return this.toInteger(nums);
	}

	public int run(int num) {
		int count = 0;
		int total = num;

		while (true) {
			total = this.order(total, "desc") - this.order(total, "asc");
			if (total == KaprekarConstant.CONSTANT) break;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		KaprekarConstant obj = new KaprekarConstant();

		int input = 2182;

		if (obj.isValid(input)) {
			System.out.println("The number of operation: " + String.valueOf(obj.run(input)));
		} else {
			System.out.println("Please try with different input");
		}
	}
}
