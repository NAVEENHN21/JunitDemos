package com.examples.S01JunitDemos.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MyFirstTestClass {

	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("Before all tests in class");

	}
	@Before
	public  void initAll1() {
		System.out.println("I'm Running before each test ");

	}
	
	@Test
	public void test1() {
		System.out.println("This is test1");

	}
	
	@Test
	@Ignore
	public void test2() {
		System.out.println("This is test2");

	}
	void test3() {
		System.out.println("This is test3");
		fail("A Failing test");

	}
	@AfterClass
	public static void teardown() {
		System.out.println("Cleaning up after running all tests  ");

	}
	
	@Test
	public void assertTests() {
		System.out.println("Starting assert tests ");

		String str1=null;
		String str2="Some Value";
		
		assertTrue(4>0);
	}
}
