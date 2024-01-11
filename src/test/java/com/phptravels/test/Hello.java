package com.phptravels.test;

import java.util.HashMap;
import java.util.Map;

public class Hello {

	public static void main(String[] args) {

		String name = "Fruglee	";

		char ch[] = name.toCharArray();

		Map<Character, Integer> map = new HashMap();

		for (char c : ch) {

			if (Character.isLetterOrDigit(c)) {

				map.put(c, map.getOrDefault(c, 0) + 1);

			}

		}

		System.out.println(map);

	}
}