package com.alexlugov.spring.rest.dao;

import com.alexlugov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee emp);
    Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
