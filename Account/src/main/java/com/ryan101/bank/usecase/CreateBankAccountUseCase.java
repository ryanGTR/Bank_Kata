package com.ryan101.bank.usecase;

import ntut.csie.sslab.ddd.usecase.cqrs.CqrsOutput;

public class CreateBankAccountUseCase extends CqrsOutput {

  public CqrsOutput execute(CreateBankAccountInput input) {
    return CqrsOutput.create();
  }
}
