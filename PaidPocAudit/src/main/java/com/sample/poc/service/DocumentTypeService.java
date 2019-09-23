package com.sample.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.poc.dao.DocumentTypeJpa;
import com.sample.poc.domain.DocumentType;

@Service
public class DocumentTypeService {

	@Autowired
	private DocumentTypeJpa documentTypeJpa;

	public void addDocumentType(DocumentType dto) {
		documentTypeJpa.save(dto);
	}
	
	public DocumentType getDocumentTypeById(int id) {
		System.out.println(documentTypeJpa.findById(id).get().toString());
		return documentTypeJpa.findById(id).get();
	}
	
	public List<DocumentType> listAllDocumentTypes() {
		List<DocumentType> list = documentTypeJpa.findAll();
		System.out.println(list);
		return list;
	}

}
