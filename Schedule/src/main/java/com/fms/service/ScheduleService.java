package com.fms.service;

import java.util.List;

import com.fms.dto.Schedule;

public interface ScheduleService {

   // public void addSchedule(Schedule schedule);
    public abstract String addSchedule(Schedule schedule);
    public abstract List<Schedule> getSchedule();
}
