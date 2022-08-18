package com.ryan101.bank.Account;

public class BankAccount {

  private String name;

  public BankAccount(Custom custom) {
    this.name = custom.getName();
  }

  public String getAccountName() {
    return name;
  }
}
