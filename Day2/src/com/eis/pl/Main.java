package com.eis.pl;

import com.eis.bean.Employee;
import com.eis.service.Service;

public class Main {

	public static void main(String[] args) {
		Service s=new Service();
		Employee e=s.employeeDetails();
		s.allEmployees(e);
	}

}
