package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.UserRegistrationPage;

import java.io.FileInputStream;
import java.util.Properties;

public class StepDefinitions {

  public WebDriver driver;
  public Properties properties;
  public UserRegistrationPage userRegistrationPage;

  @Given("Open Url")
  public void open_url () {
    preConditions ();
    driver.get (properties.getProperty ("url"));
  }

  @When("User enters Name,Email,Gender,Mobile")
  public void user_enters_name_email_gender_mobile_digits () {
    userRegistrationPage.enterFirstName ("test");
    userRegistrationPage.enterEmailId ("test@gmail.com");
    userRegistrationPage.selectGender (driver, "Male");
    userRegistrationPage.enterMobile ("7894562580");
  }

  @When("User enters Date of Birth,Subjects,Hobbies")
  public void user_enters_date_of_birth_subjects_hobbies () {
    userRegistrationPage.enterDOB ("01/01/1990");
    userRegistrationPage.enterSubjects ("test,test");
    userRegistrationPage.selectHobby (driver, "Sports");

  }

  @When("User enters Picture,Current Address,State and City")
  public void user_enters_picture_current_address_state_and_city () {
    userRegistrationPage.enterCurrentAddress ("test");
    userRegistrationPage.selectStateAndCity ("NCR", "Agra");
    userRegistrationPage.uploadPicture ("\\src\\test\\resources\\assets\\Donald_Duck.png");
  }

  @When("Click on Login button")
  public void click_on_login_button () {
    userRegistrationPage.clickOnLoginBtn ();
  }

  @Then("User should be created")
  public void user_should_be_created () {
    postConditions ();
  }

  public void preConditions () {
    driver = new ChromeDriver ();
    try {
      FileInputStream inputStream = new FileInputStream ("src/test/resources/props.properties");
      properties = new Properties ();
      properties.load (inputStream);
    } catch (Exception e) {
      e.printStackTrace ();
    }
    userRegistrationPage = new UserRegistrationPage (driver);
    driver.manage ().window ().maximize ();
  }

  public void postConditions () {
    driver.quit ();
  }
}
