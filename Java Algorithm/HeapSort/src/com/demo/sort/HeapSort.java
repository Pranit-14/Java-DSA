package com.demo.sort;

public class HeapSort {

	public void sortUsingHeap(int[] nums) {
		int n = nums.length;

		// Build a max heap
		for (int i = (n / 2) - 1; i >= 0; i--) {
			heapify(nums, n, i);
		}

		// Extract elements one by one
		for (int i = n - 1; i >= 0; i--) {
			int temp = nums[0];
			nums[0] = nums[i];
			nums[i] = temp;

			heapify(nums, i, 0);
		}

	}

	private void heapify(int[] nums, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		// child exists and greater than parent
		if (left < n && nums[left] > nums[largest]) {
			largest = left;
		}

		// child exists and greater than current largest
		if (right < n && nums[right] > nums[largest]) {
			largest = right;
		}

		// largest is not parent then swap and continue heapify
		if (largest != i) {
			int temp = nums[i];
			nums[i] = nums[largest];
			nums[largest] = temp;
			heapify(nums, n, largest);
		}

	}

}

/*
  		i----->(arr.length/2)-1 to 0 calls heapify(array,arr.length,i)
  		i-----> arr.length-1 to 0 swaps 0 and i and calls heapify(array,i,0)
  		
  		heapify ----- largest = i
  						left = 2*i+1
  						right = 2*i+2
  						
  						if left<n and left>largest then largest = left
  						if right<n and right>largest then largest = right
  						
  						if largest not equal to i then swap i and largest and call heapify(array,n,largest).
 */
