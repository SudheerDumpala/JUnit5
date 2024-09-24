package com.courses.purchase;

public class JunitCourse implements Courses{
	@Override
	public boolean purchaseCourse() {
		System.out.println("Junit course purchased");
		return true;
	}
}
