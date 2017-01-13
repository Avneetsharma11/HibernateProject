package com.avneet.service;



import java.util.List;

import com.avneet.model.Person;
 
public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}