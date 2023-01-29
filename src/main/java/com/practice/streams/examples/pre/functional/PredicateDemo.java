package com.practice.streams.examples.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PredicateDemo /* implements Predicate<Integer> */ {

//	@Override
//	public boolean test(Integer t) {
//		if (t % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}

	public static void main(String[] args) throws Exception {

		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}

		};

		System.out.println(predicate.test(6));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

//		list = null;
		Optional.ofNullable(list).orElseThrow(() -> new Exception());
		
		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

	}

}
