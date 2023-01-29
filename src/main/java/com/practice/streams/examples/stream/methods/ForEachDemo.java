package com.practice.streams.examples.stream.methods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");

		list.stream().forEach(i -> System.out.println(i));

		Map<String, String> map = new HashMap<>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put("a", "1");
				put("b", "2");
				put("c", "3");
				put("d", "4");
				put("e", "5");
			}
		};

		map.forEach((key, value) -> System.out.println(key + " : " + value));

		map.entrySet().stream().forEach(i -> System.out.print(i.getKey()));
		System.out.println();
		map.entrySet().stream().forEach(i -> System.out.print(i.getValue()));

	}

}
