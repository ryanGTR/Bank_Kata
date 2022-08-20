package com.ryan101.account.port.in.create;

import ntut.csie.sslab.ddd.usecase.Output;
import ntut.csie.sslab.ddd.usecase.cqrs.CqrsOutput;

public interface CreateBankAccountUseCase extends Output {

  CqrsOutput execute(CreateBankAccountInput input);
}
