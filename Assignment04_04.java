package in.ineuron.main;

import java.util.Scanner;

public class Assignment04_04 {

	public static void main(String[] args) {
		int  vowels=0, special=0,consonants=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		char[] a=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			a[i]=s.charAt(i);
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(a[i] == 65 || a[i]==69 || a[i]==73 || a[i]==79 || a[i]==85 || a[i]==97 || a[i]==101 || a[i]==105 || a[i]==111 || a[i]==117)
			{
				vowels++;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if((a[i]>=32 && a[i]<=64) || (a[i]>=91 && a[i]<=96) || (a[i]>=123 && a[i]<=126))
			{
				special++;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if((a[i]>=66 && a[i]<=68) || (a[i]>=70 && a[i]<=72) || (a[i]>=74 && a[i]<=78) || (a[i]>=80 && a[i]<=84) || (a[i]>=86 && a[i]<=90) || 
				(a[i]>=98 && a[i]<=100) || (a[i]>=102 && a[i]<=104) || (a[i]>=106 && a[i]<=110) || (a[i]>=112 && a[i]<=116) || 
				(a[i]>=118 && a[i]<=122))
			{
				consonants++;
			}
		}
		if(vowels==0 && consonants==0 && special==0)
			System.out.println("Enter a valid String");
			if(vowels==0)
		System.out.println("No vowels present");
		else
			System.out.println( vowels+ " vowels present in the string");
		if(consonants==0)
			System.out.println("No Consonants present");
		else
			System.out.println(consonants+ " Consonants present in the string");
		if(special==0)
			System.out.println("No special character present");
		else			
		System.out.println(special+" special charaters present ");
	
	}

}
