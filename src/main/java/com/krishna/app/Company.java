package com.krishna.app;
import com.krishna.app.bean.*;

public class Company 
{
    public static void main( String[] args )
    {
       
    	// Creating object for Employee Class
    	
    	Employee Emp1= new Employee();
    	Emp1.setId(101);
    	Emp1.setName("Krishnaveni");
    	Emp1.setDept("QA");
    	Emp1.setSalary(330000.00);
    	
    	System.out.println(Emp1);
        
    }
}
