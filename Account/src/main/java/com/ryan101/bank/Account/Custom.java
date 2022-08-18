package com.ryan101.bank.Account;

public class Custom {

  private String name;
  private String id;
  private String email;
  private String cellPhone;

  public Custom(String name) {
    this.name = name;
  }

  public Custom setId(String id) {
    this.id = id;
    return this;
  }

  public Custom setEmail(String email) {
    this.email = email;
    return this;
  }

  public Custom setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  public String getName() {
    return name;
  }
}
