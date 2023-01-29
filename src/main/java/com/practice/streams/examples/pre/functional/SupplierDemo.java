package com.practice.streams.examples.pre.functional;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

	public static void main(String[] args) {

		//List<String> list = Arrays.asList("a", "b", "c");
		List<String> list = Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(() -> "Found Nothing"));
		
		
		String result = list.stream().findAny().orElseGet(() -> "No Results Found");
		
		System.out.println(result);
	}

}
