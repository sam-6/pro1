package com.hsbc;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class PupilImpl2Test {

	private int num;
	private String expectString;
	
	public PupilImpl2Test(int num, String expectString) {
		this.num = num;
		this.expectString = expectString;
	}
	
	@Parameters
	public static Collection<Object[]> prepareData() {
		Object[][] object = {
				{1, "1"},
				{3, "Fizz"},
				{5, "Buzz"},
				{15, "FizzBuzz"},
				{13, "Fizz"},
				{52, "Buzz"},
		};
		return Arrays.asList(object);
	}
	
	@Test
	public void testSay(){
		PupilImpl2 pupil = new PupilImpl2();
		String str = pupil.say(num);
		Assert.assertEquals(expectString, str);
	}
}
