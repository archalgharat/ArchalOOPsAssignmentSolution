package com.gl.departmentservice;

public class HrDepartment extends SuperDepartment {
	
	//public HrDepartment{
		
		
	//}
	@Override
	public String departmentName()
	{
		return "HR Department";
	}
	
	public String doActivity()
	{
		return "team Lunch";
	}
	@Override
	public String getTodaysWork()
	{
		return "Fill today’s worksheet and mark your attendance";
	}
	@Override
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}

}
