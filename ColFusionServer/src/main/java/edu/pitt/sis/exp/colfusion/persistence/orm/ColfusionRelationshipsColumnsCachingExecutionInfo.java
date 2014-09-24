package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionRelationshipsColumnsCachingexecutioninfo generated by hbm2java
 */
public class ColfusionRelationshipsColumnsCachingExecutionInfo implements
		java.io.Serializable {

	private String transformation;
	private String status;
	private Date timeStart;
	private Date timeEnd;
	private String errorMessage;
	private String query;

	public ColfusionRelationshipsColumnsCachingExecutionInfo() {
	}

	public ColfusionRelationshipsColumnsCachingExecutionInfo(
			String transformation) {
		this.transformation = transformation;
	}

	public ColfusionRelationshipsColumnsCachingExecutionInfo(
			String transformation, String status, Date timeStart, Date timeEnd,
			String errorMessage, String query) {
		this.transformation = transformation;
		this.status = status;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.errorMessage = errorMessage;
		this.query = query;
	}

	public String getTransformation() {
		return this.transformation;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}