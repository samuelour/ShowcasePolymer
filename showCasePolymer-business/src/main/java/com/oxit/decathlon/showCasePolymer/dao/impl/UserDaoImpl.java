package com.oxit.decathlon.showCasePolymer.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.oxit.decathlon.showCasePolymer.dao.UserDao;
import com.oxit.decathlon.showCasePolymer.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext(unitName = "showCasePolymerPU")
	private EntityManager entityManager;

	@Override
	public List<UserEntity> get(String name, String surname) {
		StringBuilder sb = new StringBuilder();
		sb.append("From User");
		sb.append(" Where  1 = 1");
		if (!StringUtils.isEmpty(name)) {
			sb.append(" And name like :name");
		}

		if (!StringUtils.isEmpty(surname)) {
			sb.append(" And surname like :surname");
		}

		TypedQuery<UserEntity> query = entityManager.createQuery(sb.toString(), UserEntity.class);
		if (!StringUtils.isEmpty(name)) {
			query.setParameter("name", "%" + name + "%");
		}
		if (!StringUtils.isEmpty(surname)) {
			query.setParameter("surname", "%" + surname + "%");
		}

		return query.getResultList();
	}

	@Override
	public void insert(UserEntity entity) {
		entityManager.persist(entity);
	}
}
