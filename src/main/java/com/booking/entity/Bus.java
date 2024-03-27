package com.booking.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bus 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Long busId;
  private String departureCity;
  private String destinationCity;
  private LocalDateTime departureTimne;
  private LocalDateTime arrivalTime;
  private Integer totalSeats;
  private Integer availableSeats;
  private Double fare;
  private String busType;
public Long getBusId() {
	return busId;
}
public void setBusId(Long busId) {
	this.busId = busId;
}
public String getDepartureCity() {
	return departureCity;
}
public void setDepartureCity(String departureCity) {
	this.departureCity = departureCity;
}
public String getDestinationCity() {
	return destinationCity;
}
public void setDestinationCity(String destinationCity) {
	this.destinationCity = destinationCity;
}
public LocalDateTime getDepartureTimne() {
	return departureTimne;
}
public void setDepartureTimne(LocalDateTime departureTimne) {
	this.departureTimne = departureTimne;
}
public LocalDateTime getArrivalTime() {
	return arrivalTime;
}
public void setArrivalTime(LocalDateTime arrivalTime) {
	this.arrivalTime = arrivalTime;
}
public Integer getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(Integer totalSeats) {
	this.totalSeats = totalSeats;
}
public Integer getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(Integer availableSeats) {
	this.availableSeats = availableSeats;
}
public Double getFare() {
	return fare;
}
public void setFare(Double fare) {
	this.fare = fare;
}
public String getBusType() {
	return busType;
}
public void setBusType(String busType) {
	this.busType = busType;
}
@Override
public int hashCode() {
	return Objects.hash(arrivalTime, availableSeats, busId, busType, departureCity, departureTimne, destinationCity,
			fare, totalSeats);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Bus other = (Bus) obj;
	return Objects.equals(arrivalTime, other.arrivalTime) && Objects.equals(availableSeats, other.availableSeats)
			&& Objects.equals(busId, other.busId) && Objects.equals(busType, other.busType)
			&& Objects.equals(departureCity, other.departureCity)
			&& Objects.equals(departureTimne, other.departureTimne)
			&& Objects.equals(destinationCity, other.destinationCity) && Objects.equals(fare, other.fare)
			&& Objects.equals(totalSeats, other.totalSeats);
}
@Override
public String toString() {
	return "Bus [busId=" + busId + ", departureCity=" + departureCity + ", destinationCity=" + destinationCity
			+ ", departureTimne=" + departureTimne + ", arrivalTime=" + arrivalTime + ", totalSeats=" + totalSeats
			+ ", availableSeats=" + availableSeats + ", fare=" + fare + ", busType=" + busType + "]";
}
public Bus(Long busId, String departureCity, String destinationCity, LocalDateTime departureTimne,
		LocalDateTime arrivalTime, Integer totalSeats, Integer availableSeats, Double fare, String busType) {
	super();
	this.busId = busId;
	this.departureCity = departureCity;
	this.destinationCity = destinationCity;
	this.departureTimne = departureTimne;
	this.arrivalTime = arrivalTime;
	this.totalSeats = totalSeats;
	this.availableSeats = availableSeats;
	this.fare = fare;
	this.busType = busType;
}
public Bus() {
	super();
	// TODO Auto-generated constructor stub
}
  
  

  
  
}
