package com.vogella.junit.first;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class countATest {
	@Test
	public void test() {
		MyClass test = new MyClass();
		int output = test.countA("javabean");
		assertEquals(3, output);
		System.out.println(1);
	}
	@Test(timeout = 100)
	public void test2() {
		MyClass test = new MyClass();
		int output = test.countA("javabean");
		assertEquals(3, output);
		System.out.println(2);
	}
	@Before
	public void Prepare() {
		System.out.println("Before the test");
	}
	@After
	public void AfterTest() {
		System.out.println("after the test");
	}
}
