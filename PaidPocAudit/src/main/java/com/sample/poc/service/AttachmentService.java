package com.sample.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.poc.dao.AttachmentJpa;
import com.sample.poc.domain.Attachment;

@Service
public class AttachmentService {

	@Autowired
	AttachmentJpa attachmentJpa;

	public void addAttachment(Attachment attachment) {
		attachmentJpa.save(attachment);
	}
	
	public Attachment getAttachmentById(int id) {
		System.out.println(attachmentJpa.findById(id).get().toString());
		return attachmentJpa.findById(id).get();
	}
	
	public List<Attachment> listAllAttachments() {
		List<Attachment> list = attachmentJpa.findAll();
		System.out.println(list);
		return list;
	}

}
