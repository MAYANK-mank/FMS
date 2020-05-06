package com.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.fms.dto.Flight;

public class FlightDAOImpl implements FlightDAO{

	private List<Flight> flightList =  new ArrayList<>();
	public FlightDAOImpl()
	{
		super();
		setFlight();
	}
	
	@Override
	public String addFlight(Flight flight)
	{
		flightList.add(flight);
		System.out.println(flightList);
		return "flight is added";
	}
	
	@Override
	public List<Flight> getFlight()
	{
		return flightList;
	}
	
	private void setFlight()
	{
		flightList.add(new Flight(1234,"International","AIRY",50,true));
		flightList.add(new Flight(2345,"National","AIR",70,true));
	    flightList.add(new Flight(3456,"Arab","Arabi",45,false));	
	}
	
}

























//	@Override
//	public Flight addFlight(Flight flight)
//	{
//		flightList.add(flight);
//		System.out.println(flightList);
//		return flight;
//	}
