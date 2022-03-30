package oop;

public class Employee {
    public static void main(String[] args) {
    	EmployeeData employee1 = new EmployeeData();
    	EmployeeData employee2 = new EmployeeData();
    	
    	employee1.setId(2154);
    	employee2.setId(2179);
    	
    	employee1.setName("Trapti Bhagat");
        employee2.setName("Veena Yadav");
        
        System.out.println(employee1.getName());
        System.out.println(employee2.getName());
        
        System.out.println(employee1.getId());
        System.out.println(employee2.getId());
    }
}
