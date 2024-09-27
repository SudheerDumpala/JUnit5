package com.JUnit_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class AssertIterate {
	List<Integer> lst = Arrays.asList(9,4,8,2,5);
	public List<Integer> IterateList() {
		Collections.sort(lst);
		return lst;
	}
}
