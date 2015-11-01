package com.oxit.decathlon.showCasePolymer.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.oxit.decathlon.showCasePolymer.dao.LanguageDao;
import com.oxit.decathlon.showCasePolymer.entity.LanguageEntity;

@Repository
public class LanguageDaoImpl implements LanguageDao {

	@PersistenceContext(unitName = "showCasePolymerPU")
	private EntityManager entityManager;

	@Override
	public List<LanguageEntity> get() {
		StringBuilder sb = new StringBuilder();
		sb.append("From Language");
		sb.append(" Order by code");

		TypedQuery<LanguageEntity> query = entityManager.createQuery(sb.toString(), LanguageEntity.class);

		return query.getResultList();
	}
}
