package com.sample.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.poc.dao.DocumentAssignJpa;
import com.sample.poc.domain.DocumentAssign;

@Service
public class DocumentAssignService {

	@Autowired
	DocumentAssignJpa documentAssignJpa;

	public void addDocumentAssign(DocumentAssign docAssign) {
		documentAssignJpa.save(docAssign);
	}
	
	public DocumentAssign getDocumentAssignById(int id) {
		System.out.println(documentAssignJpa.findById(id).get().toString());
		return documentAssignJpa.findById(id).get();
	}
	
	public List<DocumentAssign> listAllDocumentAssigns() {
		List<DocumentAssign> list = documentAssignJpa.findAll();
		System.out.println(list);
		return list;
	}

}
