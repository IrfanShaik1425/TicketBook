package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entity.Bus;
import com.booking.repository.BusRepository;
import com.booking.service.BusService;

@RestController
@RequestMapping("/api/bus")
public class BusController 
{
	@Autowired
   private BusService busservice;
	
	@Autowired
	private BusRepository busrepo;
	
	@PostMapping("/save")
	public String saveBus(@RequestBody Bus bus)
	{
		busservice.saveBusDetails(bus);
		return "Bus Details Save Succssfully";
	}
	
	@GetMapping("/findbus/{departureCity}/{destinationCity}")
	public Bus findById(@PathVariable("departureCity") String departureCity, @PathVariable("destinationCity") String destinationCity )
	{
		return busrepo.findByDepartureCityAndDestinationCity(departureCity, destinationCity);
	}
	
	
}
