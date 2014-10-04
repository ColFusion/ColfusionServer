package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionLoginAttempts generated by hbm2java
 */
public class ColfusionLoginAttempts implements java.io.Serializable {

	private Integer loginId;
	private String loginUsername;
	private Date loginTime;
	private String loginIp;
	private int loginCount;

	public ColfusionLoginAttempts() {
	}

	public ColfusionLoginAttempts(Date loginTime, int loginCount) {
		this.loginTime = loginTime;
		this.loginCount = loginCount;
	}

	public ColfusionLoginAttempts(String loginUsername, Date loginTime,
			String loginIp, int loginCount) {
		this.loginUsername = loginUsername;
		this.loginTime = loginTime;
		this.loginIp = loginIp;
		this.loginCount = loginCount;
	}

	public Integer getLoginId() {
		return this.loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public String getLoginUsername() {
		return this.loginUsername;
	}

	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public int getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

}
