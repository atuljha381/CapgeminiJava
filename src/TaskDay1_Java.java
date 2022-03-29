/*
 *1)Write Java code to display welcome message
 *2)Write a java code to store your name in a string variable and display your name with welcome message
 *3)Write a java code to store firstname, lastname and display side by side
 *4)Write a java code to store any int value and display next, previous value
 *5)Write java code to store two numbers and display average value of two numbers
 *6)Using scanner store name, course, fees and display
 *7)Store any negative number and convert it to positive number.
 *8)Store any two digit number display sum of digits
 *9)Store two numbers and swap values
 *10)Store any sentence , and input any search criteria, find that criteria is starts or ending
 *11)Store any name and display the name in the reverse order using StringBuffer
 *12)Store any message and replace a,e,i,o,u  with p,q,r,s,t
*/
import java.util.*;

class QuestionSolve
{
	public String Question1() {
		return ("Welcome");
	}
	public void Question2(String name) {
		System.out.println(this.Question1()+" "+name);
	}
	public void Question3(String fname,String lname) {
		System.out.println(fname+" "+lname);
	}
	public void Question4(int val) {
		System.out.println(val--+" "+val+" "+val++);
	}
	public void Question5(int a,int b) {
		int avg = (int)(a+b/2);
		System.out.println(avg);
	}
	public void Question6(String name,String course,int fees) {
		String output = String.format("Name: %s\nCourse: %s\nFees: %d",name,course,fees);
		System.out.println(output);
	}
	public void Question7(int num) {
		System.out.println( Math.abs(num));
	}
	public void Question8(int num) {
		System.out.println(num/10+num%10);
		
	}
	public void Question9(int a,int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a+" "+b);
	}
	public void Question10(String str,String search) {
//		if(str.contains(search))
//			System.out.println("Found "+search+" at index "+str.indexOf(search));
//		else
//			System.out.println(search+" not found in sentence");
		
		if(str.startsWith(search)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public void Question11(String name) {
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
	}
	public void Question12(String message) {
		System.out.println(message.replaceAll("[aA]","p").replaceAll("[eE]","q").replaceAll("[iI]","r").replaceAll("[oO]","s").replaceAll("[uU]","t"));
	}
	
}
public class TaskDay1_Java {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionSolve qs = new QuestionSolve();
//		qs.Question2("Atul");
//		qs.Question3("Atul", "Jha");
//		qs.Question12("Hello Vision");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String msg = (name.length()<8) ? (name.length()>5?"valid" : "notvalid") : "not valid" ;
		System.out.println(msg);
		
		System.out.println("Your username is \""+name+"\"");
	}

}
