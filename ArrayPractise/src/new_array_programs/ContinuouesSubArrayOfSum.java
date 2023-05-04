package new_array_programs;

import java.util.Arrays;

public class ContinuouesSubArrayOfSum {

	public static void main(String[] args) {
		findSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);
		
	}
	
	static void findSubArray(int[] inputArray, int inputNumber) {
		int sum = inputArray[0];
		int start = 0;

		for (int i = 1; i < inputArray.length; i++) {
			System.out.println(i);
			sum = sum + inputArray[i];
			System.out.println(sum);
			while (sum > inputNumber && start <= i - 1) {
				sum = sum - inputArray[start];
				System.out.println(sum);
				start++;
				System.out.println(start);
			}
			if (sum == inputNumber) {
				System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is "
						+ inputNumber + " is ");
				for (int j = start; j <= i; j++) {
					System.out.println(j);
					
					System.out.print(inputArray[j] + " ");
				}
				System.out.println();
			}
		}
	}
}
