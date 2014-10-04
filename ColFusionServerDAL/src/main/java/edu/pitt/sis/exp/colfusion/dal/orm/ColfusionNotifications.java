package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * ColfusionNotifications generated by hbm2java
 */
public class ColfusionNotifications implements java.io.Serializable {

	private Integer ntfId;
	private ColfusionUsers colfusionUsers;
	private Integer targetId;
	private String action;
	private Set colfusionNotificationsUnreads = new HashSet(0);

	public ColfusionNotifications() {
	}

	public ColfusionNotifications(String action) {
		this.action = action;
	}

	public ColfusionNotifications(ColfusionUsers colfusionUsers,
			Integer targetId, String action, Set colfusionNotificationsUnreads) {
		this.colfusionUsers = colfusionUsers;
		this.targetId = targetId;
		this.action = action;
		this.colfusionNotificationsUnreads = colfusionNotificationsUnreads;
	}

	public Integer getNtfId() {
		return this.ntfId;
	}

	public void setNtfId(Integer ntfId) {
		this.ntfId = ntfId;
	}

	public ColfusionUsers getColfusionUsers() {
		return this.colfusionUsers;
	}

	public void setColfusionUsers(ColfusionUsers colfusionUsers) {
		this.colfusionUsers = colfusionUsers;
	}

	public Integer getTargetId() {
		return this.targetId;
	}

	public void setTargetId(Integer targetId) {
		this.targetId = targetId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Set getColfusionNotificationsUnreads() {
		return this.colfusionNotificationsUnreads;
	}

	public void setColfusionNotificationsUnreads(
			Set colfusionNotificationsUnreads) {
		this.colfusionNotificationsUnreads = colfusionNotificationsUnreads;
	}

}
