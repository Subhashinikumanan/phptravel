package com.phptravels.test;

import java.util.Arrays;

public class Hello3 {

	public static void main(String[] args) {

		// int array5[]={7,3,1,2,9,0,6,4,5}

		// Write the program to print Sorting Ascending & Desending order

		int array5[] = { 7, 3, 1, 2, 9, 0, 6, 4, 5 };

		Arrays.sort(array5);

		System.out.println(Arrays.toString(array5));

		int[] desc = new int[array5.length];
		for (int i = 0; i < desc.length; i++) {

			desc[i] = array5[array5.length - 1 - i];
		}

		System.out.println(Arrays.toString(desc));
	}
}
