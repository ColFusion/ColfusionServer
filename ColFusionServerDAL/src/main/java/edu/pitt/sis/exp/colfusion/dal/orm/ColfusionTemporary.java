package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionTemporary generated by hbm2java
 */
public class ColfusionTemporary implements java.io.Serializable {

	private Integer tid;
	private ColfusionSourceinfo colfusionSourceinfo;
	private Date spd;
	private Date drd;
	private String dname;
	private String location;
	private String aggrType;
	private Date start;
	private Date end;
	private String value;
	private int eid;
	private Integer rownum;
	private Integer columnnum;
	private String cid;

	public ColfusionTemporary() {
	}

	public ColfusionTemporary(ColfusionSourceinfo colfusionSourceinfo, int eid) {
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.eid = eid;
	}

	public ColfusionTemporary(ColfusionSourceinfo colfusionSourceinfo,
			Date spd, Date drd, String dname, String location, String aggrType,
			Date start, Date end, String value, int eid, Integer rownum,
			Integer columnnum, String cid) {
		this.colfusionSourceinfo = colfusionSourceinfo;
		this.spd = spd;
		this.drd = drd;
		this.dname = dname;
		this.location = location;
		this.aggrType = aggrType;
		this.start = start;
		this.end = end;
		this.value = value;
		this.eid = eid;
		this.rownum = rownum;
		this.columnnum = columnnum;
		this.cid = cid;
	}

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public ColfusionSourceinfo getColfusionSourceinfo() {
		return this.colfusionSourceinfo;
	}

	public void setColfusionSourceinfo(ColfusionSourceinfo colfusionSourceinfo) {
		this.colfusionSourceinfo = colfusionSourceinfo;
	}

	public Date getSpd() {
		return this.spd;
	}

	public void setSpd(Date spd) {
		this.spd = spd;
	}

	public Date getDrd() {
		return this.drd;
	}

	public void setDrd(Date drd) {
		this.drd = drd;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAggrType() {
		return this.aggrType;
	}

	public void setAggrType(String aggrType) {
		this.aggrType = aggrType;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Integer getRownum() {
		return this.rownum;
	}

	public void setRownum(Integer rownum) {
		this.rownum = rownum;
	}

	public Integer getColumnnum() {
		return this.columnnum;
	}

	public void setColumnnum(Integer columnnum) {
		this.columnnum = columnnum;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

}
