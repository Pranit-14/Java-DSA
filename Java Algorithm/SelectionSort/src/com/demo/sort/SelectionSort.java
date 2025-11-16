package com.demo.sort;

public class SelectionSort {

	public void sortUsingSelection(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < n; j++) {
				if (nums[j] < nums[mini]) {
					mini = j;
				}
			}
			int temp = nums[mini];
			nums[mini] = nums[i];
			nums[i] = temp;
		}

		for (int i : nums) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}

/*
  		i-----> 0 to arr.length-1
  		j-----> i+1 to arr.length
  		take min value
  		compare j and min and update value of min and at last swap min and i  
*/
