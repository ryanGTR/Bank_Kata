package com.ryan101.account.service;

import com.ryan101.account.BankAccount;
import com.ryan101.account.Custom;
import com.ryan101.account.port.in.create.CreateBankAccountInput;
import com.ryan101.account.port.in.create.CreateBankAccountUseCase;
import com.ryan101.account.port.out.CreateBankAccountRepository;
import ntut.csie.sslab.ddd.usecase.cqrs.CqrsOutput;

public class CreateBankAccountService extends CqrsOutput implements CreateBankAccountUseCase {

  private CreateBankAccountRepository repository;

  public CreateBankAccountService(CreateBankAccountRepository repository) {
    super();
    this.repository = repository;
  }

  @Override
  public CqrsOutput execute(CreateBankAccountInput input) {
    BankAccount bankAccount = new BankAccount(new Custom(input.getName()));
    repository.save(bankAccount);
    return CqrsOutput.create().setId(bankAccount.getId());
  }
}
