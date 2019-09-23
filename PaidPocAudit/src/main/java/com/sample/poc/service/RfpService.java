package com.sample.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.poc.dao.InvitationJpa;
import com.sample.poc.dao.RfpJpa;
import com.sample.poc.domain.Rfp;

@Service
public class RfpService {

	@Autowired
	RfpJpa rfpJpa;

	@Autowired
	InvitationJpa invitationJpa;

	public void addRfp(Rfp rfp) {
		rfpJpa.save(rfp);
	}
	
	public Rfp getRfpById(int id) {
		System.out.println(rfpJpa.findById(id).get().toString());
		return rfpJpa.findById(id).get();
	}
	
	public List<Rfp> listAllRfps() {
		List<Rfp> list = rfpJpa.findAll();
		System.out.println(list);
		return list;
	}

}
