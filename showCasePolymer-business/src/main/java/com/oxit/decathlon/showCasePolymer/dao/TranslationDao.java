package com.oxit.decathlon.showCasePolymer.dao;

import com.oxit.decathlon.showCasePolymer.entity.TranslationEntity;

public interface TranslationDao {
	/**
	 * Get a translation.
	 * 
	 * @return the translation
	 */
	public TranslationEntity get(String context, String labelCode, String language);
}
