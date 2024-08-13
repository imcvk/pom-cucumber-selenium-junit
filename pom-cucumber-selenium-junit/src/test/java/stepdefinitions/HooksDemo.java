package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HooksDemo {
    WebDriver driver;

    @Before
    public void browserSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println("Browser Opened");
    }

    @Given("User opens url")
    public void user_opens_url() {

    }

    @When("User enters incorrect username\"test\" and password\"test\"")
    public void user_enters_incorrect_username_test_and_password_test() {

    }

    @Then("user should get error")
    public void user_should_get_error() {

    }

    @After
    public void teardown() {
        driver.quit();
        System.out.println("Browser closed");
    }
}
