package com.JUnit_07;

import java.util.Arrays;

public class AssertTimeout {
	public int[] assertTimeout(int[] arr) {
		for(int i=0;i<1000000;i++) {
			Arrays.sort(arr);
		}
		return arr;
	}
}
