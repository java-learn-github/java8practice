package com.practice.streams.examples.api.example.employees;

import java.util.List;
import java.util.stream.Collectors;

public class EmpService {

	public static List<Employee> getTaxableEmployees() {

		return EmpDaoStub.getAllEmp().stream().filter(emp -> emp.getSalary() > 600000).collect(Collectors.toList());
	}

	public static List<Employee> getNonTaxableEmployees() {

		return EmpDaoStub.getAllEmp().stream().filter(emp -> emp.getSalary() <= 600000).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("Taxble Employees : " + getTaxableEmployees());
		System.err.println("-------");
		System.out.println("Non Taxble Employees : " + getNonTaxableEmployees());
	}

}
