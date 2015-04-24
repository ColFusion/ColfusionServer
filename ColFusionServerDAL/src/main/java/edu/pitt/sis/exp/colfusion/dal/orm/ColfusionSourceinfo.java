package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ColfusionSourceinfo generated by hbm2java
 */
public class ColfusionSourceinfo implements java.io.Serializable {

	private Integer sid;
	private ColfusionLicense colfusionLicense;
	private ColfusionUsers colfusionUsers;
	private String title;
	private String description;
	private String path;
	private Date entryDate;
	private Date lastUpdated;
	private String status;
	private String rawDataPath;
	private String sourceType;
	private String provenance;
	private Set colfusionSynonymsFroms = new HashSet(0);
	private Set colfusionExecuteinfos = new HashSet(0);
	private Set colfusionSourceinfoUsers = new HashSet(0);
	private Set colfusionTemporaries = new HashSet(0);
	private Set colfusionSynonymsTos = new HashSet(0);
	private Set colfusionSourceinfoTableKtrs = new HashSet(0);
	private Set colfusionRelationshipsesForSid1 = new HashSet(0);
	private Set colfusionDesAttachmentses = new HashSet(0);
	private Set colfusionRelationshipsesForSid2 = new HashSet(0);
	private Set colfusionDnameinfos = new HashSet(0);
	private ColfusionSourceinfoDb colfusionSourceinfoDb;
	private Set colfusionSourceinfoMetadataEditHistories = new HashSet(0);
	private Set colfusionVisualizations = new HashSet(0);

	public ColfusionSourceinfo() {
	}

	public ColfusionSourceinfo(ColfusionUsers colfusionUsers, Date entryDate,
			String sourceType) {
		this.colfusionUsers = colfusionUsers;
		this.entryDate = entryDate;
		this.sourceType = sourceType;
	}

