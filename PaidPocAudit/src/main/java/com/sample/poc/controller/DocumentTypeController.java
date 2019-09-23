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

import com.sample.poc.domain.DocumentType;
import com.sample.poc.service.DocumentTypeService;

@RestController
@RequestMapping("/documentType")
public class DocumentTypeController {

	@Autowired
	private DocumentTypeService documentTypeService;

	@PostMapping("/save")
	@Transactional
	public void saveDocumentType(@RequestBody DocumentType documentType) {
		System.out.println(documentType);
		documentTypeService.addDocumentType(documentType);
	}

	@GetMapping("/find")
	@Transactional
	public DocumentType findDocumentTypeById(@RequestParam int id) {
		return documentTypeService.getDocumentTypeById(id);
	}

	@GetMapping("/findAll")
	@Transactional
	public List<DocumentType> findAllDocumentTypes() {
		return documentTypeService.listAllDocumentTypes();
	}
}
