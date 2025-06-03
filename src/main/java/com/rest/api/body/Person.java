package com.rest.api.body;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idperson;
	private String fullname;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdPerson() {
		return idperson;
	}
	public void setIdPerson(Long idPerson) {
		this.idperson = idPerson;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	
}
