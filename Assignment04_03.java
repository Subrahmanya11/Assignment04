package in.ineuron.main;

import java.util.Scanner;

public class Assignment04_03 {

	public static void main(String[] args) {
		String s1="2552";
		String s2="";
		boolean flag= true;
		for(int i=s1.length()-1; i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		for(int i=0; i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				flag= false;
				break;
			}		
		}
		if(flag==false) 
			System.out.println("Not a Palindrome");
		else 
			System.out.println("Palindrome");	
	}
}
