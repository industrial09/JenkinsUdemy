package com.jenkins.test;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CaclculatorTest extends Calculator{
	//As recommendation, it is better to use a steady JUnit version
	@Test
	public void additionTest() {
		Assert.assertEquals(9, addition(3, 6));
	}
	
	@Test
	public void substractionTest() {
		Assert.assertEquals(3, substraction(6, 3));
	}
}
