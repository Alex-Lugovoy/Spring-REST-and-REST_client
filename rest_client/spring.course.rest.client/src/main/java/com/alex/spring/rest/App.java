package com.alex.spring.rest;

import com.alex.spring.rest.configuration.MyConfig;
import com.alex.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        System.out.println(communication.getAllEmployees());

//        System.out.println(communication.getEmplyee(20));
//        Employee emp = new Employee("Sveta", "Sokolova", "HR", 1400);
//        communication.saveEmployee(emp);

//        Employee emp = new Employee("Olu", "Shkood", "Sales", 200);
//        emp.setId(13);

//        communication.deleteEmployee(13);

        context.close();

    }
}
