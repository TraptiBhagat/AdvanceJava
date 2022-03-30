package com.string;

public class Occurence {
	public static void main(String[] args) {
		String name = "aabbccdd";
		char search = 'a';

		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == search)
				count++;
		}

		System.out.println("The Character '" + search + "' appears " + count + " times.");
	}

}
