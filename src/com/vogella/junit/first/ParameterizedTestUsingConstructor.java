package com.vogella.junit.first;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestUsingConstructor {
	public int m1, m2;
	
	public ParameterizedTestUsingConstructor(int a, int b) {
		m1 = a;
		m2 = b;
	}
	
	@Parameters
	public static List<Object[]> a(){
		Object[][] ar = new Object[][] {{1, 2}, {2, 4}, {3, 5}};
		return Arrays.asList(ar);
	}

	@Test
    public void testMultiplyException() {
        MyClass tester = new MyClass();
        assertEquals("Result", m1 * m2, tester.multiply(m1, m2));
    }


    // class to be tested
    class MyClass {
        public int multiply(int i, int j) {
            return i *j;
        }
    }
}
