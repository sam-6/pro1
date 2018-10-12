package com.hsbc;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class PupilImplTest {

	private int num;
	private String expectString;
	
	public PupilImplTest(int num, String expectString) {
		this.num = num;
		this.expectString = expectString;
	}
	
	@Parameters
	public static Collection<Object[]> prepareData() {
		Object[][] object = {
				{1, "1"},
				{3, "Fizz"},
				{5, "Buzz"},
				{15, "FizzBuzz"}
		};
		return Arrays.asList(object);
	}
	
	@Test
	public void testSay(){
		PupilImpl pupil = new PupilImpl();
		String str = pupil.say(num);
		Assert.assertEquals(expectString, str);
	}
}
