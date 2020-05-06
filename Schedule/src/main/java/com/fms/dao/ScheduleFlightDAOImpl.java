package com.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.fms.dto.ScheduleFlight;

public class ScheduleFlightDAOImpl implements ScheduleFlightDAO{
	private List<ScheduleFlight> scheduleFlightList = new ArrayList<>();
	
	public ScheduleFlightDAOImpl()
	{
		super();
		setScheduleFlight();
	}

	@Override
	public String addScheduleFlight(ScheduleFlight scheduleFlight)
	{
		scheduleFlightList.add(scheduleFlight);
		System.out.println(scheduleFlightList);
		return "scheduled flight is added.";
	}
	
	@Override
	public List<ScheduleFlight> getScheduleFlight()
	{
		return scheduleFlightList;
	}
	
	private void setScheduleFlight()
	{
		scheduleFlightList.add(new ScheduleFlight(2344,4567,250.50,true));
		scheduleFlightList.add(new ScheduleFlight(2345,4568,400.70,true));
		
	}
} 
