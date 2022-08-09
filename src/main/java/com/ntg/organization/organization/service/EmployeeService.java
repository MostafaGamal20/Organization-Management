package com.ntg.organization.organization.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ntg.organization.organization.entity.Employee;

@Service
public class EmployeeService {

	static List<Employee> employees = null;
	static {
		employees = new ArrayList<>();
		employees.add(new Employee(1L, "mostafa", "mostafa@mail.com"));
		employees.add(new Employee(2L, "hossam", "hossam@mail.com"));
	}

	public List<Employee> getAllEmployee() {
		return employees;
	}

	public boolean createNewEmployee(Employee newEmp) {

		if (newEmp != null) {
			employees.add(newEmp);
			return true;
		}

		return false;
	}

	public boolean deleteEmployeeById(Long id) {

		if (id != null) {

			for (Employee employee : employees) {

				if (employee.getId().equals(id)) {
					employees.remove(employee);

					return true;
				}
			}
		}

		return false;
	}

}
