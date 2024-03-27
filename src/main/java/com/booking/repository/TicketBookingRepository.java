package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.entity.TicketBooking;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Long>
{
   
}
