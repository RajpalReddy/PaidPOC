package com.sample.poc.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "document_type")
public class DocumentType {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "document_name")
	private String documentName;

	@Column(name = "document_type")
	private String documentType;

	@Column(name = "required")
	private String required;

	@JsonBackReference(value = "docassign2")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "documentType")
	private List<DocumentAssign> docAssign;

	public DocumentType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocumentType(int id, String documentName, String documentType, String required) {
		super();
		this.id = id;
		this.documentName = documentName;
		this.documentType = documentType;
		this.required = required;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public List<DocumentAssign> getDocAssign() {
		return docAssign;
	}

	public void setDocAssign(List<DocumentAssign> docAssign) {
		this.docAssign = docAssign;
	}

	@Override
	public String toString() {
		return "DocumentType [id=" + id + ", documentName=" + documentName + ", documentType=" + documentType
				+ ", required=" + required + "]";
	}

}