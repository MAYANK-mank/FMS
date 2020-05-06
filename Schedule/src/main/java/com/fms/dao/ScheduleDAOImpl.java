package com.fms.dao;

import java.util.ArrayList;

import com.fms.dto.Schedule;
import java.util.List;

public class ScheduleDAOImpl implements ScheduleDAO{

	private List<Schedule> scheduleList = new ArrayList<>();
	
	public ScheduleDAOImpl()
	{
		super();
		setSchedule();
	}
	
	@Override
	public String addSchedule(Schedule schedule)
	{
		scheduleList.add(schedule);
		System.out.println(scheduleList);
		return "schedule is added.";
	}
	@Override
	public List<Schedule> getSchedule()
	{
		return scheduleList;
	}
	
	private void setSchedule()
	{
		scheduleList.add(new Schedule(1,"Delhi","Lucknow","10:45:50","12:30:05"));
		scheduleList.add(new Schedule(2,"Hyderabad","Chennai","8:30:35","11:00:45"));
		scheduleList.add(new Schedule(3,"Mumbai","Kolkata","9:05:10","1:30:25"));
	}
}
