package com.sample.poc.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Rfp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String rfpName;
	
	private String rfpDescription;
	
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Temporal(TemporalType.DATE)
	private Date lastModifiedDate;
	
	@JsonBackReference
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToMany(mappedBy = "rfp", fetch = FetchType.EAGER)
	private List<Invitation> invitation;
	
	
	public Rfp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Rfp(int id, String rfpName, String rfpDescription, Date createdDate, Date lastModifiedDate) {
		super();
		this.id = id;
		this.rfpName = rfpName;
		this.rfpDescription = rfpDescription;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRfpName() {
		return rfpName;
	}


	public void setRfpName(String rfpName) {
		this.rfpName = rfpName;
	}


	public String getRfpDescription() {
		return rfpDescription;
	}


	public void setRfpDescription(String rfpDescription) {
		this.rfpDescription = rfpDescription;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}


	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}


	public List<Invitation> getInvitation() {
		return invitation;
	}


	public void setInvitation(List<Invitation> invitation) {
		this.invitation = invitation;
	}


	@Override
	public String toString() {
		return "Rfp [id=" + id + ", rfpName=" + rfpName + ", rfpDescription=" + rfpDescription + ", createdDate="
				+ createdDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}

}