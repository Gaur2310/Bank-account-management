package com.gaur;

/**
 * Created by ankit on 8/2/17.
 */
public class bank {
    private long account_num;
    private double balance;
    private String customer_name;
    private String email;
    private long phone_num;


    public bank(long account_num, double balance, String customer_name, String email, long phone_num)
    {
        this.customer_name = customer_name;
        this.account_num = account_num;
        this.email = email;
        this.phone_num = phone_num;
        this.balance = balance;
    }
    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("deposit of" +depositAmount + "made. New amount is" +this.balance);
    }
    public void Withdrawl(double WithdrawlAmount )
    {
      if(this.balance -WithdrawlAmount <=0 )
      {
          this.balance -=WithdrawlAmount;
          System.out.println("only" + this.balance + "pocess failed. NOT Enough balance");
      }
      else
      {
          this.balance -= WithdrawlAmount;
          System.out.println("withdrwal of " + WithdrawlAmount+ "processed.  Remaining balance is" +this.balance);
      }

    }
    public long getAccount_num() {
        return account_num;
    }

    public void setAccount_num(int account_num) {
        this.account_num = account_num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }

}