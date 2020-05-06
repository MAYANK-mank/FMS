package com.fms.dto;

public class Schedule {
    public Integer scheduleId;
	public String sourceAirport;
	public String destinationAirport;
	
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
	public String arrivalDateTime;
	public String departureDateTime;
	
	public String getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public String getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public Schedule(Integer scheduleId, String sourceAirport, String destinationAirport, String arrivalDateTime, String departureDateTime) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalDateTime = arrivalDateTime;
		this.departureDateTime = departureDateTime;
		
	}
	@Override
	public String toString()
	{
		return "Schedule [scheduleId=" + scheduleId + ", sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", departureDateTime=" + departureDateTime + ", arrivalDateTime=" + arrivalDateTime + "]";
	}
}
