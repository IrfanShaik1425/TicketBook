package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long>
{
     public Bus findByDepartureCityAndDestinationCity(String departureCity,String destinationCity);
}
