package starter.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ryan101.account.BankAccount;
import com.ryan101.account.Custom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount {

  private Custom custom;

  @Given("Ryan is a bank customer")
  public void ryan_is_a_bank_customer() {
    custom = new Custom("Ryan");
    //    throw new io.cucumber.java.PendingException();
  }

  @When("he enter ID,Email,Cell phone")
  public void he_enter_id_email_cell_phone() {
    custom.setId("A123456789").setEmail("bank@ryan101.com").setCellPhone("0921123456");
    //    throw new io.cucumber.java.PendingException();
  }

  @Then("he should see information about bank account")
  public void he_should_see_information_about_bank_account() {
    BankAccount bankAccount = new BankAccount(custom);
    assertEquals(bankAccount.getAccountName(), custom.getName());
    //    throw new io.cucumber.java.PendingException();
  }
}
