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

import com.sample.poc.domain.Invitation;
import com.sample.poc.service.InvitationService;

@RestController
@RequestMapping("/invitation")
public class InvitationController {

	@Autowired
	private InvitationService invitationService;

	@PostMapping("/save")
	@Transactional
	public void saveInvitation(@RequestBody Invitation invitation) {
		System.out.println(invitation);
		invitationService.addInvitation(invitation);
	}

	@GetMapping("/find")
	@Transactional
	public Invitation findInvitationById(@RequestParam int id) {
		System.out.println("Controller: "+invitationService.getInvitationById(id));
		return invitationService.getInvitationById(id);
	}

	@GetMapping("/findAll")
	@Transactional
	public List<Invitation> findAllInvitations() {
		System.out.println("Controller: "+invitationService.listAllInvitations());
		return invitationService.listAllInvitations();
	}

}
