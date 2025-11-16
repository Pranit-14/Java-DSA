package com.demo.test;

import com.demo.queue.QueueList;

public class QueueTest {

	public static void main(String[] args) {
		QueueList ql = new QueueList();
		ql.enQueue(10);
		ql.enQueue(20);
		ql.enQueue(30);
		ql.enQueue(40);
		ql.enQueue(50);

		System.out.println(ql.deQueue());
		System.out.println(ql.deQueue());
		System.out.println(ql.deQueue());
		System.out.println(ql.deQueue());
		System.out.println(ql.deQueue());

	}

}
