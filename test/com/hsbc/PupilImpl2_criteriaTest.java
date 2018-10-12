package com.hsbc;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class PupilImpl2_criteriaTest {

	private int number;
	private int num;
	private boolean expect;
	
	public PupilImpl2_criteriaTest(int number, int num, boolean expect) {
		this.number = number;
		this.num = num;
		this.expect = expect;
	}
	
	@Parameters
	public static Collection<Object[]> prepareData() {
		Object[][] object = {
				{3, 3, true},
				{6, 3, true},
				{2, 3, false},
				{13, 3, true},
				{31, 3, true},
				
				{3, 5, false},
				{5, 5, true},
				{10, 5, true},
				{25, 5, true},
				{52, 5, true},
		};
		return Arrays.asList(object);
	}
	
	@Test
	public void testHasNumber(){
		PupilImpl2 pupil = new PupilImpl2();
		boolean flag = pupil.criteria(number, num);
		Assert.assertEquals(expect, flag);
	}
}
