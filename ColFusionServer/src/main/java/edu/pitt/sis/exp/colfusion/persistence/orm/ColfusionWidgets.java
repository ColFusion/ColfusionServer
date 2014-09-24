package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionWidgets generated by hbm2java
 */
public class ColfusionWidgets implements java.io.Serializable {

	private Integer id;
	private float version;
	private String name;
	private float latestVersion;
	private String folder;
	private boolean enabled;
	private String column;
	private int position;
	private String display;

	public ColfusionWidgets() {
	}

	public ColfusionWidgets(float latestVersion, boolean enabled,
			String column, int position, String display) {
		this.latestVersion = latestVersion;
		this.enabled = enabled;
		this.column = column;
		this.position = position;
		this.display = display;
	}

	public ColfusionWidgets(String name, float latestVersion, String folder,
			boolean enabled, String column, int position, String display) {
		this.name = name;
		this.latestVersion = latestVersion;
		this.folder = folder;
		this.enabled = enabled;
		this.column = column;
		this.position = position;
		this.display = display;
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

	public String getColumn() {
		return this.column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getDisplay() {
		return this.display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

}
