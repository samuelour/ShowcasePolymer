package com.oxit.decathlon.showCasePolymer.dao;

import java.util.List;

import com.oxit.decathlon.showCasePolymer.entity.LanguageEntity;

public interface LanguageDao {
	/**
	 * Get language.
	 * 
	 * @return list of language
	 */
	List<LanguageEntity> get();
}
