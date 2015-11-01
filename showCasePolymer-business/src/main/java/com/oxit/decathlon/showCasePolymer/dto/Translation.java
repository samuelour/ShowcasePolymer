package com.oxit.decathlon.showCasePolymer.dto;


public class Translation {

	private String context;
	private String labelCode;
	private String language;
	private String value;

	/**
	 * @return the context
	 */
	public String getContext() {
		return context;
	}

	/**
	 * @param context
	 *            the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}

	/**
	 * @return the labelCode
	 */
	public String getLabelCode() {
		return labelCode;
	}

	/**
	 * @param labelCode
	 *            the labelCode to set
	 */
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
