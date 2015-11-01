package com.oxit.decathlon.showCasePolymer.facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

/**
 * Abstract facade.
 * @param <ENTITY>
 *            entity class
 * @param <DTO>
 *            dto class
 */
public abstract class AFacade<ENTITY, DTO> {

	/**
	 * Transform an entity into a dto.
	 * @param entity
	 *            the entity to transform
	 * @return the dto
	 */
	public abstract DTO entityToDto(final ENTITY entity);

	/**
	 * Transform a dto into an entity.
	 * @param dto
	 *            the dto to transform
	 * @return the entity
	 */
	public abstract ENTITY dtoToEntity(final DTO dto);

	/**
	 * Transform an entity list into a dto list.
	 * @param entityList
	 *            the entity list to transform
	 * @return the dto
	 */
	public List<DTO> entityListToDtoList(final List<ENTITY> entityList) {
		List<DTO> dtoList = Collections.emptyList();

		if (CollectionUtils.isNotEmpty(entityList)) {
			dtoList = new ArrayList<DTO>();

			for (ENTITY entity : entityList) {
				dtoList.add(entityToDto(entity));
			}
		}

		return dtoList;
	}

	/**
	 * Transform an dto list into an entity list.
	 * @param dtoList
	 *            the dto list to transform
	 * @return the entity
	 */
	public List<ENTITY> dtoListToEntityList(final List<DTO> dtoList) {
		List<ENTITY> entityList = Collections.emptyList();

		if (CollectionUtils.isNotEmpty(dtoList)) {
			entityList = new ArrayList<ENTITY>();

			for (DTO dto : dtoList) {
				entityList.add(dtoToEntity(dto));
			}
		}

		return entityList;
	}
}
