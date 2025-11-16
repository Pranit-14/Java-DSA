package com.demo.stack;

public class StackList {
	Node top;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int num) {
		Node newNode = new Node(num);
		if (!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("Pushed " + num);
	}

	private boolean isEmpty() {
		return top == null;
	}

	public int pop() {
		if (!isEmpty()) {
			Node tempNode = top;
			top = top.next;
			tempNode.next = null;
			return tempNode.data;
		} else {
			System.err.println("Stack is Empty");
			return -1;
		}
	}

}
