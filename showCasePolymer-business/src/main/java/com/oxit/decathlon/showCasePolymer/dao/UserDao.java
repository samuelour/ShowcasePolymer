package com.oxit.decathlon.showCasePolymer.dao;

import java.util.List;

import com.oxit.decathlon.showCasePolymer.entity.UserEntity;

public interface UserDao {
	/**
	 * Get a list of users.
	 * 
	 * @param name
	 *            the name
	 * @param surname
	 *            the surname
	 * @return list of users
	 */
	List<UserEntity> get(String name, String surname);

	/**
	 * Insert the user.
	 * 
	 * @param entity
	 *            the user
	 */
	void insert(UserEntity entity);
}
