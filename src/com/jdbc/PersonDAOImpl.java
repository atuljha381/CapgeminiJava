package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PersonDAOImpl implements IPersonDAO {
	Connection conn = null;
	ResultSet result = null;
	PreparedStatement pst = null;

	public PersonDAOImpl() {
		try {
			DBConnector connector = DBConnector.getDBResource();
			conn = connector.getConnected();
			System.out.println("Database is ready");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public boolean addPerson(Person person) {
		// TODO Auto-generated method stub
		try {
			pst = conn.prepareStatement("insert into person values(?,?,?)");
			pst.setInt(1, person.getId());
			pst.setString(2, person.getName());
			pst.setString(3, person.getJob());
			pst.executeUpdate();
			System.out.println("record updated");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ArrayList<Person> getAllPersons() {
		ArrayList<Person> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement("select * from person");
			result = pst.executeQuery();
			while (result.next()) {
				// String record = result.getInt(1) + "," + result.getString(2) + "," +
				// result.getString(3);

				list.add(new Person(result.getInt(1), result.getString(2), result.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
