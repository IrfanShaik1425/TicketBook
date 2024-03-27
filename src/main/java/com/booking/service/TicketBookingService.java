package com.booking.service;

import java.util.List;

import com.booking.entity.Bus;
import com.booking.entity.TicketBooking;
import com.booking.entity.User;

public interface TicketBookingService 
{
   public String bookTicket(User user, Bus bus, List<Integer> seatNumbers, double totalFare);
}
