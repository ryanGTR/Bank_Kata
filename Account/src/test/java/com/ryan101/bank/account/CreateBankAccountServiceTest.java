package com.ryan101.bank.account;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ryan101.account.Custom;
import com.ryan101.account.port.in.create.CreateBankAccountInput;
import com.ryan101.account.port.in.create.CreateBankAccountUseCase;
import com.ryan101.account.port.out.CreateBankAccountRepository;
import com.ryan101.account.service.CreateBankAccountService;
import java.util.UUID;
import ntut.csie.sslab.ddd.usecase.cqrs.CqrsOutput;
import org.junit.jupiter.api.Test;

public class CreateBankAccountServiceTest {



  @Test
  public void should_create_a_account() {
    CreateBankAccountRepository repository = new InMemoryCreateBankAccountRepository();

    CreateBankAccountUseCase useCase = new CreateBankAccountService(repository);
    CreateBankAccountInput input = new CreateBankAccountInput();
    input.setId(UUID.randomUUID().toString());
    input.setName(new Custom("Ryan").getName());
    input.setEmail("test@test");
    input.setCellPhone("0921123456");

    CqrsOutput output = useCase.execute(input);
    assertNotNull(output.getId());
    assertTrue(repository.findById(output.getId()).isPresent());
  }
}
