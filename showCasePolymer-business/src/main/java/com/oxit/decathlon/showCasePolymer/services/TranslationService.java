package com.oxit.decathlon.showCasePolymer.services;

import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;

public interface TranslationService {
	/**
	 * Get translation.
	 * 
	 * @return the translation
	 * @throws ShowCasePolymerException
	 *             the ShowCasePolymerException
	 */
	String get(String context, String labelCode, String language) throws ShowCasePolymerException;
}
