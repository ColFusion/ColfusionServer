package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated Apr 26, 2014 9:30:11 AM by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionTagCacheId generated by hbm2java
 */
public class ColfusionTagCacheId implements java.io.Serializable {

	private String tagWords;
	private int count;

	public ColfusionTagCacheId() {
	}

	public ColfusionTagCacheId(int count) {
		this.count = count;
	}

	public ColfusionTagCacheId(String tagWords, int count) {
		this.tagWords = tagWords;
		this.count = count;
	}

	public String getTagWords() {
		return this.tagWords;
	}

	public void setTagWords(String tagWords) {
		this.tagWords = tagWords;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ColfusionTagCacheId))
			return false;
		ColfusionTagCacheId castOther = (ColfusionTagCacheId) other;

		return ((this.getTagWords() == castOther.getTagWords()) || (this
				.getTagWords() != null && castOther.getTagWords() != null && this
				.getTagWords().equals(castOther.getTagWords())))
				&& (this.getCount() == castOther.getCount());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTagWords() == null ? 0 : this.getTagWords().hashCode());
		result = 37 * result + this.getCount();
		return result;
	}

}
