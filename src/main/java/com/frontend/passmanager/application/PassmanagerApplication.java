package com.frontend.passmanager.application;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.frontend.passmanager.model.Password;
import com.frontend.passmanager.repository.PasswordRepository;

import ch.qos.logback.core.joran.conditional.IfAction;

@SpringBootApplication
@ComponentScan(basePackages = {"com.frontend.passmanager.model", "com.frontend.passmanager.repository", "com.frontend.passmanager.resource"})
@EnableMongoRepositories(basePackages = "com.frontend.passmanager.repository")
public class PassmanagerApplication{

	//private PasswordRepository passwordRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PassmanagerApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub Password p1 = new Password("1", "google",
	 * "google.com", "google");
	 * 
	 * passwordRepository.save(p1); System.out.println("*********");
	 * 
	 * List<Password> passwordss = passwordRepository.findAll();
	 * 
	 * for(Password p:passwordss) { System.out.println(p); } }
	 */
	
	//	If port is already in use
	//netstat -ano | findstr *<port used>*
	//taskkill /F /PID *<pid>*

}
