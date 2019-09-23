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

import com.sample.poc.domain.RfpAssign;
import com.sample.poc.service.RfpAssignService;

@RestController
@RequestMapping("/rfpassign")
public class RfpAssignController {

	@Autowired
	private RfpAssignService rfpAssignService;

	@PostMapping("/save")
	@Transactional
	public void saveRfpAssign(@RequestBody RfpAssign rfpAssign) {
		System.out.println(rfpAssign);
		rfpAssignService.addRfpAssign(rfpAssign);
	}

	@GetMapping("/find")
	@Transactional
	public RfpAssign findRfpAssignById(@RequestParam int id) {
		return rfpAssignService.getRfpAssignById(id);
	}

	@GetMapping("/findAll")
	@Transactional
	public List<RfpAssign> findAllRfpAssigns() {
		return rfpAssignService.listAllRfpAssigns();
	}

}
