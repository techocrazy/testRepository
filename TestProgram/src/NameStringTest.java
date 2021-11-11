import java.util.Scanner;

public class NameStringTest {

	public static void main(String[] args) {
		System.out.println("enter the full name");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		String ns = s.trim();
		if(ns.contains(" ")) {
//			System.out.print(ns.toUpperCase().charAt(0)+".");
			int sp = ns.indexOf(' ');
			int lsp = ns.lastIndexOf(' ');
			System.out.print(ns.toUpperCase().charAt(0)+""+ns.subSequence(1,sp)+""+".");
			
			if(ns.charAt(sp) == ' ') {
				System.out.print(ns.toUpperCase().charAt(sp+1)+".");	
			}
			if(ns.charAt(lsp) == ' ') {
				System.out.print(ns.toUpperCase().charAt(lsp+1)+""+ns.substring(lsp+2));
			}
		}
	}

}
