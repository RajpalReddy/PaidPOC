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

import com.sample.poc.domain.Attachment;
import com.sample.poc.service.AttachmentService;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

	@Autowired
	private AttachmentService attachmentService;

	@PostMapping("/save")
	@Transactional
	public void saveAttachment(@RequestBody Attachment attachment) {
		attachmentService.addAttachment(attachment);
	}

	@GetMapping("/find")
	@Transactional
	public Attachment findAttachmentById(@RequestParam int id) {
		return attachmentService.getAttachmentById(id);
	}

	@GetMapping("/findAll")
	@Transactional
	public List<Attachment> findAllAttachments() {
		return attachmentService.listAllAttachments();
	}

}
