package com.oxit.decathlon.showCasePolymer.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.oxit.decathlon.showCasePolymer.dao.UserDao;
import com.oxit.decathlon.showCasePolymer.entity.UserEntity;
import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;
import com.oxit.decathlon.showCasePolymer.services.UserService;

@Service
@Transactional(value = "showCasePolymerTransactionManager")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public UserEntity save(String name, String surname, String email, String soc, String fonction, String lieu, String prefLang)
			throws ShowCasePolymerException {
		checkParamsSave(name, surname, prefLang);
		UserEntity entity = create(name, surname, email, soc, fonction, lieu, prefLang);
		dao.insert(entity);
		return entity;
	}

	private void checkParamsSave(String name, String surname, String prefLang) throws ShowCasePolymerException {
		if (StringUtils.isEmpty(name) || !name.matches("^[a-zA-Z'àâéèêïôùûçÀÂÉÈÏÔÙÛÇ]+$")) {
			throw new ShowCasePolymerException("Bad format of name");
		}
		if (StringUtils.isEmpty(surname) || !surname.matches("^[a-zA-Z'àâéèêïôùûçÀÂÉÈÏÔÙÛÇ]+$")) {
			throw new ShowCasePolymerException("Bad format of surname");
		}
		if (StringUtils.isEmpty(prefLang) || !prefLang.matches("^[A-Z]{2}$")) {
			throw new ShowCasePolymerException("Bad format of language code");
		}
	}

	private UserEntity create(String name, String surname, String email, String soc, String fonction, String lieu, String prefLang) {
		UserEntity entity = new UserEntity();
		entity.setName(name);
		entity.setSurname(surname);
		entity.setEmail(email);
		entity.setSoc(soc);
		entity.setFonction(fonction);
		entity.setLieu(lieu);
		entity.setPrefLang(prefLang);
		return entity;
	}

	@Override
	public List<UserEntity> get(String name, String surname) throws ShowCasePolymerException {
		checkParamsGet(name, surname);
		List<UserEntity> entity = dao.get(name, surname);
		return entity;
	}

	private void checkParamsGet(String name, String surname) throws ShowCasePolymerException {
		if (!StringUtils.isEmpty(name) && !name.matches("^[a-zA-Z%_]+$")) {
			throw new ShowCasePolymerException("Bad format of name");
		}
		if (!StringUtils.isEmpty(surname) && !surname.matches("^[a-zA-Z%_]+$")) {
			throw new ShowCasePolymerException("Bad format of surname");
		}
	}
}
