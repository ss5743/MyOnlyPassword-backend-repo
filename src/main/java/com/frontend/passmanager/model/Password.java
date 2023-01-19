package com.frontend.passmanager.model;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

@Document("passwords")
public class Password{
	
	@Id
	private String id;
	@Field
	private String website;
	@Field
	private String url;
	@Field
	private String password;
	
	
	
	public Password(String id, String website, String url, String password) {
		super();
		this.id = id;
		this.website = website;
		this.url = url;
		this.password = password;
	}
	
	public String getId() { 
		return id; 
	} 
	public void setId(String id) { 
		this.id = id; 
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
		
}
