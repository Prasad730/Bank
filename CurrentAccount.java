package assignment_47;

public class CurrentAccount extends TheBank{
int accountno;
String name;
double balance;
String branch;

public CurrentAccount()
{}
public CurrentAccount(int accountno,String name,double balance,String branch)
{
	this.accountno=accountno;
	this.name=name;
	this.balance=balance;
	this.branch=branch;
	}
public void display1()
{
	System.out.println("Account no= "+accountno+" Name: "+name+" balance: "+branch);
	}
public void withdrawl(double amountw)
{
	double with=balance-amountw;
	System.out.println("After withdrawl,remaining balance: "+with);
	}
public void deposit(double amountd)
{
	double dep=balance+amountd;
	System.out.println("After depositing,total account balance: "+dep);
	}
}
