package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionExecuteinfo generated by hbm2java
 */
public class ColfusionExecuteinfo implements java.io.Serializable {

	private Integer eid;
	private ColfusionSourceinfo colfusionSourceinfo;
	private String userId;
	private Date timeStart;
	private Date timeEnd;
	private String exitStatus;
	private String errorMessage;
	private Integer recordsProcessed;
	private String status;
	private String panCommand;
	private String tableName;
	private String log;

	public ColfusionExecuteinfo() {
	}

	public ColfusionExecuteinfo(ColfusionSourceinfo colfusionSourceinfo,
			String tableName) {
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.tableName = tableName;
	}

	public ColfusionExecuteinfo(ColfusionSourceinfo colfusionSourceinfo,
			String userId, Date timeStart, Date timeEnd, String exitStatus,
			String errorMessage, Integer recordsProcessed, String status,
			String panCommand, String tableName, String log) {
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.userId = userId;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.exitStatus = exitStatus;
		this.errorMessage = errorMessage;
		this.recordsProcessed = recordsProcessed;
		this.status = status;
		this.panCommand = panCommand;
		this.tableName = tableName;
		this.log = log;
	}

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public ColfusionSourceinfo getColfusionSourceinfo() {
		return this.colfusionSourceinfo;
	}

	public void setColfusionSourceinfo(ColfusionSourceinfo colfusionSourceinfo) {
		this.colfusionSourceinfo = colfusionSourceinfo;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getExitStatus() {
		return this.exitStatus;
	}

	public void setExitStatus(String exitStatus) {
		this.exitStatus = exitStatus;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getRecordsProcessed() {
		return this.recordsProcessed;
	}

	public void setRecordsProcessed(Integer recordsProcessed) {
		this.recordsProcessed = recordsProcessed;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPanCommand() {
		return this.panCommand;
	}

	public void setPanCommand(String panCommand) {
		this.panCommand = panCommand;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}

}
