package com.avneet.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.avneet.service.PersonService;

@ManagedBean(name="personBean")
@RequestScoped
public class PersonBean {

	@Autowired
	PersonService personService;
	public void execute(){
		personService.listPersons();
	}
	
	
}
