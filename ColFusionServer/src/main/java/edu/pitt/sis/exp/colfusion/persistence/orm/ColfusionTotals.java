package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated 2014-6-10 16:17:59 by Hibernate Tools 3.4.0.CR1

/**
 * ColfusionTotals generated by hbm2java
 */
public class ColfusionTotals implements java.io.Serializable {

	private String name;
	private int total;

	public ColfusionTotals() {
	}

	public ColfusionTotals(String name, int total) {
		this.name = name;
		this.total = total;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}