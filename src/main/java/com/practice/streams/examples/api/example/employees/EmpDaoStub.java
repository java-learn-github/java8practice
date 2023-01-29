package com.practice.streams.examples.api.example.employees;

import java.util.Arrays;
import java.util.List;

public class EmpDaoStub {

	public static List<Employee> getAllEmp() {

		return Arrays.asList(new Employee(1, "amit", "java", 200000), 
				new Employee(2, "sumit", "python", 400000),
				new Employee(3, "raju", "javascript", 600000), 
				new Employee(4, "jayant", "angular", 700000),
				new Employee(5, "rashmi", "html", 800000), 
				new Employee(6, "pooja", "css", 900000));
	}

}
