package in.ineuron.main;

import java.util.Scanner;

public class Assignment04_01 {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = sc.nextLine();
		String s=s1.toLowerCase();
		char[] a = new char[s.length()];
		char[] b = new char[s.length()];
		for(int i=0; i<s.length();i++) {
			a[i]=s.charAt(i);
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if (a[i] == a[j] && j != i) {
					b[j] = a[j];
					flag = flag+1;
				}
			}
		}
		if (flag == 0) {
			System.out.println("No duplicates in String");
		} else {
			System.out.println("String after removing duplicate character: ");
			for (int i = 0; i < b.length; i++) {
				if (b[i] == '\u0000') {
					System.out.print(s.charAt(i));
				}
			}
		}
	}
}
