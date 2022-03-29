
public class Prog1 {
	//first java program
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		int n=123;
		int reverse = (n%10)*10+n/10;
		int result = n/10+n%10;
		System.out.println("Sum of digits "+result);
		System.out.println("Reverse "+reverse);

		/**
		 * for a three digit number compare the first and last digit and print true/false if they are same
		 * for eg: 121 = true 
		 * 			123 = false
		 */
		int firstDigit = (n/10)/10;
		int lastDigit = n%10;
		System.out.println(firstDigit+" "+lastDigit);
	}
}
