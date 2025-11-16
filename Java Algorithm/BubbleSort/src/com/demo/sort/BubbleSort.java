package com.demo.sort;

public class BubbleSort {

	public void sortUsingBubble(int[] nums) {
		int n = nums.length;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		for (int i : nums) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
}

/*
 		i-----> arr.length-1 to 0
 		j-----> 0 to arr.length-1-1 (i-1)
 		and compare j and j+1 and swap
*/
