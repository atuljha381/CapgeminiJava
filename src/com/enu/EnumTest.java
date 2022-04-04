package com.enu;

import java.util.Scanner;

enum Zones {
	NORTH("North"), SOUTH("South"), EAST("East"), WEST("West");

	private String zoneString;

	Zones(String string) {
		// TODO Auto-generated constructor stub
		this.zoneString = string;
	}

	public String getZoneString() {
		return zoneString;
	}

	public void setZoneString(String zoneString) {
		this.zoneString = zoneString;
	}

}

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your zone");
		Scanner scanner = new Scanner(System.in);
		String zn = scanner.next();
		for (Zones z : Zones.values()) {
			if (zn.equalsIgnoreCase(z.getZoneString())) {
				System.out.println("I have been to zone " + z.getZoneString());
			} else {
				System.out.println("I could not reach " + z.getZoneString());
			}
		}
	}

}
