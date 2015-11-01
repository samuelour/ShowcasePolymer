package com.oxit.decathlon.showCasePolymer.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.oxit.decathlon.showCasePolymer.dto.User;
import com.oxit.decathlon.showCasePolymer.entity.UserEntity;
import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;
import com.oxit.decathlon.showCasePolymer.services.UserService;

@Component
@Transactional(value = "showCasePolymerTransactionManager")
public class UserFacade extends AFacade<UserEntity, User> {

	@Autowired
	private UserService service;

	@Override
	public User entityToDto(UserEntity entity) {
		User dto = new User();
		if (entity != null) {
			dto.setName(entity.getName());
			dto.setSurname(entity.getSurname());
			dto.setEmail(entity.getEmail());
			dto.setSoc(entity.getSoc());
			dto.setFonction(entity.getFonction());
			dto.setLieu(entity.getLieu());
			dto.setPrefLang(entity.getPrefLang());
		}
		return dto;
	}

	@Override
	public UserEntity dtoToEntity(User dto) {
		UserEntity entity = new UserEntity();
		if (dto != null) {
			entity.setName(dto.getName());
			entity.setSurname(dto.getSurname());
			entity.setEmail(dto.getEmail());
			entity.setSoc(dto.getSoc());
			entity.setFonction(dto.getFonction());
			entity.setLieu(dto.getLieu());
			entity.setPrefLang(dto.getPrefLang());
		}
		return entity;
	}

	/**
	 * Get a list of users.
	 * 
	 * @param name
	 *            the name
	 * @param surname
	 *            the surname
	 * @return list of users
	 * @throws ShowCasePolymerException
	 *             the ShowCasePolymerException
	 */
	public List<User> get(String name, String surname) throws ShowCasePolymerException {
		return entityListToDtoList(service.get(name, surname));
	}

	/**
	 * Save a new user.
	 * 
	 * @param name
	 *            the name
	 * @param surname
	 *            the surname
	 * @param email
	 *            the email
	 * @param soc
	 *            the society
	 * @param fonction
	 *            the fonction
	 * @param lieu
	 *            the location
	 * @param prefLang
	 *            the language
	 * @return user saved
	 * @throws ShowCasePolymerException
	 *             the ShowCasePolymerException
	 */
	public User save(String name, String surname, String email, String soc, String fonction, String lieu, String prefLang)
			throws ShowCasePolymerException {
		return entityToDto(service.save(name, surname, email, soc, fonction, lieu, prefLang));
	}
}
