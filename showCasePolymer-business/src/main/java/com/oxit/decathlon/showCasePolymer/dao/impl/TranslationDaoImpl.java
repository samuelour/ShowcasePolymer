package com.oxit.decathlon.showCasePolymer.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.oxit.decathlon.showCasePolymer.dao.TranslationDao;
import com.oxit.decathlon.showCasePolymer.entity.TranslationEntity;

@Repository
public class TranslationDaoImpl implements TranslationDao {

	@PersistenceContext(unitName = "showCasePolymerPU")
	private EntityManager entityManager;

	@Override
	public TranslationEntity get(String context, String labelCode, String language) {
		StringBuilder sb = new StringBuilder();
		sb.append("From Translation");
		sb.append(" Where context = :context");
		sb.append(" And labelCode = :labelCode");
		sb.append(" And language = :language");

		TypedQuery<TranslationEntity> query = entityManager.createQuery(sb.toString(), TranslationEntity.class);

		query.setParameter("context", context);
		query.setParameter("labelCode", labelCode);
		query.setParameter("language", language);

		List<TranslationEntity> result = query.getResultList();
		if (result.size() > 0) {
			return result.get(0);
		}
		return null;
	}
}
