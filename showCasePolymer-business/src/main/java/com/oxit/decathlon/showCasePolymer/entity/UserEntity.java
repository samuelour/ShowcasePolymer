package com.oxit.decathlon.showCasePolymer.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name = "USER")
@IdClass(UserEntityPK.class)
public class UserEntity {

	@Id
	@Basic
	@Column(name = "NAME")
	private String name;

	@Id
	@Basic
	@Column(name = "SURNAME")
	private String surname;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "SOC")
	private String soc;

	@Column(name = "FONCTION")
	private String fonction;

	@Column(name = "LIEU")
	private String lieu;

	@Column(name = "PREF_LANG")
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
