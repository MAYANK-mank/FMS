package com.fms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fms.dao.ScheduleDAO;
import com.fms.dao.ScheduleDAOImpl;
import com.fms.dto.Schedule;

@Service
public class ScheduleServiceImpl implements ScheduleService{
	
//	@Autowired
//	ScheduleService scheduleSerivce;
//	
//	@Autowired
//	ScheduleRepository scheduleRepository;
	
	private ScheduleDAO scheduleDAO;
	
	public ScheduleServiceImpl()
	{
		super();
		scheduleDAO = new ScheduleDAOImpl();
	}
	
	@Override
	public String addSchedule(Schedule schedule)
	{
		return scheduleDAO.addSchedule(schedule);
	}
	
	@Override
	public List<Schedule> getSchedule()
	{
		return scheduleDAO.getSchedule();
	}
}	

















//	public Schedule addSchedule(Schedule schedule)
//	{
//		return scheduleRepository.add(schedule);
//	}

