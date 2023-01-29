package com.practice.streams.examples.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<Integer> consumer = (t) -> System.out.println("Hello consumer : " + t);
		consumer.accept(7);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		list.stream().forEach(consumer);
		
		list.stream().forEach(i -> System.out.println("Helloooooo"));

	}

}
