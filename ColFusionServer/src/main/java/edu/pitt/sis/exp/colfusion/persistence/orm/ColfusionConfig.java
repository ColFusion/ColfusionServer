package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionConfig generated by hbm2java
 */
public class ColfusionConfig implements java.io.Serializable {

	private Integer varId;
	private String varPage;
	private String varName;
	private String varValue;
	private String varDefaultvalue;
	private String varOptiontext;
	private String varTitle;
	private String varDesc;
	private String varMethod;
	private String varEnclosein;

	public ColfusionConfig() {
	}

	public ColfusionConfig(String varPage, String varName, String varValue,
			String varDefaultvalue, String varOptiontext, String varTitle,
			String varDesc, String varMethod, String varEnclosein) {
		this.varPage = varPage;
		this.varName = varName;
		this.varValue = varValue;
		this.varDefaultvalue = varDefaultvalue;
		this.varOptiontext = varOptiontext;
		this.varTitle = varTitle;
		this.varDesc = varDesc;
		this.varMethod = varMethod;
		this.varEnclosein = varEnclosein;
	}

	public Integer getVarId() {
		return this.varId;
	}

	public void setVarId(Integer varId) {
		this.varId = varId;
	}

	public String getVarPage() {
		return this.varPage;
	}

	public void setVarPage(String varPage) {
		this.varPage = varPage;
	}

	public String getVarName() {
		return this.varName;
	}

	public void setVarName(String varName) {
		this.varName = varName;
	}

	public String getVarValue() {
		return this.varValue;
	}

	public void setVarValue(String varValue) {
		this.varValue = varValue;
	}

	public String getVarDefaultvalue() {
		return this.varDefaultvalue;
	}

	public void setVarDefaultvalue(String varDefaultvalue) {
		this.varDefaultvalue = varDefaultvalue;
	}

	public String getVarOptiontext() {
		return this.varOptiontext;
	}

	public void setVarOptiontext(String varOptiontext) {
		this.varOptiontext = varOptiontext;
	}

	public String getVarTitle() {
		return this.varTitle;
	}

	public void setVarTitle(String varTitle) {
		this.varTitle = varTitle;
	}

	public String getVarDesc() {
		return this.varDesc;
	}

	public void setVarDesc(String varDesc) {
		this.varDesc = varDesc;
	}

	public String getVarMethod() {
		return this.varMethod;
	}

	public void setVarMethod(String varMethod) {
		this.varMethod = varMethod;
	}

	public String getVarEnclosein() {
		return this.varEnclosein;
	}

	public void setVarEnclosein(String varEnclosein) {
		this.varEnclosein = varEnclosein;
	}

}
