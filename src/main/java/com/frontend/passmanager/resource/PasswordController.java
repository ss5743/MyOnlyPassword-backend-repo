package com.frontend.passmanager.resource;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.frontend.passmanager.model.Password;
import com.frontend.passmanager.repository.PasswordRepository;

@RestController
public class PasswordController {

	@Autowired
	private PasswordRepository passwordRepo;
	
	/*return passwordRepo.save(password);*/
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/passwords")
	public Password savePassword(@RequestBody Password password) {
		return passwordRepo.insert(password);
		//return("added password to db" + password.getId());
	}
	
	/*
	 * @GetMapping("/addPass") public String test() { return("hi"); }
	 */
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/passwords")
	public List<Password> getPasswords() {
		return passwordRepo.findAll();
		//return("passwords have been returned");
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/passwords/deletePass/{id}")
	public void deletePassword(@PathVariable("id") String id) {
		passwordRepo.deleteById(id);
		return;
	}
	
	/*
	 * @DeleteMapping("/deletePass/{id}") public String deletePassword(Integer id) {
	 * passwordRepo.deleteById(id); return("deleted book with id:"+id); }
	 */
	
}
