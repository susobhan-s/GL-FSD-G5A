package com.greatlearning.departments.driver;

import com.greatlearning.departments.model.HRDepartment;
import com.greatlearning.departments.model.AdminDepartment;
import com.greatlearning.departments.model.TechDepartment;

public class Main_Driver {

	public static void main(String[] args) {
		
		//Create Objects of Departments
		HRDepartment hr_dep = new HRDepartment();
		AdminDepartment admin_dep = new AdminDepartment();
		TechDepartment tech_dep = new TechDepartment();

		//Print Admin Department
		System.out.println("Welcome to " + admin_dep.departmentName());
		System.out.println(admin_dep.getTodaysWork());
		System.out.println(admin_dep.getWorkDeadline());
		System.out.println(admin_dep.isTodayAHoliday());

		System.out.println();

		//Print Hr Department
		System.out.println("Welcome to " + hr_dep.departmentName());
		System.out.println(hr_dep.doActivity());
		System.out.println(hr_dep.getTodaysWork());
		System.out.println(hr_dep.getWorkDeadline());
		System.out.println(hr_dep.isTodayAHoliday());

		System.out.println();

		//Print Tech Department
		System.out.println("Welcome to " + tech_dep.departmentName());
		System.out.println(tech_dep.getTodaysWork());
		System.out.println(tech_dep.getWorkDeadline());
		System.out.println(tech_dep.getTechStackInformation());
		System.out.println(tech_dep.isTodayAHoliday());

	}

}
