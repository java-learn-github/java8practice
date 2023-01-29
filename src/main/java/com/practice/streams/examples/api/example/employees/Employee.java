package com.practice.streams.examples.api.example.employees;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private int id;
	private String name;
	private String dept;
	private long salary;
}
