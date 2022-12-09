package org.lang;

import org.employee.Employee;

public class StateDetails {
	
	private static void southIndia()
	
	{
		System.out.println("Tamilnadu,AP,Karnataka,KL");
	}

	public static void main(String[] args) {
		
		LanguageInfo l=new LanguageInfo();
		StateDetails.southIndia();
		StateDetails s=new StateDetails();
		Student s1=new Student();
		Employee e=new Employee();
		s.southIndia();
		l.tamilLanguage();
		s1.studentName();
		e.empId();
		e.empName();
		
	}
	
}
