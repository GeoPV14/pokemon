package com.pokemon.bean;

public class MOBean {
	
	private String idMO;
	private String MO;
	
	public MOBean() {
	}

	public MOBean(String idMO, String mO) {
		this.idMO = idMO;
		MO = mO;
	}

	public String getIdMO() {
		return idMO;
	}

	public void setIdMO(String idMO) {
		this.idMO = idMO;
	}

	public String getMO() {
		return MO;
	}

	public void setMO(String mO) {
		MO = mO;
	}
	


}
