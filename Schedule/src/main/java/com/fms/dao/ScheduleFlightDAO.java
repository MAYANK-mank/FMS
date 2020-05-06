package com.fms.dao;

import java.util.List;

import com.fms.dto.ScheduleFlight;

public interface ScheduleFlightDAO {
	public abstract String addScheduleFlight(ScheduleFlight scheduleFlight);
	public abstract List<ScheduleFlight> getScheduleFlight();
	

}
