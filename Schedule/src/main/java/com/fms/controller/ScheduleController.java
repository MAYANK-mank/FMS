package com.fms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.dto.Schedule;
import com.fms.dto.ScheduleFlight;
import com.fms.service.ScheduleFlightService;
import com.fms.service.ScheduleFlightServiceImpl;
import com.fms.service.ScheduleService;
import com.fms.service.ScheduleServiceImpl;

@RestController
@RequestMapping("/api")
public class ScheduleController {
	
	private ScheduleService scheduleService = new ScheduleServiceImpl();
	private ScheduleFlightService scheduleFlightService = new ScheduleFlightServiceImpl();
	@PostMapping("/addSchedule")
	public String addSchedule(@RequestBody Schedule schedule)
	{
		return scheduleService.addSchedule(schedule);
	}
	
	@PostMapping("/addScheduleFlight")
	public String addScheduleFlight(@RequestBody ScheduleFlight scheduleFlight)
	{
		return scheduleFlightService.addScheduleFlight(scheduleFlight);
	}
}






















//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@PostMapping(value = "/schedule/add")
//	public ResponseEntity<Schedule> addSchedule(@ModelAttribute("schedule") Schedule schedule,
//			@RequestParam("sourceAirport") String sourceAirport, @RequestParam("destinationAirport") String destinationAirport,
//			@RequestParam("departureDateTime") String departureDateTime, @RequestParam("arrivalDateTime") String arrivalDateTime)
//	{
//		schedule.setScheduleId(schedule.getScheduleId());
//		schedule.setDepartureDateTime(LocalDateTime.parse(departureDateTime));
//		schedule.setArrivalDateTime(LocalDateTime.parse(arrivalDateTime));
//		try
//		{
//			return new ResponseEntity<Schedule>(scheduleService.addSchedule(schedule), HttpStatus.OK);
//		}
//		catch (Exception e)
//		{
//			return new ResponseEntity("Error in adding flights" + e, HttpStatus.BAD_REQUEST);
//		}
//	}

