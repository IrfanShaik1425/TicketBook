package com.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Bus;
import com.booking.repository.BusRepository;

@Service
public class BusServiceImplementation implements BusService
{

	@Autowired
	private BusRepository busrepo;
	@Override
	public String saveBus(Bus bus) {
		busrepo.save(bus);
		return null;
	}

}
