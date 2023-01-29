package com.practice.streams.examples.interfaces;

public class CalculatorImpl {
	public static void main(String[] args) {

		Calculator cal = () -> System.out.println("Switched on");
		cal.switchOn();

		CalculatorSum calSum = (a, b) -> a + b;
		System.out.println(calSum.sum(3, 4));

		CalculatorSub calSub = (a, b) -> {
			if (a > b) {
				throw new RuntimeException();
			} else {
				return b - a;
			}
		};
		System.out.println(calSub.sub(4, 13));

	}
}
