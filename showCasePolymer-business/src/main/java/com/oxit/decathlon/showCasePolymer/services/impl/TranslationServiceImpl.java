package com.oxit.decathlon.showCasePolymer.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oxit.decathlon.showCasePolymer.dao.TranslationDao;
import com.oxit.decathlon.showCasePolymer.entity.TranslationEntity;
import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;
import com.oxit.decathlon.showCasePolymer.services.TranslationService;

@Service
@Transactional(value = "showCasePolymerTransactionManager")
public class TranslationServiceImpl implements TranslationService {

	@Autowired
	private TranslationDao dao;

	@Override
	public String get(String context, String labelCode, String language) throws ShowCasePolymerException {
		TranslationEntity entity = dao.get(context, labelCode, language);
		if (entity != null && entity.getValue() != null) {
			return entity.getValue();
		}
		return "?" + context + "." + labelCode + "?";
	}
}
