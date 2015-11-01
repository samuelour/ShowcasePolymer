package com.oxit.decathlon.showCasePolymer.dto;

public class User {

	public User() {
	}

	private String name;
	private String surname;
	private String email;
	private String soc;
	private String fonction;
	private String lieu;
	private String prefLang;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoc() {
		return soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getPrefLang() {
		return prefLang;
	}

	public void setPrefLang(String prefLang) {
		this.prefLang = prefLang;
	}

}
