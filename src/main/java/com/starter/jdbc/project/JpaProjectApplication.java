package com.starter.jdbc.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.starter.jdbc.project.dao.JpaPersonRepository;

@SpringBootApplication
public class JpaProjectApplication implements CommandLineRunner {
	@Autowired
	JpaPersonRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Values from Database for Ram is:" + repository.findById(10002));
	}

}
