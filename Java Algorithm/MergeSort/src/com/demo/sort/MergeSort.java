package com.demo.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public void sortUsingMerge(int[] nums, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;

		// sort left half
		sortUsingMerge(nums, low, mid);
		// sort right half
		sortUsingMerge(nums, mid + 1, high);
		// sort both half
		merge(nums, low, mid, high);

	}

	private void merge(int[] nums, int low, int mid, int high) {
		List<Integer> list = new ArrayList<Integer>();

		int left = low;
		int right = mid + 1;

		// merge both sorted array
		while (left <= mid && right <= high) {
			if (nums[left] <= nums[right]) {
				list.add(nums[left++]);
			} else {
				list.add(nums[right++]);
			}
		}

		// merge left half array
		while (left <= mid) {
			list.add(nums[left++]);
		}

		// merge right half array
		while (right <= high) {
			list.add(nums[right++]);
		}

		for (int i = low; i <= high; i++) {
			nums[i] = list.get(i - low);
		}

	}

}


/*
 		if low>=high then return (terminating condition)
 		
 		mid = (low+high)/2
 		recursive call (array,low,mid) ---- left half
 		recursive call (array,mid+1,high) ---- right half
 		
 		merge(array,low,mid,high) ---- merge both array
 		
 		left = low, right = mid+1
 		
 		left<=mid && right<=high ---- if left< right then
 										add(left++) else add(right++)  ---- combine both halves
 		left<=mid then add(left++) 
 		right<=high then add(right++)
 		
 		convert to array ---- i----> low to high(include) list.get(i-low);
*/
