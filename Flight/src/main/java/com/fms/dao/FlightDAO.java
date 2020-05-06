package com.fms.dao;

import java.util.List;

import com.fms.dto.Flight;

public interface FlightDAO {

	public abstract String addFlight(Flight flight);
	public abstract List<Flight> getFlight();
	//public Flight addFlight(Flight flight);
}
