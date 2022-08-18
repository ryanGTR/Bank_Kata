package com.ryan101.bank.usecase;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.ryan101.bank.Account.Custom;
import java.util.UUID;
import ntut.csie.sslab.ddd.usecase.cqrs.CqrsOutput;
import org.junit.jupiter.api.Test;

public class CreateBankAccountUseCaseTest {

  @Test
  public void should_create_a_account() {
    CreateBankAccountUseCase useCase = new CreateBankAccountUseCase();
    CreateBankAccountInput input = new CreateBankAccountInput();
    input.setId(UUID.randomUUID().toString());
    input.setName(new Custom("Ryan").getName());
    input.setEmail("test@test");
    input.setCellPhone("0921123456");

    CqrsOutput output = useCase.execute(input);
    assertNotNull(output.getId());
  }
}
