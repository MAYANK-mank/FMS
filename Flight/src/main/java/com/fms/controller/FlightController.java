package com.fms.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.dto.Flight;
import com.fms.service.FlightService;
import com.fms.service.FlightServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(path= "/api")
public class FlightController { 
	
	private FlightService flightService = new FlightServiceImpl();
	
	@PostMapping("/addFlight")
	public String addFlight(@RequestBody Flight flight)
	{
		return flightService.addFlight(flight);
	}
}






















// //private static final Logger logger = LoggerFactory.getLogger(FlightController.class);
//	public ResponseEntity<?> addFlight(@ModelAttribute Flight flight) throws FlightExceptions
//	{
//		logger.info("adding the flight");
//		Flight flightToBeAdded = flightService.addFlight(flight);
//	    if(flightToBeAdded == null)
//	    {
//	    	logger.error("flight is not added");
//	    	return new ResponseEntity<>("flight is not added", HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	    else
//	    {
//	    	logger.info("flight is added");
//	    	return new ResponseEntity<Flight>(flightToBeAdded, HttpStatus.OK);
//	    }
//	}