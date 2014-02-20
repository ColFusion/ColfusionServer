package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated Feb 20, 2014 5:07:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionDesAttachments generated by hbm2java
 */
public class ColfusionDesAttachments implements java.io.Serializable {

	private Integer fileId;
	private ColfusionSourceinfo colfusionSourceinfo;
	private ColfusionUsers colfusionUsers;
	private String title;
	private String filename;
	private String description;
	private Integer size;
	private Date uploadTime;

	public ColfusionDesAttachments() {
	}

	public ColfusionDesAttachments(ColfusionSourceinfo colfusionSourceinfo,
			ColfusionUsers colfusionUsers, String title, String filename) {
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.colfusionUsers = colfusionUsers;
		this.title = title;
		this.filename = filename;
	}

	public ColfusionDesAttachments(ColfusionSourceinfo colfusionSourceinfo,
			ColfusionUsers colfusionUsers, String title, String filename,
			String description, Integer size, Date uploadTime) {
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.colfusionUsers = colfusionUsers;
		this.title = title;
		this.filename = filename;
		this.description = description;
		this.size = size;
		this.uploadTime = uploadTime;
	}

	public Integer getFileId() {
		return this.fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public ColfusionSourceinfo getColfusionSourceinfo() {
		return this.colfusionSourceinfo;
	}

	public void setColfusionSourceinfo(ColfusionSourceinfo colfusionSourceinfo) {
		this.colfusionSourceinfo = colfusionSourceinfo;
	}

	public ColfusionUsers getColfusionUsers() {
		return this.colfusionUsers;
	}

	public void setColfusionUsers(ColfusionUsers colfusionUsers) {
		this.colfusionUsers = colfusionUsers;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

}
