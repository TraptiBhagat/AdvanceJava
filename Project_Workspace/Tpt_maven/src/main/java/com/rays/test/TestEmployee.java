package com.rays.test;


import com.rays.bean.EmployeeBean;
import com.rays.model.EmployeeModel;

public class TestEmployee {
   public static void main(String[] args) throws Exception {
	 
	   testAdd();
	   
}

private static void testAdd() throws Exception {
	
	
	
	EmployeeBean bean = new EmployeeBean();
	bean.setId(1);
	bean.setName("Trapti");
	bean.setSalary(1000);
	
	
	EmployeeModel emp = new EmployeeModel();
		emp.add(bean);
	
}
}
