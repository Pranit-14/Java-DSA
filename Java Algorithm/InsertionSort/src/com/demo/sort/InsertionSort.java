package com.demo.sort;

public class InsertionSort {

	public void sortUsingInsertion(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				} else {
					break;
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
 		i------> 0 to arr.length-1 (i++)
 		j------> i+1 to 0 (j--)
 		if j < j-1 then 
 					compare j and j-1 and swap else break 
*/
