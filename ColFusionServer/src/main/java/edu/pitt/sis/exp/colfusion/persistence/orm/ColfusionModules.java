package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionModules generated by hbm2java
 */
public class ColfusionModules implements java.io.Serializable {

	private Integer id;
	private float version;
	private String name;
	private float latestVersion;
	private String folder;
	private boolean enabled;

	public ColfusionModules() {
	}

	public ColfusionModules(float latestVersion, boolean enabled) {
		this.latestVersion = latestVersion;
		this.enabled = enabled;
	}

	public ColfusionModules(String name, float latestVersion, String folder,
			boolean enabled) {
		this.name = name;
		this.latestVersion = latestVersion;
		this.folder = folder;
		this.enabled = enabled;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getVersion() {
		return this.version;
	}

	public void setVersion(float version) {
		this.version = version;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLatestVersion() {
		return this.latestVersion;
	}

	public void setLatestVersion(float latestVersion) {
		this.latestVersion = latestVersion;
	}

	public String getFolder() {
		return this.folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
