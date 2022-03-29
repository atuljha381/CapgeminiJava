import java.util.*;
class Task
{
	Scanner sc = new Scanner(System.in);
	public void task1() {
		String nameArr[]= new String[5];
		for(int i=0;i<5;++i) {
			nameArr[i] = sc.next();
		}
		int max = nameArr[0].length();
		String bigName=" ";
		for(int i=0;i<nameArr.length;++i) {
			System.out.println("Name["+(i+1)+"] is: "+nameArr[i]);
			if(max<nameArr[i].length()) {
				max=nameArr[i].length();
				bigName = nameArr[i];
			}
		}
		System.out.println("Name with largest length is: "+bigName+" with size "+max);
	}
	
	public void task2() {
		int arr[][] = new int[2][3];
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[i].length;++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix before transpose");
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[0].length;++j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix after transpose");
		for(int i=0;i<arr[0].length;++i) {
			for(int j=0;j<arr.length;++j) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public void task3() {
		int arr[][] = new int[3][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
		}
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[i].length;++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("values");
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[i].length;++j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void task4() {
		int arr[][] = new int[3][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
		}
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[i].length;++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("values");
		int sp=2;
		for(int i=0;i<arr.length;i++) {
			for(int k=sp;k>=1;--k) {
				System.out.print(" ");
			}
			sp--;
			for(int j=0;j<arr[i].length;++j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void task5() {
		int[][] arr = new int[4][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print((j+1)%2+" ");
			}
			System.out.println();
		}
	}
	
	public void task6() {
		String num = sc.next();
		System.out.println(Integer.parseInt(num));
		
		int x = sc.nextInt();
		Integer obj = x;
		System.out.println(x+" "+obj);
		int y = obj;
		System.out.println(y);
	}
	public void armstrong(int num) {
		int n=num,sum=0,r;
		while(n>0) {
			r = n%10;
			sum += r*r*r;
			n = n/10;
		}
		
		if(num==sum) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public void stringPattern() {
		String str = "Rajesh";
		int sz = str.length();
		int i=0;
		while(i<sz)
		{
			int j=0;
			while(j<=i) {
				System.out.print(str.charAt(j));
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

public class MultiDimArray {
	public static void main(String[] args) {
//		int arr[][]= {{10,20,30},{11,12,13},{21,22,23},{31,32,33}};
//		System.out.println("ROWS: "+arr.length);
//		System.out.println("Columns: "+arr[0].length);
//		
//		for(int i=0;i<arr.length;++i) {
//			for(int j=0;j<arr[i].length;++j)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		String friends ="raju,kiran,jaya,leela";
//		String list[] = friends.split(",");
//		System.out.println("number of friends: "+list.length);
//		for(String name:list) {
//			System.out.println(name);
//			for(char ch:name.toCharArray()) {
//				System.out.println(ch+" ");
//			}
//			System.out.println();
//		}
		
		Task ts = new Task();
		ts.stringPattern();
	}
}
