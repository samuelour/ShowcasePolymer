package com.oxit.decathlon.showCasePolymer.services;

import java.util.List;

import com.oxit.decathlon.showCasePolymer.entity.LanguageEntity;
import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;

public interface LanguageService {
	/**
	 * Get a list of Languages.
	 * 
	 * @return list of languages
	 * @throws ShowCasePolymerException
	 *             the ShowCasePolymerException
	 */
	List<LanguageEntity> get() throws ShowCasePolymerException;
}
