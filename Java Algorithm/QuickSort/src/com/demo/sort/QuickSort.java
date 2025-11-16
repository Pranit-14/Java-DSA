package com.demo.sort;

public class QuickSort {

	public void sortUsingQuick(int[] nums, int low, int high) {
		if (low < high) {
			int pivot = partition(nums, low, high);

			sortUsingQuick(nums, low, pivot - 1);

			sortUsingQuick(nums, pivot + 1, high);
		}

	}

	private int partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (nums[j] <= pivot) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		int temp = nums[i + 1];
		nums[i + 1] = nums[high];
		nums[high] = temp;
		return i + 1;
	}

}

/*
 		if low<high then 
 					pivot=part(array,low,high)
 					left = low,pivot-1
 					right = pivot+1,high
 		
 		pivot = high
 		i = low-1 ( at -1)
 		j-----> low to high
 				if j<=pivot then
 						i++ and swap i and j
 		and at last swap i+1 and high and return i+1
*/
