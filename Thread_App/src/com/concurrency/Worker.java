package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount(100);
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i <5; i++) {
			executorService.submit(bankAccount);
		}
	}

}
