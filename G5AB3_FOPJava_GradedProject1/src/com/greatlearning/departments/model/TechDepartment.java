package com.greatlearning.departments.model;

public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		String dname = "Tech Department";
		return dname;
	}

	public String getTodaysWork() {
		String task = "Complete coding of module 1";
		return task;
	}

	public String getWorkDeadline() {
		String wrk_last_day = "Complete by EOD";
		return wrk_last_day;
	}

	public String getTechStackInformation() {
		String activity = "core Java";
		return activity;
	}

}
