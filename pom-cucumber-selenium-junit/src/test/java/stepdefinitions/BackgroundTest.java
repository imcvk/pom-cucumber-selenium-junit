package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundTest {
    @Given("when user opens url")
    public void when_user_opens_url() {
        System.out.println("BackgroundTest - when user opens url");
    }

    @When("Enters username and password")
    public void enters_username_and_password() {
        System.out.println("BackgroundTest - Enters username and password");
    }

    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("BackgroundTest - click on login button");
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        System.out.println("BackgroundTest - user should be able to login");
    }
}
