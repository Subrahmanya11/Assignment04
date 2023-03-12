package in.ineuron.main;

public class Assignment04_06 {

	public static void main(String[] args) {
	 boolean flag= false;
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		s1=s1.replace(" ", "");
		char[] ch = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			ch[i] = s1.charAt(i);
		}
		
		int[] ar=new int[26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;  
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
		System.out.println("It's pangram");
		}
	}

}
