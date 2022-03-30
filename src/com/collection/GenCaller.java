package com.collection;

public class GenCaller {
	public static void main(String[] args) {
		Provider<Employee> empProvider = new Provider<Employee>();
		empProvider.setTypeObj(new Employee(101, "Rajesh", "exec", 35000));
		System.out.println(empProvider.getTypeObj());
		
		Provider<Person> perProvider = new Provider<Person>();
		perProvider.setTypeObj(new Person(1,"Jaya"));
		System.out.println(perProvider.getTypeObj());
		
		Provider<Integer> num = new Provider<Integer>();
		num.setTypeObj(12);
		System.out.println(num.getTypeObj());
		
		KVProvider<Integer, Employee> provider = new KVProvider<Integer,Employee>();
		Integer id = empProvider.getTypeObj().getId();
		provider.put(id, empProvider.getTypeObj());
		
		Employee e = provider.get(101);
		System.out.println(e);
	}
}
