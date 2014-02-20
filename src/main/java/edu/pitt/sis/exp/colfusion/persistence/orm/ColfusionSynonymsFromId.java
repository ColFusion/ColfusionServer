package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated Feb 20, 2014 5:07:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionSynonymsFromId generated by hbm2java
 */
public class ColfusionSynonymsFromId implements java.io.Serializable {

	private int synId;
	private int userId;
	private int sid;
	private String tableName;
	private String transInput;
	private String value;

	public ColfusionSynonymsFromId() {
	}

	public ColfusionSynonymsFromId(int synId, int userId, int sid,
			String tableName) {
		this.synId = synId;
		this.userId = userId;
		this.sid = sid;
		this.tableName = tableName;
	}

	public ColfusionSynonymsFromId(int synId, int userId, int sid,
			String tableName, String transInput, String value) {
		this.synId = synId;
		this.userId = userId;
		this.sid = sid;
		this.tableName = tableName;
		this.transInput = transInput;
		this.value = value;
	}

	public int getSynId() {
		return this.synId;
	}

	public void setSynId(int synId) {
		this.synId = synId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getTransInput() {
		return this.transInput;
	}

	public void setTransInput(String transInput) {
		this.transInput = transInput;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ColfusionSynonymsFromId))
			return false;
		ColfusionSynonymsFromId castOther = (ColfusionSynonymsFromId) other;

		return (this.getSynId() == castOther.getSynId())
				&& (this.getUserId() == castOther.getUserId())
				&& (this.getSid() == castOther.getSid())
				&& ((this.getTableName() == castOther.getTableName()) || (this
						.getTableName() != null
						&& castOther.getTableName() != null && this
						.getTableName().equals(castOther.getTableName())))
				&& ((this.getTransInput() == castOther.getTransInput()) || (this
						.getTransInput() != null
						&& castOther.getTransInput() != null && this
						.getTransInput().equals(castOther.getTransInput())))
				&& ((this.getValue() == castOther.getValue()) || (this
						.getValue() != null && castOther.getValue() != null && this
						.getValue().equals(castOther.getValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSynId();
		result = 37 * result + this.getUserId();
		result = 37 * result + this.getSid();
		result = 37 * result
				+ (getTableName() == null ? 0 : this.getTableName().hashCode());
		result = 37
				* result
				+ (getTransInput() == null ? 0 : this.getTransInput()
						.hashCode());
		result = 37 * result
				+ (getValue() == null ? 0 : this.getValue().hashCode());
		return result;
	}

}
