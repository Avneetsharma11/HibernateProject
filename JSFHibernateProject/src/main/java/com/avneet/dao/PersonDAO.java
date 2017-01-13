package com.avneet.dao;



import java.util.List;

import com.avneet.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
}