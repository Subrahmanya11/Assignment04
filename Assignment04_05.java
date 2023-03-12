package in.ineuron.main;

import java.util.Scanner;

public class Assignment04_05 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = sc.nextLine();
		System.out.println("Enter String 2");
		String s2 = sc.nextLine();
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		if(s1.length()!=s2.length()) {
			System.out.println("Mismatch in lenght of string 1 & 2");
		}
		else 
		{
		String uppers1 = "";
		String uppers2 = "";
		uppers1=s1.toUpperCase();
		uppers2=s2.toUpperCase();
		System.out.println("String 1: "+uppers1);
		System.out.println("String 2: "+uppers2);
		char[] a = new char[uppers1.length()];
		for (int i = 0; i < uppers1.length(); i++) {
			a[i] = uppers1.charAt(i);
		}
		char[] b = new char[uppers2.length()];
		for (int i = 0; i < uppers2.length(); i++) {
			b[i] = uppers2.charAt(i);
		}

		for (int i = 0; i < uppers1.length(); i++) {
			for (int j = 0; j < (uppers1.length()) - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					char temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < uppers2.length(); i++) {
			for (int j = 0; j < (uppers2.length()) - i - 1; j++) {
				if (b[j] > b[j + 1]) {
					char temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				count++;
				continue;
			}
		}

		if (count == a.length)
			System.out.println("\nIt is an Anagram");
		else
			System.out.println("\nIt is not an Anagram");
		}
	}
}
