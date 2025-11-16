package com.demo.test;

import com.demo.sort.MergeSort;

public class MergeSortTest {
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();

		int[] nums = { 5, 6, 8, 9, 1, 2, 4, 3 };
		ms.sortUsingMerge(nums, 0, nums.length - 1);

		for (int i : nums) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
}
