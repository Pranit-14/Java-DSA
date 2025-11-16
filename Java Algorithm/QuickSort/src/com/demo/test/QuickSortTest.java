package com.demo.test;

import com.demo.sort.QuickSort;

public class QuickSortTest {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();

		int[] nums = { 5, 8, 6, 4, 1, 2, 7, 3, 5 };

		qs.sortUsingQuick(nums, 0, nums.length - 1);

		for (int i : nums) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
