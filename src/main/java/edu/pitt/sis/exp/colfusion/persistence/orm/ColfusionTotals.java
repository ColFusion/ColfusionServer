package edu.pitt.sis.exp.colfusion.persistence.orm;

// Generated Feb 20, 2014 5:07:35 PM by Hibernate Tools 3.4.0.CR1

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
