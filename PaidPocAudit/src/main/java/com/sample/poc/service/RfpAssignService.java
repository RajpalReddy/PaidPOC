package com.sample.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.poc.dao.RfpAssignJpa;
import com.sample.poc.domain.RfpAssign;

@Service
public class RfpAssignService {

	@Autowired
	RfpAssignJpa rfpAssignJpa;

	public void addRfpAssign(RfpAssign rfpAssign) {
		rfpAssignJpa.save(rfpAssign);
	}
	
	public RfpAssign getRfpAssignById(int id) {
		System.out.println(rfpAssignJpa.findById(id).get().toString());
		return rfpAssignJpa.findById(id).get();
	}
	
	public List<RfpAssign> listAllRfpAssigns() {
		List<RfpAssign> list = rfpAssignJpa.findAll();
		System.out.println(list);
		return list;
	}

}
