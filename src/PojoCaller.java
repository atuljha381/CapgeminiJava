public class PojoCaller {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setId(11);
		p1.setPname("Suman");
		System.out.println(p1); 
		System.out.println(p1.getId()+" "+p1.getPname());
		
		Person p2=new Person(123,"Imran");
		System.out.println(p2);
		System.out.println(p2.getId()+" "+p2.getPname());
	}

}