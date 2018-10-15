package com.risk;

public class PupilImpl2 implements Pupil {

	@Override
	public String say(int number) {
		
		StringBuilder sb = new StringBuilder();
		boolean criteria3 = criteria3(number);
		boolean criteria5 = criteria5(number);
		if (criteria3 == true && criteria5 == true) {
			sb.append("FizzBuzz");
		} else {
			if (criteria3 == true) {
				sb.append("Fizz");
			} else if (criteria5 == true) {
				sb.append("Buzz");
			} else {
				sb.append(number);
			}
		}
		return sb.toString();
	}
	
	protected boolean criteria(int number, int num) {
		
		boolean result = false;
		if (number % num == 0) {
			result = true;
		}
		
		if (hasNumber(number, num) == true) {
			result = true;
		}
		return result;
	}
	
	protected boolean criteria3(int number) {
		
		return criteria(number, 3);
	}
	
	protected boolean criteria5(int number) {
		
		return criteria(number, 5);
	}
	
	protected boolean hasNumber(int number, int num) {
		
		boolean flag = false;
		String numberStr = String.valueOf(number);
		String[] array = numberStr.split("|");
		if (array != null && array.length > 0) {
			for (String eachNumber : array) {
				if (eachNumber.equals(String.valueOf(num))) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
}
