package com.demo.test;

import com.demo.sort.HeapSort;

public class HeapSortTest {

	public static void main(String[] args) {
		HeapSort hs = new HeapSort();

		int[] nums = { 5, 6, 8, 9, 4, 2, 6 };
		hs.sortUsingHeap(nums);

		for (int i : nums) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
