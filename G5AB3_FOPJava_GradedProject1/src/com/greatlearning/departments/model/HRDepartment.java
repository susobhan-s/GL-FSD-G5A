package com.greatlearning.departments.model;

/*
Model definition of HR Department(subclass) based on SuperDepartment(superclass)
*/

public class HRDepartment extends SuperDepartment {

	public String departmentName() {
		String dname = "Hr Department";
		return dname;
	}

	public String getTodaysWork() {
		String task = "Fill today's timesheet and mark your attendance";
		return task;
	}

	public String getWorkDeadline() {
		String wrk_last_day = "Complete by EOD";
		return wrk_last_day;
	}
	
	public String doActivity() {
		String activity = "team Lunch";
		return activity;
	}

}
