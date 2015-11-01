package com.oxit.decathlon.showCasePolymer.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oxit.decathlon.showCasePolymer.dao.LanguageDao;
import com.oxit.decathlon.showCasePolymer.entity.LanguageEntity;
import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;
import com.oxit.decathlon.showCasePolymer.services.LanguageService;

@Service
@Transactional(value = "showCasePolymerTransactionManager")
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	private LanguageDao dao;

	@Override
	public List<LanguageEntity> get() throws ShowCasePolymerException {
		List<LanguageEntity> entity = dao.get();
		return entity;
	}
}
