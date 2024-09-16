package com.eis.service;
import java.util.*;
import com.eis.bean.Employee;

interface EmployeeService{
	Employee employeeDetails();
	String FindInsuranceScheme(double salary);
	void allEmployees(Employee em);
	
}
public class Service implements EmployeeService{


	public Employee employeeDetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee name: ");
		String name=sc.nextLine();
		System.out.print("Enter Employee salary: ");
		double salary=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Employee designation: ");
		String designation=sc.nextLine();
		
		 
		return new Employee(id,name,salary,designation,new Service().FindInsuranceScheme(salary));
		
	}

	public String FindInsuranceScheme(double salary) {
		if(salary<30000) {
			return "Basic ";
		}		
		else {
			return "Premium ";
		}
	}

	public void allEmployees(Employee em) {
		// TODO Auto-generated method stub
		System.out.println(em.toString());
		
	}
	

}
