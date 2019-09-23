package com.sample.poc.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.poc.domain.Organisation;
import com.sample.poc.service.OrganisationService;

@RestController
@RequestMapping("/organisation")
public class OrganisationController {

	@Autowired
	private OrganisationService organisationService;

	@PostMapping("/save")
	@Transactional
	public void saveOrganisation(@RequestBody Organisation organisation) {
		System.out.println(organisation);
		organisationService.addOrganisation(organisation);
	}

	@GetMapping("/find")
	@Transactional
	public Organisation findOrganisationById(@RequestParam int id) {
		return organisationService.getOrganisationById(id);
	}

	@GetMapping("/findAll")
	@Transactional
	public List<Organisation> findAllOrganisations() {
		return organisationService.listAllOrganisations();
	}

}