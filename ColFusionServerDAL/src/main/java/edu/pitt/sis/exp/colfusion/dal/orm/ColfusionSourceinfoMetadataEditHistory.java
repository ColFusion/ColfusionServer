package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionSourceinfoMetadataEditHistory generated by hbm2java
 */
public class ColfusionSourceinfoMetadataEditHistory implements
		java.io.Serializable {

	private Integer hid;
	private ColfusionSourceinfo colfusionSourceinfo;
	private ColfusionUsers colfusionUsers;
	private Date whenSaved;
	private String item;
	private String reason;
	private String itemValue;

	public ColfusionSourceinfoMetadataEditHistory() {
	}

	public ColfusionSourceinfoMetadataEditHistory(
			ColfusionSourceinfo colfusionSourceinfo,
			ColfusionUsers colfusionUsers, Date whenSaved, String item,
			String itemValue) {
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.colfusionUsers = colfusionUsers;
		this.whenSaved = whenSaved;
		this.item = item;
		this.itemValue = itemValue;
	}

	public ColfusionSourceinfoMetadataEditHistory(
			ColfusionSourceinfo colfusionSourceinfo,
			ColfusionUsers colfusionUsers, Date whenSaved, String item,
			String reason, String itemValue) {
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.colfusionUsers = colfusionUsers;
		this.whenSaved = whenSaved;
		this.item = item;
		this.reason = reason;
		this.itemValue = itemValue;
	}

	public Integer getHid() {
		return this.hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
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

	public Date getWhenSaved() {
		return this.whenSaved;
	}

	public void setWhenSaved(Date whenSaved) {
		this.whenSaved = whenSaved;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getItemValue() {
		return this.itemValue;
	}

	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}

}
