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

import com.sample.poc.domain.DocumentAssign;
import com.sample.poc.service.DocumentAssignService;

@RestController
@RequestMapping("/docassign")
public class DocumentAssignController {

	@Autowired
	private DocumentAssignService documentAssignService;

	@PostMapping("/save")
	@Transactional
	public void saveDocumentAssign(@RequestBody DocumentAssign docAssign) {
		System.out.println(docAssign);
		documentAssignService.addDocumentAssign(docAssign);
	}

	@GetMapping("/find")
	@Transactional
	public DocumentAssign findDocumentAssignBById(@RequestParam int id) {
		return documentAssignService.getDocumentAssignById(id);
	}

	@GetMapping("/findAll")
	@Transactional
	public List<DocumentAssign> findAllDocumentAssigns() {
		return documentAssignService.listAllDocumentAssigns();
	}

}
