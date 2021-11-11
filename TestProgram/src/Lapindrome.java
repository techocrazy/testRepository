import java.util.Scanner;

public class Lapindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number and string");
		int a = sc.nextInt();
		for(int i = 0;i <= a; i++) {
		String s = sc.next();
		int size = s.length();
		int rem = size%2;
		int quo = size/2;
		if(rem == 0) {
			String one = s.substring(0, quo);
			String two = s.substring(quo);
			if(two.contains(one)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		} else if(rem != 0) {
			String one = s.substring(0, quo);
			String two = s.substring(quo+1);
			if(two.contains(one)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			} 
		}	
	}
	}

}
