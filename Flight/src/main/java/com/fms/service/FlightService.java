package com.fms.service;

import java.util.List;

import com.fms.dto.Flight;

public interface FlightService {

	public abstract String addFlight(Flight flight);
	public abstract List<Flight> getFlight();
}
