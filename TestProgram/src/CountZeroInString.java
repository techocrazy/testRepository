import java.util.Scanner;
 
public class CountZeroInString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		String str = sc.next();
		
//		int count = 0;
//		if
//		for(int i=0; i<a.length(); i++) {
//			if(a.charAt(i) == '0') {
//				count++;
//			}
//		}
		int count = 0;
		int count1 = 0;
		
		for(int i=0; i<str.length(); i++) {
			while(str.charAt(i) == '0') {
				count++;
				if(count1 < count) {
					count1 = count;
				}
				if(i<str.length()-1) {
				i = i+1;
				
				}
			}
			count = 0;
		}
		System.out.println(count1);
	}
}
