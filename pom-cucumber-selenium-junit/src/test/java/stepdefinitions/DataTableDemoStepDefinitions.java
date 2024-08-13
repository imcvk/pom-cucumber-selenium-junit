package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataTableDemoStepDefinitions {
  @Given("I am on the new user registration page")
  public void i_am_on_the_new_user_registration_page() {
    System.out.println ("I am on the new user registration page");
  }
  @When("I enter invalid data on the page")
  public void i_enter_invalid_data_on_the_page(DataTable dataTable) {
    Map<String, String> formDetails = dataTable.asMap ();
    Iterator it = formDetails.entrySet ().iterator ();
    for (Map.Entry<String, String> entry : formDetails.entrySet ())
      System.out.println ("Key = " + entry.getKey () + ", Value = " + entry.getValue ());
  }
  @Then("the user registration should be unsuccessful")
  public void the_user_registration_should_be_unsuccessful() {
    System.out.println ("the user registration should be unsuccessful");
  }
}
