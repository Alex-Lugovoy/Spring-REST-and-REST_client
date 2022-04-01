package com.alexlugov.spring.rest.service;

import com.alexlugov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee emp);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
