package com.fms.service;

import java.util.List;

import com.fms.dao.ScheduleFlightDAO;
import com.fms.dao.ScheduleFlightDAOImpl;
import com.fms.dto.ScheduleFlight;

public class ScheduleFlightServiceImpl implements ScheduleFlightService{
	
	private ScheduleFlightDAO scheduleFlightDAO;
	
	public ScheduleFlightServiceImpl()
	{
		super();
		scheduleFlightDAO = new ScheduleFlightDAOImpl();
	}
	@Override
	public String addScheduleFlight(ScheduleFlight scheduleFlight)
	{
		return scheduleFlightDAO.addScheduleFlight(scheduleFlight);
	}
	
	public List<ScheduleFlight> getScheduleFlight()
	{
		return scheduleFlightDAO.getScheduleFlight();
	}

}
