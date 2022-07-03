package com.gl.driver;

import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HrDepartment;
import com.gl.departmentservice.SuperDepartment;
import com.gl.departmentservice.TechDepartment;

public class DepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment obj1 = new AdminDepartment();
		System.out.println("Welcome to " +obj1.departmentName());
		AdminDepartment obj2 = new AdminDepartment();
		System.out.println(obj2.getTodaysWork());
		AdminDepartment obj3 = new AdminDepartment();
		System.out.println(obj3.getWorkDeadline());
		AdminDepartment obj4 = new AdminDepartment();	
	    System.out.println(obj4.isTodayAHoliday()+"\n");
	    
	    HrDepartment obj5 = new HrDepartment();
		System.out.println("Welcome to " +obj5.departmentName());
		HrDepartment obj13 = new HrDepartment();
		System.out.println(obj13.doActivity());
		HrDepartment obj6 = new HrDepartment();
		System.out.println(obj6.getTodaysWork());
		HrDepartment obj7 = new HrDepartment();
		System.out.println(obj7.getWorkDeadline());
		HrDepartment obj8 = new HrDepartment();	
	    System.out.println(obj8.isTodayAHoliday()+"\n");
	    
	    TechDepartment obj9 = new TechDepartment();
		System.out.println("Welcome to " +obj9.departmentName());		
		TechDepartment obj10 = new TechDepartment();
		System.out.println(obj10.getTodaysWork());		
		TechDepartment obj11 = new TechDepartment();
		System.out.println(obj11.getWorkDeadline());
		TechDepartment obj14 = new TechDepartment();	
	    System.out.println(obj14.getTechStackInformation());
		TechDepartment obj12 = new TechDepartment();	
	    System.out.println(obj12.isTodayAHoliday());
	    
	}

}
