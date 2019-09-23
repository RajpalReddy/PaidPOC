package com.sample.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.poc.dao.OrganisationJpa;
import com.sample.poc.domain.Organisation;

@Service
public class OrganisationService {
	
	@Autowired	
	private OrganisationJpa organisationJpa;

	public void addOrganisation(Organisation organisation) {
		organisationJpa.save(organisation);
	}
	
	public Organisation getOrganisationById(int id) {
		System.out.println(organisationJpa.findById(id).get());
		return organisationJpa.findById(id).get();
	}
	
	public List<Organisation> listAllOrganisations() {
		List<Organisation> list = organisationJpa.findAll();
		System.out.println(list);
		return list;
	}

}
