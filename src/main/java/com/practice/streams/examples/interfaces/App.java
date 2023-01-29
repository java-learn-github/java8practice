package com.practice.streams.examples.interfaces;

public class App {

	public static void main(String[] args) {
		MyFunctionalInterface.m2();

		MyFunctionalInterface functionalInterface = new MyFunctionalInterface() {

			@Override
			public void m1() {
				System.out.println("hello m1 method");

			}
		};

		functionalInterface.m3();
		functionalInterface.m1();

	}

}
