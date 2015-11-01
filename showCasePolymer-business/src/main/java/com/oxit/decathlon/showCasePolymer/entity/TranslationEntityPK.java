package com.oxit.decathlon.showCasePolymer.entity;

import java.io.Serializable;

public class TranslationEntityPK implements Serializable {
	private String context;
	private String labelCode;
	private String language;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((context == null) ? 0 : context.hashCode());
		result = prime * result + ((labelCode == null) ? 0 : labelCode.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TranslationEntityPK other = (TranslationEntityPK) obj;
		if (context == null) {
			if (other.context != null)
				return false;
		} else if (!context.equals(other.context))
			return false;
		if (labelCode == null) {
			if (other.labelCode != null)
				return false;
		} else if (!labelCode.equals(other.labelCode))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		return true;
	}
}
