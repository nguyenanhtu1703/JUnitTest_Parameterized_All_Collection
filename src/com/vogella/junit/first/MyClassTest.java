package com.vogella.junit.first;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {
	  @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
	    MyClass tester = new MyClass();
	    tester.multiply(1000, 5);
	  }
	  @Test
	  public void testMultiply() {
	    MyClass tester = new MyClass();
	    assertEquals("10 x 5 must be 50", 2, tester.multiply(10, 5), 0);
	  }
}

