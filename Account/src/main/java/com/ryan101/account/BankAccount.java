package com.ryan101.account;

import java.util.UUID;

public class BankAccount {

  private String name;
  private String id;

  public BankAccount(Custom customs) {
    this.name = customs.getName();
    this.id = UUID.randomUUID().toString();
  }

  public String getAccountName() {
    return name;
  }

  public String getId() {
    return id;
  }
}
