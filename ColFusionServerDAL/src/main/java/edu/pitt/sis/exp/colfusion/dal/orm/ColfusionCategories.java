package edu.pitt.sis.exp.colfusion.dal.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionCategories generated by hbm2java
 */
public class ColfusionCategories implements java.io.Serializable {

	private Integer categoryAutoId;
	private String categoryLang;
	private int categoryId;
	private int categoryParent;
	private String categoryName;
	private String categorySafeName;
	private int rgt;
	private int lft;
	private int categoryEnabled;
	private int categoryOrder;
	private String categoryDesc;
	private String categoryKeywords;
	private String categoryAuthorLevel;
	private String categoryAuthorGroup;
	private String categoryVotes;
	private String categoryKarma;

	public ColfusionCategories() {
	}

	public ColfusionCategories(int categoryId, int categoryParent, int rgt,
			int lft, int categoryEnabled, int categoryOrder,
			String categoryAuthorLevel, String categoryVotes,
			String categoryKarma) {
		this.categoryId = categoryId;
		this.categoryParent = categoryParent;
		this.rgt = rgt;
		this.lft = lft;
		this.categoryEnabled = categoryEnabled;
		this.categoryOrder = categoryOrder;
		this.categoryAuthorLevel = categoryAuthorLevel;
		this.categoryVotes = categoryVotes;
		this.categoryKarma = categoryKarma;
	}

	public ColfusionCategories(String categoryLang, int categoryId,
			int categoryParent, String categoryName, String categorySafeName,
			int rgt, int lft, int categoryEnabled, int categoryOrder,
			String categoryDesc, String categoryKeywords,
			String categoryAuthorLevel, String categoryAuthorGroup,
			String categoryVotes, String categoryKarma) {
		this.categoryLang = categoryLang;
		this.categoryId = categoryId;
		this.categoryParent = categoryParent;
		this.categoryName = categoryName;
		this.categorySafeName = categorySafeName;
		this.rgt = rgt;
		this.lft = lft;
		this.categoryEnabled = categoryEnabled;
		this.categoryOrder = categoryOrder;
		this.categoryDesc = categoryDesc;
		this.categoryKeywords = categoryKeywords;
		this.categoryAuthorLevel = categoryAuthorLevel;
		this.categoryAuthorGroup = categoryAuthorGroup;
		this.categoryVotes = categoryVotes;
		this.categoryKarma = categoryKarma;
	}

	public Integer getCategoryAutoId() {
		return this.categoryAutoId;
	}

	public void setCategoryAutoId(Integer categoryAutoId) {
		this.categoryAutoId = categoryAutoId;
	}

	public String getCategoryLang() {
		return this.categoryLang;
	}

	public void setCategoryLang(String categoryLang) {
		this.categoryLang = categoryLang;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getCategoryParent() {
		return this.categoryParent;
	}

	public void setCategoryParent(int categoryParent) {
		this.categoryParent = categoryParent;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategorySafeName() {
		return this.categorySafeName;
	}

	public void setCategorySafeName(String categorySafeName) {
		this.categorySafeName = categorySafeName;
	}

	public int getRgt() {
		return this.rgt;
	}

	public void setRgt(int rgt) {
		this.rgt = rgt;
	}

	public int getLft() {
		return this.lft;
	}

	public void setLft(int lft) {
		this.lft = lft;
	}

	public int getCategoryEnabled() {
		return this.categoryEnabled;
	}

	public void setCategoryEnabled(int categoryEnabled) {
		this.categoryEnabled = categoryEnabled;
	}

	public int getCategoryOrder() {
		return this.categoryOrder;
	}

	public void setCategoryOrder(int categoryOrder) {
		this.categoryOrder = categoryOrder;
	}

	public String getCategoryDesc() {
		return this.categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCategoryKeywords() {
		return this.categoryKeywords;
	}

	public void setCategoryKeywords(String categoryKeywords) {
		this.categoryKeywords = categoryKeywords;
	}

	public String getCategoryAuthorLevel() {
		return this.categoryAuthorLevel;
	}

	public void setCategoryAuthorLevel(String categoryAuthorLevel) {
		this.categoryAuthorLevel = categoryAuthorLevel;
	}

	public String getCategoryAuthorGroup() {
		return this.categoryAuthorGroup;
	}

	public void setCategoryAuthorGroup(String categoryAuthorGroup) {
		this.categoryAuthorGroup = categoryAuthorGroup;
	}

	public String getCategoryVotes() {
		return this.categoryVotes;
	}

	public void setCategoryVotes(String categoryVotes) {
		this.categoryVotes = categoryVotes;
	}

	public String getCategoryKarma() {
		return this.categoryKarma;
	}

	public void setCategoryKarma(String categoryKarma) {
		this.categoryKarma = categoryKarma;
	}

}
