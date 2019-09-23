package com.sample.poc.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Invitation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String email;
	
	private String invitationStatus;
	
	private String organisationType;
	
	//@JsonManagedReference(value = "invitation1")
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.EAGER)
	private Rfp rfp;
	

	public Invitation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Invitation(int id, String email, String invitationStatus, String organisationType, Rfp rfp) {
		super();
		this.id = id;
		this.email = email;
		this.invitationStatus = invitationStatus;
		this.organisationType = organisationType;
		this.rfp = rfp;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getInvitationStatus() {
		return invitationStatus;
	}


	public void setInvitationStatus(String invitationStatus) {
		this.invitationStatus = invitationStatus;
	}


	public String getOrganisationType() {
		return organisationType;
	}


	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}


	public Rfp getRfp() {
		return rfp;
	}


	public void setRfp(Rfp rfp) {
		this.rfp = rfp;
	}


	@Override
	public String toString() {
		return "Invitation [id=" + id + ", email=" + email + ", invitationStatus=" + invitationStatus
				+ ", organisationType=" + organisationType + ", rfp=" + rfp + "]";
	}
	
}