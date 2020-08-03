package com.upskilling.bean;

import java.util.List;

public class Client {
	private Boolean caseSelection;
	private Boolean patientSelection;
	private List<String> products;
	private String url;

	public Boolean getCaseSelection() {
		return caseSelection;
	}

	public void setCaseSelection(Boolean caseSelection) {
		this.caseSelection = caseSelection;
	}

	public Boolean getPatientSelection() {
		return patientSelection;
	}

	public void setPatientSelection(Boolean patientSelection) {
		this.patientSelection = patientSelection;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Client [caseSelection=" + caseSelection + ", patientSelection=" + patientSelection + ", products="
				+ products + ", url=" + url + "]";
	}

}