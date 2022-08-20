package com.ryan101.bank.account;

import com.ryan101.account.BankAccount;
import com.ryan101.account.port.out.CreateBankAccountRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryCreateBankAccountRepository implements CreateBankAccountRepository {

  private final List<BankAccount> store = new ArrayList();

  @Override
  public Optional<BankAccount> findById(String id) {
    return store.stream().filter(x -> x.getId().equals(id)).findAny();
  }

  @Override
  public void save(BankAccount data) {
    store.add(data);
  }
}
