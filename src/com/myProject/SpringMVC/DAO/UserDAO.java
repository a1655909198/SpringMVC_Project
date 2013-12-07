package com.myProject.SpringMVC.DAO;

import java.util.List;
import java.util.Map;

import com.myProject.SpringMVC.model.Person;

public interface UserDAO {
	
	public List<Person> personList(Map map);
	
	public int savePerson(Person person);
	
	public int deletePersonDetails(Map map);
}
