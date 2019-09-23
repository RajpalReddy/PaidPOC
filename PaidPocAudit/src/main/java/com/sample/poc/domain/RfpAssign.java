package com.sample.poc.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "rfp_assign")
public class RfpAssign {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "status")
	private String status;

	@Column(name = "comments")
	private String comments;
	
	//@JsonManagedReference
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "organisation_id_fk")
	private Organisation organisation;
	
	//@JsonManagedReference(value = "rfpassign2")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "rfp_id_fk")
	private Rfp rfp;

	public RfpAssign() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RfpAssign(int id, String status, String comments, Organisation organisation, Rfp rfp) {
		super();
		this.id = id;
		this.status = status;
		this.comments = comments;
		this.organisation = organisation;
		this.rfp = rfp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	@Override
	public String toString() {
		return "RfpAssign [id=" + id + ", status=" + status + ", comments=" + comments + ", organisation="
				+ organisation + ", rfp=" + rfp + "]";
	}

}