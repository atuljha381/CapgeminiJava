public class Person {
	private int id; 
	private String pname;
	
	public Person() { }
	
	public Person(int id, String pname) {
		this.id = id;
		this.pname = pname;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String toString() { 
		return getId()+","+getPname(); 
	}
}