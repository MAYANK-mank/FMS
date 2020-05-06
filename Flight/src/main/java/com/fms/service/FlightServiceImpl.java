package com.fms.service;

import java.util.List;

import com.fms.dao.FlightDAO;
import com.fms.dao.FlightDAOImpl;
import com.fms.dto.Flight;

public class FlightServiceImpl implements FlightService{
	
//	@Autowired
//	FlightRepository flightRepository;
	
//	@Autowired
	private FlightDAO flightDAO;
	
	public FlightServiceImpl()
	{
		super();
		flightDAO = new FlightDAOImpl();
	}
	
	@Override
	public String addFlight(Flight flight)
	{
		return flightDAO.addFlight(flight);
	}
	
	@Override
	public List<Flight> getFlight()
	{
		return flightDAO.getFlight();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public Flight addFlight(Flight flight) {
//		//flight.setFlightState(true);
//		//return flightRepository.add(flight);
//	    return flightDAO.addFlight(flight);

