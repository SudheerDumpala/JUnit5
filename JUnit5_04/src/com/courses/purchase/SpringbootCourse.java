package com.courses.purchase;

public class SpringbootCourse implements Courses{
	@Override
	public boolean purchaseCourse() {
		System.out.println("springboot course purchased");
		return true;
	}

}
