package com.fms.dao;

import java.util.List;

import com.fms.dto.Schedule;

public interface ScheduleDAO {

	public abstract String addSchedule(Schedule schedule);
	public abstract List<Schedule> getSchedule();
}
