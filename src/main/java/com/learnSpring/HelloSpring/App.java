package com.learnSpring.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnSpring.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp = (Employee) applicationContext.getBean("employeeBean");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getAddress());
        
        System.out.println("--------------------");
        
        Employee emp2 = (Employee) applicationContext.getBean("employeeBeanConst");
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
        System.out.println(emp2.getAddress());
    }
}
