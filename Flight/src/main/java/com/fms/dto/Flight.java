package com.fms.dto;

public class Flight {

	public Integer flightNumber;
	public String flightModel;
	public String carrierName;
	public Integer seatCapacity;
	public Boolean flightState; 
	
	public Flight()
	{
		super();
	}
	
	public Boolean getFlightState() {
		return flightState;
	}
	public void setFlightState(Boolean flightState) {
		this.flightState = flightState;
	}
	public Integer getFlightNumber()
	{
		return flightNumber;
	}
	public Flight(Integer flightNumber, String flightModel, String carrierName, Integer seatCapacity, Boolean flightState) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
		this.flightState = flightState;
	}
	
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public Integer getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(Integer seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName=" + carrierName + ", seatCapacity=" + seatCapacity + ", flightState=" + flightState + "]";
	}
	
}
