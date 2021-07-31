package com.starter.jdbc.project;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.starter.jdbc.project.dao.JdbcPersonDao;
import com.starter.jdbc.project.entity.Person;

//@SpringBootApplication
public class JdbcProjectApplication implements CommandLineRunner {
	@Autowired
	JdbcPersonDao personDao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JdbcProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Values from Database is:" + personDao.findAll());
		
		logger.info("Values from Database for Ram is:" + personDao.findByName("Ram"));
		
		logger.info("Deleting data from database: and number item delted ->{}" + personDao.deleteById(10003));
		
		logger.info("Inserting data to database:->{}" + personDao.insert(new Person(10004,"Raju","Berlin",new Date())));
		
		logger.info("Updating data to database:->{}" + personDao.update(new Person(10002,"Ram","Delhi",new Date())));
	}

}
