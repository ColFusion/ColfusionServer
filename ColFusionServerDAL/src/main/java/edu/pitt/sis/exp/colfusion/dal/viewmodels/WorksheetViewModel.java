/**
 * 
 */
package edu.pitt.sis.exp.colfusion.dal.viewmodels;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Evgeny
 *
 */
@XmlRootElement
public class WorksheetViewModel {
	private String sheetName;
	private int headerRow;
	private String startColumn;
	private int numberOfRows;
	private int indexInTheFile;
	private ArrayList<DatasetVariableViewModel> variables;
	
	public WorksheetViewModel() {
		variables = new ArrayList<>();
	}
	
	public WorksheetViewModel(final String sheetName, final int headerRow, final String startColumn, final int numberOfRows, final int indexInTheFile, final ArrayList<DatasetVariableViewModel> variables) {
		setSheetName(sheetName);
		setHeaderRow(headerRow);
		setStartColumn(startColumn);
		setNumberOfRows(numberOfRows);
		setIndexInTheFile(indexInTheFile);
		setVariables(variables);
	}

	/**
	 * @return the sheetName
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * @param sheetName the sheetName to set
	 */
	public void setSheetName(final String sheetName) {
		this.sheetName = sheetName;
	}

	/**
	 * One based row index.
	 * 
	 * @return the headerRow
	 */
	public int getHeaderRow() {
		return headerRow;
	}

	/**
	 * @param headerRow the headerRow to set
	 */
	public void setHeaderRow(final int headerRow) {
		this.headerRow = headerRow;
	}

	/**
	 * @return the startColumn
	 */
	public String getStartColumn() {
		return startColumn;
	}

	/**
	 * @param startColumn the startColumn to set
	 */
	public void setStartColumn(final String startColumn) {
		this.startColumn = startColumn;
	}

	/**
	 * @return the numberOfRows
	 */
	public int getNumberOfRows() {
		return numberOfRows;
	}

	/**
	 * @param numberOfRows the numberOfRows to set
	 */
	public void setNumberOfRows(final int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	/**
	 * @return the indexInTheFile
	 */
	public int getIndexInTheFile() {
		return indexInTheFile;
	}

	/**
	 * @param indexInTheFile the indexInTheFile to set
	 */
	public void setIndexInTheFile(final int indexInTheFile) {
		this.indexInTheFile = indexInTheFile;
	}

	/**
	 * @return the variables
	 */
	public ArrayList<DatasetVariableViewModel> getVariables() {
		return variables;
	}

	/**
	 * @param variables the variables to set
	 */
	public void setVariables(final ArrayList<DatasetVariableViewModel> variables) {
		this.variables = variables;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
