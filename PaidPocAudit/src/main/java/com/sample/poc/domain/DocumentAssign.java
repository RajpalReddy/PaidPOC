package com.sample.poc.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "document_assign")
public class DocumentAssign {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//@JsonBackReference(value = "docassign3")
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "organisation_id_fk")
	private Organisation organisation;
	
	//@JsonBackReference(value = "docassign1")
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "rfp_id_fk")
	private Rfp rfp;
	
	//@JsonBackReference(value = "docassign2")
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "document_type_id_fk")
	private DocumentType documentType;

	public DocumentAssign() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocumentAssign(int id, Organisation organisation, Rfp rfp, DocumentType documentType) {
		super();
		this.id = id;
		this.organisation = organisation;
		this.rfp = rfp;
		this.documentType = documentType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	public Rfp getRfp() {
		return rfp;
	}

	public void setRfp(Rfp rfp) {
		this.rfp = rfp;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	@Override
	public String toString() {
		return "DocAssign [id=" + id + ", organisation=" + organisation + ", rfp=" + rfp + ", documentType="
				+ documentType + "]";
	}
	
}