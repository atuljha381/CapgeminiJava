
public class StringBuffProg {
	public static void main(String[] args) {
		String str = "hello!world";
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append("members"));
		System.out.println(sb.insert(6,"my new"));
		System.out.println(sb.delete(6,10));
		System.out.println(sb.reverse());
	}
}
