package com.demo.stack;

public class StackArray {

	private int[] arr;
	private int top;

	public StackArray() {
		this.arr = new int[10];
		this.top = -1;
	}

	public StackArray(int size) {
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int num) {
		if (!isFull()) {
			top++;
			arr[top] = num;
			System.out.println("Push" + num);
		} else {
			System.err.println("Stack is full!!!");
		}
	}

	private boolean isFull() {
		return top == arr.length - 1;
	}

	public int pop() {
		if (!isEmpty()) {
			int num = arr[top];
			top--;
			return num;
		} else {
			System.err.println("Stack is Empty!!!");
			return -1;
		}
	}

	private boolean isEmpty() {
		return top == -1;
	}

}


