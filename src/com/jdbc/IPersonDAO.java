package com.jdbc;

import java.util.ArrayList;

public interface IPersonDAO {
	boolean addPerson(Person person);

	ArrayList<Person> getAllPersons();
}
