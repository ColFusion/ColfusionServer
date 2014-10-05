package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionSourceinfoTableKtrId generated by hbm2java
 */
public class ColfusionSourceinfoTableKtrId implements java.io.Serializable {

	private int sid;
	private String tableName;

	public ColfusionSourceinfoTableKtrId() {
	}

	public ColfusionSourceinfoTableKtrId(int sid, String tableName) {
		this.sid = sid;
		this.tableName = tableName;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ColfusionSourceinfoTableKtrId))
			return false;
		ColfusionSourceinfoTableKtrId castOther = (ColfusionSourceinfoTableKtrId) other;

		return (this.getSid() == castOther.getSid())
				&& ((this.getTableName() == castOther.getTableName()) || (this
						.getTableName() != null
						&& castOther.getTableName() != null && this
						.getTableName().equals(castOther.getTableName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSid();
		result = 37 * result
				+ (getTableName() == null ? 0 : this.getTableName().hashCode());
		return result;
	}

}
