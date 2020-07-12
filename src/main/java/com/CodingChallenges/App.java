package com.CodingChallenges;

import java.util.Scanner;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String[] arr = getArray();
		Stack<String> a = new Stack<String>();
		for (String ad : arr) {
//        	System.out.println("Pushing:"+ad);
			a.add(ad);

//        	System.out.println("After Push:"+a);

		}
		System.out.println("**********************");
		System.out.println(a.size());
		int size = a.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i);
			a.pop();
			System.out.println("After Pop:" + a);
		}
	}

	public static String[] getArray() {
		System.out.println("Enter no of Chars to be Insertd");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.next();
		}
		return arr;
	}

}
