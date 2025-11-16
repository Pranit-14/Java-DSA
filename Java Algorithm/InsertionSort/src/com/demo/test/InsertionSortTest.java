package com.demo.test;

import com.demo.sort.InsertionSort;

public class InsertionSortTest {

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();

		int[] nums = { 2, 5, 6, 7, 8, 2, 4, 6, 9 };

		is.sortUsingInsertion(nums);

	}

}
