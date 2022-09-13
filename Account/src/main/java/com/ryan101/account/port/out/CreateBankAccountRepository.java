package com.ryan101.account.port.out;

import com.ryan101.account.BankAccount;
import java.util.Optional;

public interface CreateBankAccountRepository {

  Optional<BankAccount> findById(String id);

  void save(BankAccount data);
}
