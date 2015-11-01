package com.oxit.decathlon.showCasePolymer.services;

import java.util.List;

import com.oxit.decathlon.showCasePolymer.entity.UserEntity;
import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;

public interface UserService {
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
	 * @return the user inserted
	 * @throws ShowCasePolymerException
	 *             the ShowCasePolymerException
	 */
	UserEntity save(String name, String surname, String email, String soc, String fonction, String lieu, String prefLang)
			throws ShowCasePolymerException;

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
	List<UserEntity> get(String name, String surname) throws ShowCasePolymerException;
}
