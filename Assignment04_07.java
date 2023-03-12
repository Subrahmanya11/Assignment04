package in.ineuron.main;

import java.util.Scanner;

public class Assignment04_07 {

	public static void main(String[] args) {
		boolean flag= false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1= sc.nextLine();
		char[] a=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			a[i]=s1.charAt(i);
		}
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(a[i]==a[j]  && j!=i)
				{
					flag=true;
				}
			}
		}
		if(flag==false)
			System.out.println("String contains only Unique Characters");
		else
		{
			System.out.println("String contains Duplicates");
		}
	}
}
