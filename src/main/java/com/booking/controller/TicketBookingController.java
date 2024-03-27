package com.booking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entity.Bus;
import com.booking.entity.TicketBooking;
import com.booking.entity.User;
import com.booking.repository.BusRepository;
import com.booking.repository.TicketBookingRepository;
import com.booking.repository.UserRepository;
import com.booking.service.TicketBookingService;

@RestController
@RequestMapping("/api/booking")
public class TicketBookingController 
{
	@Autowired
    private TicketBookingService bookingservice;
	@Autowired
	private BusRepository busrepo;
	@Autowired
	private UserRepository userepo;
	@Autowired
	TicketBookingRepository bookingRepository;
	
	@PostMapping("/booking")
	public String bookingTicket(@RequestBody TicketBooking booking)
	{
	    
	    User user = userepo.findById(booking.getUser().getUserId()).get();
	    Bus bus = busrepo.findById(booking.getBus().getBusId()).get();
	    bookingservice.bookTicket(user, bus, booking.getSeatNumbers(), booking.getTotalFare());
		return "Ticket Booked Successfully";
	}
	@GetMapping("/findById/{id}")
	public TicketBooking findById(@PathVariable("id") Long id) {
		
		return bookingRepository.findById(id).get();
	}
	
}
