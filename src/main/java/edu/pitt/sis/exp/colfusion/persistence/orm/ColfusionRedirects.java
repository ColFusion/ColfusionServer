package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated Feb 20, 2014 5:07:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionRedirects generated by hbm2java
 */
public class ColfusionRedirects implements java.io.Serializable {

	private Integer redirectId;
	private String redirectOld;
	private String redirectNew;

	public ColfusionRedirects() {
	}

	public ColfusionRedirects(String redirectOld, String redirectNew) {
		this.redirectOld = redirectOld;
		this.redirectNew = redirectNew;
	}

	public Integer getRedirectId() {
		return this.redirectId;
	}

	public void setRedirectId(Integer redirectId) {
		this.redirectId = redirectId;
	}

	public String getRedirectOld() {
		return this.redirectOld;
	}

	public void setRedirectOld(String redirectOld) {
		this.redirectOld = redirectOld;
	}

	public String getRedirectNew() {
		return this.redirectNew;
	}

	public void setRedirectNew(String redirectNew) {
		this.redirectNew = redirectNew;
	}

}
