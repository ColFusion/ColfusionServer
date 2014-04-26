package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated Apr 26, 2014 9:30:11 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ColfusionPentahoLogPerformanceId generated by hbm2java
 */
public class ColfusionPentahoLogPerformanceId implements java.io.Serializable {

	private Integer idBatch;
	private Integer seqNr;
	private Date logdate;
	private String transname;
	private String stepname;
	private Integer stepCopy;
	private Long linesRead;
	private Long linesWritten;
	private Long linesUpdated;
	private Long linesInput;
	private Long linesOutput;
	private Long linesRejected;
	private Long errors;
	private Long inputBufferRows;
	private Long outputBufferRows;

	public ColfusionPentahoLogPerformanceId() {
	}

	public ColfusionPentahoLogPerformanceId(Integer idBatch, Integer seqNr,
			Date logdate, String transname, String stepname, Integer stepCopy,
			Long linesRead, Long linesWritten, Long linesUpdated,
			Long linesInput, Long linesOutput, Long linesRejected, Long errors,
			Long inputBufferRows, Long outputBufferRows) {
		this.idBatch = idBatch;
		this.seqNr = seqNr;
		this.logdate = logdate;
		this.transname = transname;
		this.stepname = stepname;
		this.stepCopy = stepCopy;
		this.linesRead = linesRead;
		this.linesWritten = linesWritten;
		this.linesUpdated = linesUpdated;
		this.linesInput = linesInput;
		this.linesOutput = linesOutput;
		this.linesRejected = linesRejected;
		this.errors = errors;
		this.inputBufferRows = inputBufferRows;
		this.outputBufferRows = outputBufferRows;
	}

	public Integer getIdBatch() {
		return this.idBatch;
	}

	public void setIdBatch(Integer idBatch) {
		this.idBatch = idBatch;
	}

	public Integer getSeqNr() {
		return this.seqNr;
	}

	public void setSeqNr(Integer seqNr) {
		this.seqNr = seqNr;
	}

	public Date getLogdate() {
		return this.logdate;
	}

	public void setLogdate(Date logdate) {
		this.logdate = logdate;
	}

	public String getTransname() {
		return this.transname;
	}

	public void setTransname(String transname) {
		this.transname = transname;
	}

	public String getStepname() {
		return this.stepname;
	}

	public void setStepname(String stepname) {
		this.stepname = stepname;
	}

	public Integer getStepCopy() {
		return this.stepCopy;
	}

	public void setStepCopy(Integer stepCopy) {
		this.stepCopy = stepCopy;
	}

	public Long getLinesRead() {
		return this.linesRead;
	}

	public void setLinesRead(Long linesRead) {
		this.linesRead = linesRead;
	}

	public Long getLinesWritten() {
		return this.linesWritten;
	}

	public void setLinesWritten(Long linesWritten) {
		this.linesWritten = linesWritten;
	}

	public Long getLinesUpdated() {
		return this.linesUpdated;
	}

	public void setLinesUpdated(Long linesUpdated) {
		this.linesUpdated = linesUpdated;
	}

	public Long getLinesInput() {
		return this.linesInput;
	}

	public void setLinesInput(Long linesInput) {
		this.linesInput = linesInput;
	}

	public Long getLinesOutput() {
		return this.linesOutput;
	}

	public void setLinesOutput(Long linesOutput) {
		this.linesOutput = linesOutput;
	}

	public Long getLinesRejected() {
		return this.linesRejected;
	}

	public void setLinesRejected(Long linesRejected) {
		this.linesRejected = linesRejected;
	}

	public Long getErrors() {
		return this.errors;
	}

	public void setErrors(Long errors) {
		this.errors = errors;
	}

	public Long getInputBufferRows() {
		return this.inputBufferRows;
	}

	public void setInputBufferRows(Long inputBufferRows) {
		this.inputBufferRows = inputBufferRows;
	}

	public Long getOutputBufferRows() {
		return this.outputBufferRows;
	}

