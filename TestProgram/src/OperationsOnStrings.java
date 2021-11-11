import java.util.Scanner;

public class OperationsOnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello word";
//		System.out.println("enter a string");
//		Scanner sc = new Scanner(System.in);
//		sc.useDelimiter("\r");
//		String s0 = sc.next();
		String s1 = "this is an example string";
		String s2 = new String("this a string using constructor");
		System.out.println(s);
//		System.out.println(s0);
		System.out.println(s2);
		System.out.println(s1.charAt(2));
		System.out.println(s1.codePointAt(2));
		System.out.println(s1.codePointBefore(2));
		System.out.println(s1.codePointCount(0, 2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase("This is an example string"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("this"));
		System.out.println(s1.contentEquals("this is an example string"));//this compare whole string
		System.out.println(s1.endsWith("string"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		char[] a = s1.toCharArray();
		System.out.println(a.length);
		System.out.println(s1.intern());
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);
		}  
		System.out.println(s1.substring(2, 15));
		s1 = s1.replaceAll("this", "zhis");// this step reassigns the value of the string to s1
		System.out.println(s1); //s1 now points to new memory location
		
	}

}
