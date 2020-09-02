package com.pixels.searchpoAddress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.pixels.searchpoAddress.model.OfficeAddress;
import com.pixels.searchpoAddress.repository.AddressRepository;

import reactor.core.publisher.Flux;

@RestController
public class AddressController {
	@Autowired
	private AddressRepository repo;

	@GetMapping("/sayhello")
	public String sayHello()
	{
		return "Hello Everyone";
	}
	
	@GetMapping("/getOfficeDetail")
	public Flux<OfficeAddress> getAddress()
	{
		return repo.findAll();
	}
	
	@GetMapping("/getOfficebyofficename/{officename}")
	public Flux<OfficeAddress> getOfficeadddressbyOfficeName(@PathVariable String officename)
	{
		String officeaddressname="^"+officename;
		Flux<OfficeAddress> ls=repo.findByOfficeName(officeaddressname);
		return ls;
	}
	
	@GetMapping("/getOfficebydistrictname/{districtname}")
	public Flux<OfficeAddress> getOfficeadddressbyDistrict(@PathVariable String districtname)
	{
		String distname="^"+districtname;
		Flux<OfficeAddress> ls=repo.findByDistrictName(distname);
		return ls;
	}
	
}
