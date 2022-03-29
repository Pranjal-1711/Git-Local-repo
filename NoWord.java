package Pack;

import java.util.Scanner;

public class NoWord 
{
	String n;
	char ch;
	Scanner s;
	
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the string:");
		n=s.nextLine();
	}
	
	void count()
	{
		int count=0;
		int len=n.length();
		for(int i=0;i<len;i++)
		{
			ch=n.charAt(i);
			count++;
		}
		System.out.println("No. of words in given string is:"+ count);
	}

	public static void main(String[] args)
	{
		NoWord n=new NoWord();
		n.input();
		n.count();

	}

}
