package oops;

import java.util.Arrays;

public class Student {
	public static void main(String[] args) {
		int a = Math.abs(-1);
		int[] arr = {5, 1, 8, 9};
		Arrays.sort(arr);
		System.out.println("The value of a is " + a);
		
		for(int v : arr) {
			System.out.println(v);
		}
	}
}
