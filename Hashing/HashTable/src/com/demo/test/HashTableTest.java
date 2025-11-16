package com.demo.test;

import com.demo.hash.HashTable;

public class HashTableTest {

	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.insertData(10);
		ht.insertData(20);
		ht.insertData(30);
		ht.insertData(40);

		ht.displayHashTable();

		ht.displayHashTable();

	}

}
