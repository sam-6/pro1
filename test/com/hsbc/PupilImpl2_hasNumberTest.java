package com.hsbc;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class PupilImpl2_hasNumberTest {

	private int number;
	private int num;
	private boolean expect;
	
	public PupilImpl2_hasNumberTest(int number, int num, boolean expect) {
		this.number = number;
		this.num = num;
		this.expect = expect;
	}
	
	@Parameters
	public static Collection<Object[]> prepareData() {
		Object[][] object = {
				{1, 1, true},
				{1, 2, false},
				{12, 1, true},
				{12, 2, true},
				{12, 3, false},
				{103, 1, true},
				{103, 0, true},
				{103, 3, true},
				{103, 4, false},
		};
		return Arrays.asList(object);
	}
	
	@Test
	public void testHasNumber(){
		PupilImpl2 pupil = new PupilImpl2();
		boolean flag = pupil.hasNumber(number, num);
		Assert.assertEquals(expect, flag);
	}
}
