package com.demo.test;

import com.demo.sort.SelectionSort;

public class SelectionSortTest {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();

		int[] nums = { 5, 6, 7, 9, 2, 3 };

		ss.sortUsingSelection(nums);

	}

}
