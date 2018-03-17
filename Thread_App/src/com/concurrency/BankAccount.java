package com.concurrency;

public class BankAccount implements Runnable{

	private int balance;
	
	public BankAccount(int startBalance){
		balance = startBalance;
	}
	
	
	/*public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" - Start Balance : "+getBalance());
		deposite(10);
		System.out.println(Thread.currentThread().getName()+" - End Balance : "+getBalance());
	}*/
	
	public synchronized void run() 
	{
		System.out.println(Thread.currentThread().getName()+" - Start Balance : "+getBalance());
		deposite(10);
		System.out.println(Thread.currentThread().getName()+" - End Balance : "+getBalance());
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void	deposite(int amount) 
	{
		balance +=amount;
	}
	
	
	//synchronized methods
	/*public synchronized int getBalance()
	{
		return balance;
	}
	
	public synchronized void deposite(int amount) 
	{
		balance +=amount;
	}
	*/
}
