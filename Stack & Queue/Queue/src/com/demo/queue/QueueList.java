package com.demo.queue;

public class QueueList {
	Node front;
	Node rear;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public QueueList() {
		this.front = null;
		this.rear = null;
	}

	public void enQueue(int num) {
		Node newNode = new Node(num);
		if (isEmpty()) {
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		System.out.println("Enqueue: " + num);
	}

	private boolean isEmpty() {
		return front == null && rear == null;
	}

	public int deQueue() {
		if (!isEmpty()) {
			Node temp = front;
			front = front.next;
			if (front == null) {
				rear = null;
			}
			temp.next = null;
			return temp.data;
		} else {
			System.err.println("Queue is empty");
			return -1;
		}
	}
}
