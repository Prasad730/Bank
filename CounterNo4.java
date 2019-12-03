package assignment_47;

import java.util.Scanner;

public class CounterNo4 {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Which type of account you need to create..?");
	System.out.println("1.Current Account  2.Savings Account");
	int choice=s.nextInt();
	if(choice==1)
	{
		System.out.println("Enter balance");
		double bal=s.nextInt();
		if(bal>=1000)
		{	
		System.out.println("Enter Account no.");
		int acn=s.nextInt();
		System.out.println("Enter name:");
		String nm=s.next();
		System.out.println("Enter branch name");
		String bn=s.next();
		CurrentAccount b=new CurrentAccount(acn,nm,bal,bn);
		b.display1();
		System.out.println("You want to 1.withdrawl or 2.deposit..?");
		int ch=s.nextInt();
		if(ch==1)
		{
			System.out.println("Enter amount to withdraw");
			int amw=s.nextInt();
		b.withdrawl(amw);
		}
		else if(ch==2)
		{
			System.out.println("Enter amount to deposit");
			int amd=s.nextInt();
			b.deposit(amd);
		}
		}
		else
		{
			System.out.println("Balance cannot be less than Rs.1000");
		}
			
	}
	else if(choice==2)
	{
		System.out.println("Enter balance");
		double bal=s.nextInt();
		if(bal>=5000)
		{	
		System.out.println("Balance should be atleast Rs.5000");
		System.out.println("Enter Account no.");
		int acn=s.nextInt();
		System.out.println("Enter name:");
		String nm=s.next();
		System.out.println("Enter branch name");
		String bn=s.next();
		SavingsAccount b=new SavingsAccount(acn,nm,bal,bn);
		b.display2();
		System.out.println("You want to 1.withdrawl or 2.deposit..?");
		int ch=s.nextInt();
		if(ch==1)
		{
			System.out.println("Enter amount to withdraw");
			int amw=s.nextInt();
		b.withdrawl(amw);
		}
		else if(ch==2)
		{
			System.out.println("Enter amount to deposit");
			int amd=s.nextInt();
			b.deposit(amd);
		}
		}
		else
		{
			System.out.println("Balance cannot be less than Rs.1000");
		}
	}
	}
}
