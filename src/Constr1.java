

public class Constr1 {
	private int x,y;
	
	private static String message= "I am in static area";
	static {
		System.out.println("This is static block 1");
		System.out.println(message);
	}
	
	public Constr1()
	{
		System.out.println("Object is ready to use");
		this.x=100;
		this.y=200;
	}
	public void store(int a,int b) {
		this.x=a;
		this.y=b;
	}
	public void show() {
		System.out.println(this.x+" "+this.y);
	}
	public static void main(String[] args) {
		System.out.println("Starting from main");
		Constr1 cns = new Constr1();
		cns.show();
		cns.store(10, 20);
		cns.show();
		message = "End of program";
		System.out.println(message);
	}
	static {
		System.out.println("This is static block 2");
	}
	{
		System.out.println("Non static block as un-named constructor");
	}
}
