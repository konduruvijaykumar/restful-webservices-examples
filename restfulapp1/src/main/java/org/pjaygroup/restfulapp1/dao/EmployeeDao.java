package org.pjaygroup.restfulapp1.dao;

import java.util.List;

import org.pjaygroup.restfulapp1.model.Employee;

/**
 * @author Vijay Konduru
 *
 */
public interface EmployeeDao {

	List<Employee> listEmployees();

	Employee getEmployee(Integer emp_id);

	boolean addEmployee(Employee employee);

	boolean updateEmployee(Employee employee);

	boolean destroyEmployee(Integer emp_id);

}