	public ColfusionSourceinfo(ColfusionLicense colfusionLicense,
			ColfusionUsers colfusionUsers, String title, String description, String path,
			Date entryDate, Date lastUpdated, String status,
			String rawDataPath, String sourceType, String provenance,
			Set colfusionSynonymsFroms, Set colfusionExecuteinfos,
			Set colfusionSourceinfoUsers, Set colfusionTemporaries,
			Set colfusionSynonymsTos, Set colfusionSourceinfoTableKtrs,
			Set colfusionRelationshipsesForSid1, Set colfusionDesAttachmentses,
			Set colfusionRelationshipsesForSid2, Set colfusionDnameinfos,
			ColfusionSourceinfoDb colfusionSourceinfoDb,
			Set colfusionSourceinfoMetadataEditHistories,
			Set colfusionVisualizations) {
		this.colfusionLicense = colfusionLicense;
		this.colfusionUsers = colfusionUsers;
		this.title = title;
		this.description = description;
		this.path = path;
		this.entryDate = entryDate;
		this.lastUpdated = lastUpdated;
		this.status = status;
		this.rawDataPath = rawDataPath;
		this.sourceType = sourceType;
		this.provenance = provenance;
		this.colfusionSynonymsFroms = colfusionSynonymsFroms;
		this.colfusionExecuteinfos = colfusionExecuteinfos;
		this.colfusionSourceinfoUsers = colfusionSourceinfoUsers;
		this.colfusionTemporaries = colfusionTemporaries;
		this.colfusionSynonymsTos = colfusionSynonymsTos;
		this.colfusionSourceinfoTableKtrs = colfusionSourceinfoTableKtrs;
		this.colfusionRelationshipsesForSid1 = colfusionRelationshipsesForSid1;
		this.colfusionDesAttachmentses = colfusionDesAttachmentses;
		this.colfusionRelationshipsesForSid2 = colfusionRelationshipsesForSid2;
		this.colfusionDnameinfos = colfusionDnameinfos;
		this.colfusionSourceinfoDb = colfusionSourceinfoDb;
		this.colfusionSourceinfoMetadataEditHistories = colfusionSourceinfoMetadataEditHistories;
		this.colfusionVisualizations = colfusionVisualizations;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public ColfusionLicense getColfusionLicense() {
		return this.colfusionLicense;
	}

	public void setColfusionLicense(ColfusionLicense colfusionLicense) {
		this.colfusionLicense = colfusionLicense;
	}

	public ColfusionUsers getColfusionUsers() {
		return this.colfusionUsers;
	}

	public void setColfusionUsers(ColfusionUsers colfusionUsers) {
		this.colfusionUsers = colfusionUsers;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRawDataPath() {
		return this.rawDataPath;
	}

	public void setRawDataPath(String rawDataPath) {
		this.rawDataPath = rawDataPath;
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getProvenance() {
		return this.provenance;
	}

	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}

	public Set getColfusionSynonymsFroms() {
		return this.colfusionSynonymsFroms;
	}

	public void setColfusionSynonymsFroms(Set colfusionSynonymsFroms) {
		this.colfusionSynonymsFroms = colfusionSynonymsFroms;
	}

	public Set getColfusionExecuteinfos() {
		return this.colfusionExecuteinfos;
	}

	public void setColfusionExecuteinfos(Set colfusionExecuteinfos) {
		this.colfusionExecuteinfos = colfusionExecuteinfos;
	}

	public Set getColfusionSourceinfoUsers() {
		return this.colfusionSourceinfoUsers;
	}

	public void setColfusionSourceinfoUsers(Set colfusionSourceinfoUsers) {
		this.colfusionSourceinfoUsers = colfusionSourceinfoUsers;
	}

	public Set getColfusionTemporaries() {
		return this.colfusionTemporaries;
	}

	public void setColfusionTemporaries(Set colfusionTemporaries) {
		this.colfusionTemporaries = colfusionTemporaries;
	}

	public Set getColfusionSynonymsTos() {
		return this.colfusionSynonymsTos;
	}

	public void setColfusionSynonymsTos(Set colfusionSynonymsTos) {
		this.colfusionSynonymsTos = colfusionSynonymsTos;
	}

	public Set getColfusionSourceinfoTableKtrs() {
		return this.colfusionSourceinfoTableKtrs;
	}

	public void setColfusionSourceinfoTableKtrs(Set colfusionSourceinfoTableKtrs) {
		this.colfusionSourceinfoTableKtrs = colfusionSourceinfoTableKtrs;
	}

	public Set getColfusionRelationshipsesForSid1() {
		return this.colfusionRelationshipsesForSid1;
	}

	public void setColfusionRelationshipsesForSid1(
			Set colfusionRelationshipsesForSid1) {
		this.colfusionRelationshipsesForSid1 = colfusionRelationshipsesForSid1;
	}

	public Set getColfusionDesAttachmentses() {
		return this.colfusionDesAttachmentses;
	}

	public void setColfusionDesAttachmentses(Set colfusionDesAttachmentses) {
		this.colfusionDesAttachmentses = colfusionDesAttachmentses;
	}

	public Set getColfusionRelationshipsesForSid2() {
		return this.colfusionRelationshipsesForSid2;
	}

	public void setColfusionRelationshipsesForSid2(
			Set colfusionRelationshipsesForSid2) {
		this.colfusionRelationshipsesForSid2 = colfusionRelationshipsesForSid2;
	}

	public Set getColfusionDnameinfos() {
		return this.colfusionDnameinfos;
	}

	public void setColfusionDnameinfos(Set colfusionDnameinfos) {
		this.colfusionDnameinfos = colfusionDnameinfos;
	}

	public ColfusionSourceinfoDb getColfusionSourceinfoDb() {
		return this.colfusionSourceinfoDb;
	}

	public void setColfusionSourceinfoDb(
			ColfusionSourceinfoDb colfusionSourceinfoDb) {
		this.colfusionSourceinfoDb = colfusionSourceinfoDb;
	}

	public Set getColfusionSourceinfoMetadataEditHistories() {
		return this.colfusionSourceinfoMetadataEditHistories;
	}

	public void setColfusionSourceinfoMetadataEditHistories(
			Set colfusionSourceinfoMetadataEditHistories) {
		this.colfusionSourceinfoMetadataEditHistories = colfusionSourceinfoMetadataEditHistories;
	}

	public Set getColfusionVisualizations() {
		return this.colfusionVisualizations;
	}

	public void setColfusionVisualizations(Set colfusionVisualizations) {
		this.colfusionVisualizations = colfusionVisualizations;
	}

}
