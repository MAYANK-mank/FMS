package com.fms.repository;

import org.springframework.data.repository.CrudRepository;

import com.fms.dto.Flight;

public interface FlightRepository extends CrudRepository<Flight, Integer>
{
}