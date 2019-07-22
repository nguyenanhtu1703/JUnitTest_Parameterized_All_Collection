package com.vogella.junit.first;

public class MyClass {
	public float multiply(float x, float y) {
		if (x > 999)
			throw new IllegalArgumentException("X should be less than 1000");
		return x / y;
	}
	
	public int square(int i) {
		return i * i;
	}
	
	public int countA(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++)
			if (word.charAt(i) == 'a' || word.charAt(i) == 'A')
				count++;System.out.println("Before the test");
		System.out.println(count);
		return count;
	}
	
}
