package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated Feb 20, 2014 5:07:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionNotificationsUnreadId generated by hbm2java
 */
public class ColfusionNotificationsUnreadId implements java.io.Serializable {

	private int ntfId;
	private Integer receiverId;

	public ColfusionNotificationsUnreadId() {
	}

	public ColfusionNotificationsUnreadId(int ntfId) {
		this.ntfId = ntfId;
	}

	public ColfusionNotificationsUnreadId(int ntfId, Integer receiverId) {
		this.ntfId = ntfId;
		this.receiverId = receiverId;
	}

	public int getNtfId() {
		return this.ntfId;
	}

	public void setNtfId(int ntfId) {
		this.ntfId = ntfId;
	}

	public Integer getReceiverId() {
		return this.receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ColfusionNotificationsUnreadId))
			return false;
		ColfusionNotificationsUnreadId castOther = (ColfusionNotificationsUnreadId) other;

		return (this.getNtfId() == castOther.getNtfId())
				&& ((this.getReceiverId() == castOther.getReceiverId()) || (this
						.getReceiverId() != null
						&& castOther.getReceiverId() != null && this
						.getReceiverId().equals(castOther.getReceiverId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNtfId();
		result = 37
				* result
				+ (getReceiverId() == null ? 0 : this.getReceiverId()
						.hashCode());
		return result;
	}

}
