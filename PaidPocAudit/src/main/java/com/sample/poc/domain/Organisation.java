package com.sample.poc.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "organisation")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Organisation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "organisation_type")
	private String organisationType;

	@Column(name = "email")
	private String email;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "password")
	private String password;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "address")
	private String address;

	@JsonBackReference
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToMany(mappedBy = "organisation", fetch = FetchType.LAZY)
	private List<RfpAssign> rfpAssign;
	
	
	public Organisation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Organisation(int id, String organisationType, String email, String firstName, String lastName,
			String password, String companyName, String address) {
		super();
		this.id = id;
		this.organisationType = organisationType;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.companyName = companyName;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOrganisationType() {
		return organisationType;
	}


	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<RfpAssign> getRfpAssign() {
		return rfpAssign;
	}


	public void setRfpAssign(List<RfpAssign> rfpAssign) {
		this.rfpAssign = rfpAssign;
	}


	@Override
	public String toString() {
		return "Organisation [id=" + id + ", organisationType=" + organisationType + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", password=" + password + ", companyName=" + companyName
				+ ", address=" + address + "]";
	}

}
