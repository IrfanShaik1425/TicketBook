package com.booking.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Bus;
import com.booking.entity.TicketBooking;
import com.booking.entity.User;
import com.booking.repository.TicketBookingRepository;

@Service
public class TicketBookingImplementation implements TicketBookingService
{

	@Autowired
	private TicketBookingRepository bookingrepo;
	@Override
	public String bookTicket(User user, Bus bus, List<Integer> seatNumbers, double totalFare) {
		bus.setAvailableSeats(bus.getAvailableSeats()-seatNumbers.size());
		TicketBooking booking = new TicketBooking();
		booking.setUser(user);
		booking.setBus(bus);
		booking.setSeatNumbers(seatNumbers);
		booking.setTotalFare(totalFare);
		booking.setBookingTime(LocalDateTime.now());
		booking.setStatus("Confirmed");
		
		bookingrepo.save(booking);
		return null;
			}

}