	public void setOutputBufferRows(Long outputBufferRows) {
		this.outputBufferRows = outputBufferRows;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ColfusionPentahoLogPerformanceId))
			return false;
		ColfusionPentahoLogPerformanceId castOther = (ColfusionPentahoLogPerformanceId) other;

		return ((this.getIdBatch() == castOther.getIdBatch()) || (this
				.getIdBatch() != null && castOther.getIdBatch() != null && this
				.getIdBatch().equals(castOther.getIdBatch())))
				&& ((this.getSeqNr() == castOther.getSeqNr()) || (this
						.getSeqNr() != null && castOther.getSeqNr() != null && this
						.getSeqNr().equals(castOther.getSeqNr())))
				&& ((this.getLogdate() == castOther.getLogdate()) || (this
						.getLogdate() != null && castOther.getLogdate() != null && this
						.getLogdate().equals(castOther.getLogdate())))
				&& ((this.getTransname() == castOther.getTransname()) || (this
						.getTransname() != null
						&& castOther.getTransname() != null && this
						.getTransname().equals(castOther.getTransname())))
				&& ((this.getStepname() == castOther.getStepname()) || (this
						.getStepname() != null
						&& castOther.getStepname() != null && this
						.getStepname().equals(castOther.getStepname())))
				&& ((this.getStepCopy() == castOther.getStepCopy()) || (this
						.getStepCopy() != null
						&& castOther.getStepCopy() != null && this
						.getStepCopy().equals(castOther.getStepCopy())))
				&& ((this.getLinesRead() == castOther.getLinesRead()) || (this
						.getLinesRead() != null
						&& castOther.getLinesRead() != null && this
						.getLinesRead().equals(castOther.getLinesRead())))
				&& ((this.getLinesWritten() == castOther.getLinesWritten()) || (this
						.getLinesWritten() != null
						&& castOther.getLinesWritten() != null && this
						.getLinesWritten().equals(castOther.getLinesWritten())))
				&& ((this.getLinesUpdated() == castOther.getLinesUpdated()) || (this
						.getLinesUpdated() != null
						&& castOther.getLinesUpdated() != null && this
						.getLinesUpdated().equals(castOther.getLinesUpdated())))
				&& ((this.getLinesInput() == castOther.getLinesInput()) || (this
						.getLinesInput() != null
						&& castOther.getLinesInput() != null && this
						.getLinesInput().equals(castOther.getLinesInput())))
				&& ((this.getLinesOutput() == castOther.getLinesOutput()) || (this
						.getLinesOutput() != null
						&& castOther.getLinesOutput() != null && this
						.getLinesOutput().equals(castOther.getLinesOutput())))
				&& ((this.getLinesRejected() == castOther.getLinesRejected()) || (this
						.getLinesRejected() != null
						&& castOther.getLinesRejected() != null && this
						.getLinesRejected()
						.equals(castOther.getLinesRejected())))
				&& ((this.getErrors() == castOther.getErrors()) || (this
						.getErrors() != null && castOther.getErrors() != null && this
						.getErrors().equals(castOther.getErrors())))
				&& ((this.getInputBufferRows() == castOther
						.getInputBufferRows()) || (this.getInputBufferRows() != null
						&& castOther.getInputBufferRows() != null && this
						.getInputBufferRows().equals(
								castOther.getInputBufferRows())))
				&& ((this.getOutputBufferRows() == castOther
						.getOutputBufferRows()) || (this.getOutputBufferRows() != null
						&& castOther.getOutputBufferRows() != null && this
						.getOutputBufferRows().equals(
								castOther.getOutputBufferRows())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdBatch() == null ? 0 : this.getIdBatch().hashCode());
		result = 37 * result
				+ (getSeqNr() == null ? 0 : this.getSeqNr().hashCode());
		result = 37 * result
				+ (getLogdate() == null ? 0 : this.getLogdate().hashCode());
		result = 37 * result
				+ (getTransname() == null ? 0 : this.getTransname().hashCode());
		result = 37 * result
				+ (getStepname() == null ? 0 : this.getStepname().hashCode());
		result = 37 * result
				+ (getStepCopy() == null ? 0 : this.getStepCopy().hashCode());
		result = 37 * result
				+ (getLinesRead() == null ? 0 : this.getLinesRead().hashCode());
		result = 37
				* result
				+ (getLinesWritten() == null ? 0 : this.getLinesWritten()
						.hashCode());
		result = 37
				* result
				+ (getLinesUpdated() == null ? 0 : this.getLinesUpdated()
						.hashCode());
		result = 37
				* result
				+ (getLinesInput() == null ? 0 : this.getLinesInput()
						.hashCode());
		result = 37
				* result
				+ (getLinesOutput() == null ? 0 : this.getLinesOutput()
						.hashCode());
		result = 37
				* result
				+ (getLinesRejected() == null ? 0 : this.getLinesRejected()
						.hashCode());
		result = 37 * result
				+ (getErrors() == null ? 0 : this.getErrors().hashCode());
		result = 37
				* result
				+ (getInputBufferRows() == null ? 0 : this.getInputBufferRows()
						.hashCode());
		result = 37
				* result
				+ (getOutputBufferRows() == null ? 0 : this
						.getOutputBufferRows().hashCode());
		return result;
	}

}
