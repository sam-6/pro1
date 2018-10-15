package com.risk;

public class PupilImpl implements Pupil{

	@Override
	public String say(int number) {
		
		StringBuilder sb = new StringBuilder();
		if(number > 0) {
			if (number % 15 == 0) {
				sb.append("FizzBuzz");
			} else {
				if (number % 3 == 0) {
					sb.append("Fizz");
				} else if (number % 5 == 0) {
					sb.append("Buzz");
				} else {
					sb.append(number);
				}
			}
		}
		return sb.toString();
	}
}
