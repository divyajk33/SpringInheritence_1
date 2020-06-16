package com.shiva.Spring_Bean_Inheritence;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.shiva.beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory beans=new XmlBeanFactory(new ClassPathResource("/spring.xml"));
		Employee e=(Employee)beans.getBean("emp1");
		e.displayEmpDetails();
		Employee e1=(Employee)beans.getBean("emp2");
		e1.displayEmpDetails();
		Employee e2=(Employee)beans.getBean("emp3");
		e2.displayEmpDetails();
		
    }
}
