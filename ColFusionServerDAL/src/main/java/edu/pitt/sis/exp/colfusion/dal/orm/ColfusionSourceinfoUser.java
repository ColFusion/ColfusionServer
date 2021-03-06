package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionSourceinfoUser generated by hbm2java
 */
public class ColfusionSourceinfoUser implements java.io.Serializable {

	private ColfusionSourceinfoUserId id;
	private ColfusionSourceinfo colfusionSourceinfo;
	private ColfusionUserroles colfusionUserroles;
	private ColfusionUsers colfusionUsers;

	public ColfusionSourceinfoUser() {
	}

	public ColfusionSourceinfoUser(ColfusionSourceinfoUserId id,
			ColfusionSourceinfo colfusionSourceinfo,
			ColfusionUserroles colfusionUserroles, ColfusionUsers colfusionUsers) {
		this.id = id;
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.colfusionUserroles = colfusionUserroles;
		this.colfusionUsers = colfusionUsers;
	}

	public ColfusionSourceinfoUserId getId() {
		return this.id;
	}

	public void setId(ColfusionSourceinfoUserId id) {
		this.id = id;
	}

	public ColfusionSourceinfo getColfusionSourceinfo() {
		return this.colfusionSourceinfo;
	}

	public void setColfusionSourceinfo(ColfusionSourceinfo colfusionSourceinfo) {
		this.colfusionSourceinfo = colfusionSourceinfo;
	}

	public ColfusionUserroles getColfusionUserroles() {
		return this.colfusionUserroles;
	}

	public void setColfusionUserroles(ColfusionUserroles colfusionUserroles) {
		this.colfusionUserroles = colfusionUserroles;
	}

	public ColfusionUsers getColfusionUsers() {
		return this.colfusionUsers;
	}

	public void setColfusionUsers(ColfusionUsers colfusionUsers) {
		this.colfusionUsers = colfusionUsers;
	}

}
