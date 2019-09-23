package com.sample.poc.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "attachment")
public class Attachment {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "document_type_id")
	private int documentTypeId;
	
	@Column(name = "rfp_id")
	private int rfpId;
	
	@Column(name = "organisation_id")
	private int organisationId;
	
	@Column(name = "file_size")
	private int fileSize;
	
	@Column(name = "file_type")
	private String fileType;
	
	@Column(name = "link")
	private String link;
	
	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	@Temporal(TemporalType.DATE)
	private Date lastModifiedDate;

	public Attachment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attachment(int id, int documentTypeId, int rfpId, int organisationId, int fileSize, String fileType,
			String link, Date createdDate, Date lastModifiedDate) {
		super();
		this.id = id;
		this.documentTypeId = documentTypeId;
		this.rfpId = rfpId;
		this.organisationId = organisationId;
		this.fileSize = fileSize;
		this.fileType = fileType;
		this.link = link;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDocumentTypeId() {
		return documentTypeId;
	}

	public void setDocumentTypeId(int documentTypeId) {
		this.documentTypeId = documentTypeId;
	}

	public int getRfpId() {
		return rfpId;
	}

	public void setRfpId(int rfpId) {
		this.rfpId = rfpId;
	}

	public int getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(int organisationId) {
		this.organisationId = organisationId;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
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

	@Override
	public String toString() {
		return "Attachment [id=" + id + ", documentTypeId=" + documentTypeId + ", rfpId=" + rfpId + ", organisationId="
				+ organisationId + ", fileSize=" + fileSize + ", fileType=" + fileType + ", link=" + link
				+ ", createdDate=" + createdDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
}
