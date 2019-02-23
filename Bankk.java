	import java.util.Scanner;
	import java.util.io.*;
	class Bank
	{
	static Scanner s1=new Scanner(System.in);
	String name,Addr;
	int bal=200000;
	int withd,left;
	String pwd="123456";
	String passwor;
	void facilities()
	{
	System.out.println("Create account ");
	System.out.println("Deposite");
	System.out.println("Withdrawl");
	System.out.println("Balance Enquiry");
	}
	void CreateAc()
	{
	System.out.println("Enter Account holder name:--");
	name=s1.nextLine();
	System.out.println("Enter Address:--");
	Addr=s1.nextLine();
	}
	void Withdrawl()
	{
	System.out.println("Enter amount to withdraw:--");
	withd=s1.nextInt();
	if(withd>bal)
	{
	System.out.println("Insufficient balance");
	}
	else
	{
	left=(bal-withd);
	System.out.println(" Available balance is:--"+left);
	System.out.println("Withdrawl balance is:-- "+withd);
	}
	}
	void Balance()
	{
	System.out.println("Enter the password to check balance Enquiry");
	passwor=PasswordField.readPassword("Enter the password---");
	if(passwor==pwd)
	{
	System.out.println("Your Account have:--"+bal+"$");
	}
	else
	{
	System.out.println("Wrong password");
	}
	}
	public static  void main(String...args)
	{
	Bank b1=new Bank();
	b1.facilities();
	int p;
	p=s1.nextInt();
	switch(p)
	{
	
	case 1:
	b1.CreateAc();
	break;
	case 2:
	b1.Withdrawl();
   break;
	case 3:
	b1.Balance();
	break;
	
	
	}
	}}