package com.practice.streams.examples.interfaces;

@FunctionalInterface
public interface MyFunctionalInterface {

	void m1();

	static void m2() {
		System.out.println("hello m2 method");
	}

	default void m3() {
		System.out.println("hello m3 method");
	}
}
