package com.relation.comp;

public class EmployeeIdCardValidator extends Validate {

	@Override
	public boolean Validator() {

		boolean flag = false;
		if (getId().length() == 8 && getId().contains("E:")) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		EmployeeIdCardValidator empcard = new EmployeeIdCardValidator();
		empcard.setId("E:123045");
		System.out.println("Your id Card is " + empcard.getId());
		System.out.println(empcard.Validator() ? "Is valid card" : "Found invalid card");

	}

}
