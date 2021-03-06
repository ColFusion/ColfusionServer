package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * ColfusionRelationshipsColumnsDataMathingRatiosId generated by hbm2java
 */
public class ColfusionRelationshipsColumnsDataMathingRatiosId implements
		java.io.Serializable {

	private String clFrom;
	private String clTo;
	private BigDecimal similarityThreshold;

	public ColfusionRelationshipsColumnsDataMathingRatiosId() {
	}

	public ColfusionRelationshipsColumnsDataMathingRatiosId(String clFrom,
			String clTo, BigDecimal similarityThreshold) {
		this.clFrom = clFrom;
		this.clTo = clTo;
		this.similarityThreshold = similarityThreshold;
	}

	public String getClFrom() {
		return this.clFrom;
	}

	public void setClFrom(String clFrom) {
		this.clFrom = clFrom;
	}

	public String getClTo() {
		return this.clTo;
	}

	public void setClTo(String clTo) {
		this.clTo = clTo;
	}

	public BigDecimal getSimilarityThreshold() {
		return this.similarityThreshold;
	}

	public void setSimilarityThreshold(BigDecimal similarityThreshold) {
		this.similarityThreshold = similarityThreshold;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ColfusionRelationshipsColumnsDataMathingRatiosId))
			return false;
		ColfusionRelationshipsColumnsDataMathingRatiosId castOther = (ColfusionRelationshipsColumnsDataMathingRatiosId) other;

		return ((this.getClFrom() == castOther.getClFrom()) || (this
				.getClFrom() != null && castOther.getClFrom() != null && this
				.getClFrom().equals(castOther.getClFrom())))
				&& ((this.getClTo() == castOther.getClTo()) || (this.getClTo() != null
						&& castOther.getClTo() != null && this.getClTo()
						.equals(castOther.getClTo())))
				&& ((this.getSimilarityThreshold() == castOther
						.getSimilarityThreshold()) || (this
						.getSimilarityThreshold() != null
						&& castOther.getSimilarityThreshold() != null && this
						.getSimilarityThreshold().equals(
								castOther.getSimilarityThreshold())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getClFrom() == null ? 0 : this.getClFrom().hashCode());
		result = 37 * result
				+ (getClTo() == null ? 0 : this.getClTo().hashCode());
		result = 37
				* result
				+ (getSimilarityThreshold() == null ? 0 : this
						.getSimilarityThreshold().hashCode());
		return result;
	}

}
