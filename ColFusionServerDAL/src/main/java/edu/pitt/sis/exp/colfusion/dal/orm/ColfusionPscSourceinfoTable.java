package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated Dec 3, 2014 8:12:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionPscSourceinfoTable generated by hbm2java
 */
public class ColfusionPscSourceinfoTable implements java.io.Serializable {

	private ColfusionPscSourceinfoTableId id;
	private ColfusionSourceinfo colfusionSourceinfo;
	private ColfusionProcesses colfusionProcesses;
	private String pscDatabase;
	private String pscTableName;
	private Date whenReplicationStarted;
	private Date whenReplicationFinished;

	public ColfusionPscSourceinfoTable() {
	}

	public ColfusionPscSourceinfoTable(final ColfusionPscSourceinfoTableId id,
			final ColfusionSourceinfo colfusionSourceinfo, final String pscDatabase,
			final String pscTableName) {
		this.id = id;
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.pscDatabase = pscDatabase;
		this.pscTableName = pscTableName;
	}

	public ColfusionPscSourceinfoTable(final ColfusionPscSourceinfoTableId id,
			final ColfusionSourceinfo colfusionSourceinfo,
			final ColfusionProcesses colfusionProcesses, final String pscDatabase,
			final String pscTableName, final Date whenReplicationStarted,
			final Date whenReplicationFinished) {
		this.id = id;
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.colfusionProcesses = colfusionProcesses;
		this.pscDatabase = pscDatabase;
		this.pscTableName = pscTableName;
		this.whenReplicationStarted = whenReplicationStarted;
		this.whenReplicationFinished = whenReplicationFinished;
	}

	public ColfusionPscSourceinfoTableId getId() {
		return this.id;
	}

	public void setId(final ColfusionPscSourceinfoTableId id) {
		this.id = id;
	}

	public ColfusionSourceinfo getColfusionSourceinfo() {
		return this.colfusionSourceinfo;
	}

	public void setColfusionSourceinfo(final ColfusionSourceinfo colfusionSourceinfo) {
		this.colfusionSourceinfo = colfusionSourceinfo;
	}

	public ColfusionProcesses getColfusionProcesses() {
		return this.colfusionProcesses;
	}

	public void setColfusionProcesses(final ColfusionProcesses colfusionProcesses) {
		this.colfusionProcesses = colfusionProcesses;
	}

	public String getPscDatabase() {
		return this.pscDatabase;
	}

	public void setPscDatabase(final String pscDatabase) {
		this.pscDatabase = pscDatabase;
	}

	public String getPscTableName() {
		return this.pscTableName;
	}

	public void setPscTableName(final String pscTableName) {
		this.pscTableName = pscTableName;
	}

	public Date getWhenReplicationStarted() {
		return this.whenReplicationStarted;
	}

	public void setWhenReplicationStarted(final Date whenReplicationStarted) {
		this.whenReplicationStarted = whenReplicationStarted;
	}

	public Date getWhenReplicationFinished() {
		return this.whenReplicationFinished;
	}

	public void setWhenReplicationFinished(final Date whenReplicationFinished) {
		this.whenReplicationFinished = whenReplicationFinished;
	}

}