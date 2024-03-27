package com.booking.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TicketBooking 
{
	
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
   private Long ticketId;
	@ManyToOne
	@JoinColumn(name ="user_id")
   private User user;
	@ManyToOne
	@JoinColumn(name ="bus_id")
   private Bus bus;
	@ElementCollection
   private List<Integer> seatNumbers;
   private LocalDateTime bookingTime;
   private Double totalFare;
   private String status;
public Long getTicketId() {
	return ticketId;
}
public void setTicketId(Long ticketId) {
	this.ticketId = ticketId;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Bus getBus() {
	return bus;
}
public void setBus(Bus bus) {
	this.bus = bus;
}
public List<Integer> getSeatNumbers() {
	return seatNumbers;
}
public void setSeatNumbers(List<Integer> seatNumbers) {
	this.seatNumbers = seatNumbers;
}
public LocalDateTime getBookingTime() {
	return bookingTime;
}
public void setBookingTime(LocalDateTime bookingTime) {
	this.bookingTime = bookingTime;
}
public Double getTotalFare() {
	return totalFare;
}
public void setTotalFare(Double totalFare) {
	this.totalFare = totalFare;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public int hashCode() {
	return Objects.hash(bookingTime, bus, seatNumbers, status, ticketId, totalFare, user);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TicketBooking other = (TicketBooking) obj;
	return Objects.equals(bookingTime, other.bookingTime) && Objects.equals(bus, other.bus)
			&& Objects.equals(seatNumbers, other.seatNumbers) && Objects.equals(status, other.status)
			&& Objects.equals(ticketId, other.ticketId) && Objects.equals(totalFare, other.totalFare)
			&& Objects.equals(user, other.user);
}
@Override
public String toString() {
	return "TicketBooking [ticketId=" + ticketId + ", user=" + user + ", bus=" + bus + ", seatNumbers=" + seatNumbers
			+ ", bookingTime=" + bookingTime + ", totalFare=" + totalFare + ", status=" + status + "]";
}
public TicketBooking(Long ticketId, User user, Bus bus, List<Integer> seatNumbers, LocalDateTime bookingTime,
		Double totalFare, String status) {
	super();
	this.ticketId = ticketId;
	this.user = user;
	this.bus = bus;
	this.seatNumbers = seatNumbers;
	this.bookingTime = bookingTime;
	this.totalFare = totalFare;
	this.status = status;
}
public TicketBooking() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
}
