package com.demo.hash;

public class HashTable {
	Node[] heads;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public HashTable() {
		heads = new Node[10];
		for (int i = 0; i < heads.length; i++) {
			heads[i] = null;
		}
	}

	public void insertData(int num) {
		Node newNode = new Node(num);

		// to find position in list
		int pos = num % heads.length;
		if (heads[pos] != null) {
			newNode.next = heads[pos];
		}
		heads[pos] = newNode;
	}

	public void displayHashTable() {
		for (int i = 0; i < heads.length; i++) {
			Node tempNode = heads[i];
			System.out.print(i + "--->");
			while (tempNode != null) {
				System.out.print(tempNode.data + ",");
				tempNode = tempNode.next;
			}
			System.out.println("null");
		}
	}

	public boolean searchData(int num) {
		int pos = num % heads.length;
		Node tempNode = heads[pos];
		while (tempNode != null) {
			if (tempNode.data == num) {
				return true;
			}
			tempNode = tempNode.next;
		}
		return false;
	}
}
