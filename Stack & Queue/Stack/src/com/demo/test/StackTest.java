package com.demo.test;

import java.util.Scanner;

import com.demo.stack.StackArray;
import com.demo.stack.StackList;

public class StackTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Stack using Array.");
		System.out.println("2.Stack using List.");
		System.out.println("3.Exit.");

		System.out.print("Choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1 -> {
			StackArray sa = new StackArray(5);
			sa.push(10);
			sa.push(20);
			sa.push(30);
			sa.push(40);
			sa.push(50);
			sa.push(60);

			System.out.println(sa.pop());
			System.out.println(sa.pop());
			System.out.println(sa.pop());
			System.out.println(sa.pop());
			System.out.println(sa.pop());
			System.out.println(sa.pop());
		}
		case 2 -> {
			StackList sl = new StackList();
			sl.push(10);
			sl.push(20);
			sl.push(30);
			sl.push(40);
			sl.push(50);
			sl.push(60);

			System.out.println(sl.pop());
			System.out.println(sl.pop());
			System.out.println(sl.pop());
			System.out.println(sl.pop());
			System.out.println(sl.pop());
			System.out.println(sl.pop());
		}
		case 3 -> {
			System.out.println("Program Successfully Exited!!");
			break;
		}
		}
		sc.close();
	}

}
