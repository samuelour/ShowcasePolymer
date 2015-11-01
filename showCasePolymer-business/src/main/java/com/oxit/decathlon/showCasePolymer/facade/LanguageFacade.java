package com.oxit.decathlon.showCasePolymer.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.oxit.decathlon.showCasePolymer.dto.Language;
import com.oxit.decathlon.showCasePolymer.entity.LanguageEntity;
import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;
import com.oxit.decathlon.showCasePolymer.services.LanguageService;

@Component
@Transactional(value = "showCasePolymerTransactionManager")
public class LanguageFacade extends AFacade<LanguageEntity, Language> {

	@Autowired
	private LanguageService service;

	@Override
	public Language entityToDto(LanguageEntity entity) {
		Language dto = new Language();
		if (entity != null) {
			dto.setCode(entity.getCode());
			dto.setLibelle(entity.getLibelle());
		}
		return dto;
	}

	@Override
	public LanguageEntity dtoToEntity(Language dto) {
		LanguageEntity entity = new LanguageEntity();
		if (dto != null) {
			entity.setCode(dto.getCode());
			entity.setLibelle(dto.getLibelle());
		}
		return entity;
	}

	/**
	 * Get a list of languages.
	 * 
	 * @return list of languages
	 * @throws ShowCasePolymerException
	 *             the ShowCasePolymerException
	 */
	public List<Language> get() throws ShowCasePolymerException {
		return entityListToDtoList(service.get());
	}
}
