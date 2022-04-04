package com.jdbc;

import java.util.ArrayList;

public class DBMain {
	public static void main(String[] args) {
		PersonDAOImpl dao = new PersonDAOImpl();
		ArrayList<Person> list = dao.getAllPersons();
		for (Person rec : list) {
			System.out.println(rec.getName());
		}
	}
}
