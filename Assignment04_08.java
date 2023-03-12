package in.ineuron.main;

import java.util.Scanner;

public class Assignment04_08 {

	public static void main(String[] args) {

		int count = 0;
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		s1 = sc.nextLine();
		char[] a = new char[s1.length()];
		char[] b = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			a[i] = s1.charAt(i);
		}

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (a[i] == a[j] && j != i) {
					b[j] = a[j];
					count = count + 1;
				}
			}
		}

		if (count == 0)
			System.out.println("There is no duplicate character");
		else {
			int entry = -1;
			int c[] = new int[s1.length()];

			for (int i = 0; i < s1.length(); i++) {
				int c1 = 1;
				for (int j = i + 1; j < s1.length(); j++) {
					if (a[i] == a[j]) {
						c1++;
						c[j] = entry;
					}
				}
				if (c[i] != entry)
					c[i] = c1;
			}
			for (int i = 0; i < c.length; i++) {
				for (int j = i + 1; j < c.length; j++) {
					if (c[i] < c[j]) {
						int temp = c[i];
						char t = a[i];
						c[i] = c[j];
						a[i] = a[j];
						c[j] = temp;
						a[j] = t;
					}
				}
			}
			System.out.println(a[0] + " occurs " + c[0] + " times");
		}

	}
}


						
