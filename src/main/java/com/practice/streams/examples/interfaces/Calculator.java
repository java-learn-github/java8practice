package com.practice.streams.examples.interfaces;

@FunctionalInterface
public interface Calculator {
	void switchOn();
}

@FunctionalInterface
interface CalculatorSum {
	int sum(int a, int b);
}

@FunctionalInterface
interface CalculatorSub {
	int sub(int a, int b);
}