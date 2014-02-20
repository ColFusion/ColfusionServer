package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated Feb 20, 2014 5:07:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionGroups generated by hbm2java
 */
public class ColfusionGroups implements java.io.Serializable {

	private Integer groupId;
	private int groupCreator;
	private String groupStatus;
	private int groupMembers;
	private Date groupDate;
	private String groupSafename;
	private String groupName;
	private String groupDescription;
	private String groupPrivacy;
	private String groupAvatar;
	private int groupVoteToPublish;
	private String groupField1;
	private String groupField2;
	private String groupField3;
	private String groupField4;
	private String groupField5;
	private String groupField6;
	private boolean groupNotifyEmail;

	public ColfusionGroups() {
	}

	public ColfusionGroups(int groupCreator, String groupStatus,
			int groupMembers, Date groupDate, int groupVoteToPublish,
			boolean groupNotifyEmail) {
		this.groupCreator = groupCreator;
		this.groupStatus = groupStatus;
		this.groupMembers = groupMembers;
		this.groupDate = groupDate;
		this.groupVoteToPublish = groupVoteToPublish;
		this.groupNotifyEmail = groupNotifyEmail;
	}

	public ColfusionGroups(int groupCreator, String groupStatus,
			int groupMembers, Date groupDate, String groupSafename,
			String groupName, String groupDescription, String groupPrivacy,
			String groupAvatar, int groupVoteToPublish, String groupField1,
			String groupField2, String groupField3, String groupField4,
			String groupField5, String groupField6, boolean groupNotifyEmail) {
		this.groupCreator = groupCreator;
		this.groupStatus = groupStatus;
		this.groupMembers = groupMembers;
		this.groupDate = groupDate;
		this.groupSafename = groupSafename;
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.groupPrivacy = groupPrivacy;
		this.groupAvatar = groupAvatar;
		this.groupVoteToPublish = groupVoteToPublish;
		this.groupField1 = groupField1;
		this.groupField2 = groupField2;
		this.groupField3 = groupField3;
		this.groupField4 = groupField4;
		this.groupField5 = groupField5;
		this.groupField6 = groupField6;
		this.groupNotifyEmail = groupNotifyEmail;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public int getGroupCreator() {
		return this.groupCreator;
	}

	public void setGroupCreator(int groupCreator) {
		this.groupCreator = groupCreator;
	}

	public String getGroupStatus() {
		return this.groupStatus;
	}

	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}

	public int getGroupMembers() {
		return this.groupMembers;
	}

	public void setGroupMembers(int groupMembers) {
		this.groupMembers = groupMembers;
	}

	public Date getGroupDate() {
		return this.groupDate;
	}

	public void setGroupDate(Date groupDate) {
		this.groupDate = groupDate;
	}

	public String getGroupSafename() {
		return this.groupSafename;
	}

	public void setGroupSafename(String groupSafename) {
		this.groupSafename = groupSafename;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return this.groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public String getGroupPrivacy() {
		return this.groupPrivacy;
	}

	public void setGroupPrivacy(String groupPrivacy) {
		this.groupPrivacy = groupPrivacy;
	}

	public String getGroupAvatar() {
		return this.groupAvatar;
	}

	public void setGroupAvatar(String groupAvatar) {
		this.groupAvatar = groupAvatar;
	}

	public int getGroupVoteToPublish() {
		return this.groupVoteToPublish;
	}

	public void setGroupVoteToPublish(int groupVoteToPublish) {
		this.groupVoteToPublish = groupVoteToPublish;
	}

	public String getGroupField1() {
		return this.groupField1;
	}

	public void setGroupField1(String groupField1) {
		this.groupField1 = groupField1;
	}

	public String getGroupField2() {
		return this.groupField2;
	}

	public void setGroupField2(String groupField2) {
		this.groupField2 = groupField2;
	}

	public String getGroupField3() {
		return this.groupField3;
	}

	public void setGroupField3(String groupField3) {
		this.groupField3 = groupField3;
	}

	public String getGroupField4() {
		return this.groupField4;
	}

	public void setGroupField4(String groupField4) {
		this.groupField4 = groupField4;
	}

	public String getGroupField5() {
		return this.groupField5;
	}

	public void setGroupField5(String groupField5) {
		this.groupField5 = groupField5;
	}

	public String getGroupField6() {
		return this.groupField6;
	}

	public void setGroupField6(String groupField6) {
		this.groupField6 = groupField6;
	}

	public boolean isGroupNotifyEmail() {
		return this.groupNotifyEmail;
	}

	public void setGroupNotifyEmail(boolean groupNotifyEmail) {
		this.groupNotifyEmail = groupNotifyEmail;
	}

}
