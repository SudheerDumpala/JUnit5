package com.courses.purchase;

public class JavaCourse implements Courses{
	@Override
	public boolean purchaseCourse() {
		System.out.println("Java course purchased");
		return true;
	}
}
