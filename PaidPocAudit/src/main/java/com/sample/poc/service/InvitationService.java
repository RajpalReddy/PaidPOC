package com.sample.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.poc.dao.InvitationJpa;
import com.sample.poc.domain.Invitation;

@Service
public class InvitationService {

	@Autowired
	private InvitationJpa invitationJpa;

	public void addInvitation(Invitation invitation) {
		invitationJpa.save(invitation);
	}

	public Invitation getInvitationById(int id) {
		System.out.println("Service: "+invitationJpa.findById(id).get().toString());
		return invitationJpa.findById(id).get();
	}
	
	public List<Invitation> listAllInvitations() {
		List<Invitation> list = invitationJpa.findAll();
		System.out.println("Service: "+list);
		return list;
	}

}