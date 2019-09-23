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

import com.sample.poc.domain.Rfp;
import com.sample.poc.service.RfpService;

@RestController
@RequestMapping("/rfp")
public class RfpController {

	@Autowired
	private RfpService rfpService;

	@PostMapping("/save")
	@Transactional
	public void saveRfp(@RequestBody Rfp rfp) {
		System.out.println(rfp);
		rfpService.addRfp(rfp);
	}

	@GetMapping("/find")
	@Transactional
	public Rfp findRfpById(@RequestParam int id) {
		return rfpService.getRfpById(id);
	}

	@GetMapping("/findAll")
	@Transactional
	public List<Rfp> findAllRfps() {
		return rfpService.listAllRfps();
	}

}