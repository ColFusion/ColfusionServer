package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionValidationCodeId generated by hbm2java
 */
public class ColfusionValidationCodeId implements java.io.Serializable {

	private String email;
	private String vcode;
	private boolean isUsed;

	public ColfusionValidationCodeId() {
	}

	public ColfusionValidationCodeId(String email, String vcode, boolean isUsed) {
		this.email = email;
		this.vcode = vcode;
		this.isUsed = isUsed;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVcode() {
		return this.vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	public boolean isIsUsed() {
		return this.isUsed;
	}

	public void setIsUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ColfusionValidationCodeId))
			return false;
		ColfusionValidationCodeId castOther = (ColfusionValidationCodeId) other;

		return ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
				&& castOther.getEmail() != null && this.getEmail().equals(
				castOther.getEmail())))
				&& ((this.getVcode() == castOther.getVcode()) || (this
						.getVcode() != null && castOther.getVcode() != null && this
						.getVcode().equals(castOther.getVcode())))
				&& (this.isIsUsed() == castOther.isIsUsed());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getVcode() == null ? 0 : this.getVcode().hashCode());
		result = 37 * result + (this.isIsUsed() ? 1 : 0);
		return result;
	}

}
