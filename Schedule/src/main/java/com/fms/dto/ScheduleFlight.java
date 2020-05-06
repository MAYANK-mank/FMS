package com.fms.dto;

public class ScheduleFlight {

	public Integer scheduleFlightId;
	public Integer availableSeats;
	public Double ticketCost;
	public Boolean scheduleFlightState;
	
	public ScheduleFlight()
	{
		super();
	}
	
	public void setScheduleFlightId(Integer scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public Boolean getScheduleFlightState() {
		return scheduleFlightState;
	}
	public void setScheduleFlightState(Boolean scheduleFlightState) {
		this.scheduleFlightState = scheduleFlightState;
	}
	
	public ScheduleFlight(Integer scheduleFlightId, Integer availableSeats, Double ticketCost, Boolean scheduleFlightState)
	{
		super();
		this.scheduleFlightId = scheduleFlightId;
		this.availableSeats = availableSeats;
		this.ticketCost = ticketCost;
		this.scheduleFlightState = scheduleFlightState;
	}
	
	@Override
	public String toString()
	{
		return "ScheduleFlight [scheduleFlightId=" + scheduleFlightId + ", availableSeats=" + availableSeats + ", ticketCost=" + ticketCost + ", scheduleFlightState=" + scheduleFlightState + "]"; 
	}
	
}
