package com.GetSet;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		Employee A = new Employee();
		A.setempId(123);
		A.setempName("Jayesh");
		A.setempNumber(9632587410d);
		A.setempSalary(230015.20f);
		A.setempage(22);
		System.out.println ("The Employee ID is :" +A.getempId());
		System.out.println("The Employee Name is :" +A.getempName());
		System.out.println("The Employee MoNum is :" +A.getempNumber());
		System.out.println ("The Employee Salary is :" +A.getempSalary());
		System.out.println("The Employee Age is :" +A.getempage());

	}
}
