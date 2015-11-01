package com.oxit.decathlon.showCasePolymer.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name = "LANGUAGE")
@IdClass(LanguageEntityPK.class)
public class LanguageEntity {

	@Id
	@Basic
	@Column(name = "CODE")
	private String code;

	@Column(name = "LIBELLE")
	private String libelle;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
