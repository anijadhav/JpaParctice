package com.starter.jdbc.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.starter.jdbc.project.entity.Person;

@Repository
@Transactional
public class JpaPersonRepository {
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}
	
	
}
