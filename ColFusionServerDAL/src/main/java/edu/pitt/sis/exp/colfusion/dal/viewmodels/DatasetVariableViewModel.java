/**
 * 
 */
package edu.pitt.sis.exp.colfusion.dal.viewmodels;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Evgeny
 *
 */
@XmlRootElement
public class DatasetVariableViewModel {
	private int cid;
	private String originalName;
	private String chosenName;
	private String description;
	private String variableMeasuringUnit;
	private String variableValueType;
	private String variableValueFormat;
	private String missingValue;
	private boolean checked;
	
	public DatasetVariableViewModel() {
		cid = 0;
	}
	
	public DatasetVariableViewModel(final int cid, final String originalName, final String chosenName, final String description, final String variableMeasuringUnit, final String variableValueType, final String variableValueFormat,
			final String missingValue, final boolean checked) {
		setCid(cid);
		setChosenName(chosenName);
		setDescription(description);
		setVariableValueFormat(variableValueFormat);
		setOriginalName(originalName);
		setVariableMeasuringUnit(variableMeasuringUnit);
		setVariableValueType(variableValueType);
		setMissingValue(missingValue);
		setChecked(checked);
	}

	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(final int cid) {
		this.cid = cid;
	}

	/**
	 * @return the originalName
	 */
	public String getOriginalName() {
		return originalName;
	}

	/**
	 * @param originalName the originalName to set
	 */
	public void setOriginalName(final String originalName) {
		this.originalName = originalName;
	}

	/**
	 * @return the chosenName
	 */
	public String getChosenName() {
		return chosenName;
	}

	/**
	 * @param chosenName the chosenName to set
	 */
	public void setChosenName(final String chosenName) {
		this.chosenName = chosenName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return the unit
	 */
	public String getVariableMeasuringUnit() {
		return variableMeasuringUnit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setVariableMeasuringUnit(final String variableMeasuringUnit) {
		this.variableMeasuringUnit = variableMeasuringUnit;
	}

	/**
	 * @return the valueType
	 */
	public String getVariableValueType() {
		return variableValueType;
	}

	/**
	 * @param valueType the valueType to set
	 */
	public void setVariableValueType(final String valueType) {
		this.variableValueType = valueType;
	}

	/**
	 * @return the format
	 */
	public String getVariableValueFormat() {
		return variableValueFormat;
	}

	/**
	 * @param format the format to set
	 */
	public void setVariableValueFormat(final String valueFormat) {
		this.variableValueFormat = valueFormat;
	}

	/**
	 * @return the checked
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * @param checked the checked to set
	 */
	public void setChecked(final boolean checked) {
		this.checked = checked;
	}

	/**
	 * @return the missingValue
	 */
	public String getMissingValue() {
		return missingValue;
	}

	/**
	 * @param missingValue the missingValue to set
	 */
	public void setMissingValue(final String missingValue) {
		this.missingValue = missingValue;
	}
}
