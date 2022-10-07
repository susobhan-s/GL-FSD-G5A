package com.greatlearning.departments.model;

/*
Model definition of Admin Department(subclass) based on SuperDepartment(superclass)
*/

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		String dname = "Admin Department";
		return dname;
	}

	public String getTodaysWork() {
		String task = "Complete your documents Submission";
		return task;
	}

	public String getWorkDeadline() {
		String wrk_last_day = "Complete by EOD";
		return wrk_last_day;
	}

}
