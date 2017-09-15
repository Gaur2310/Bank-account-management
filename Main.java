package com.gaur;

public class Main {

    public static void main(String[] args) {
		bank gaursAccount = new bank( 12345678922l, 0.00d, "ANKIT GAur", "iamgaurl@outlook.com",  8826825931l);

		System.out.println(gaursAccount.getAccount_num());
		System.out.println(gaursAccount.getBalance());

	gaursAccount.deposit(100);
	gaursAccount.Withdrawl(50);
    }

}