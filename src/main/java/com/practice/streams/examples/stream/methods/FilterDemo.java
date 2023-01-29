package com.practice.streams.examples.stream.methods;

import java.util.HashMap;
import java.util.Map;

public class FilterDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put("a", 1);
				put("b", 2);
				put("c", 3);
				put("d", 4);
				put("e", 5);
			}
		};

		map.entrySet().stream().filter(i -> i.getValue() % 2 == 0).forEach(System.out::println);
		System.out.println();
		map.entrySet().stream().filter(i -> i.getValue() % 2 == 0).forEach(i -> System.out.println(i.getKey()));
	}

}
