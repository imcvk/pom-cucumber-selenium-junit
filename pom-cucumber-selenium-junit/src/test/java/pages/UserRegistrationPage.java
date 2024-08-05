package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserRegistrationPage {

  public UserRegistrationPage (WebDriver driver) {
    PageFactory.initElements (driver, this);
  }

  @FindBy(id = "name")
  public WebElement FirstName;
  @FindBy(id = "email")
  public WebElement EmailId;
  @FindBy(xpath = "//input[@type='radio']//following-sibling::label")
  public List<WebElement> Gender;
  @FindBy(id = "mobile")
  public WebElement Mobile;
  @FindBy(id = "dob")
  public WebElement DOB;
  @FindBy(id = "subjects")
  public WebElement Subjects;
  @FindBy(xpath = "//textarea")
  public WebElement CurrentAddress;
  @FindBy(id = "state")
  public WebElement State;
//  just for demo
  @FindBy(how = How.ID,id = "city")
  public WebElement City;

  @FindBy(xpath = "//input[@value='Login']")
  public WebElement LoginBtn;
  @FindBy(xpath = "//*[@type='file']")
  public WebElement Picture;

  @FindBy(xpath = "//input[@type='checkbox']//parent::div")
  public List<WebElement> Hobbies;

  public void uploadPicture (String path) {
    String pathToImg=System.getProperty ("user.dir")+path;
    Picture.sendKeys (pathToImg);
  }

  public void selectHobby (WebDriver driver, String hobby) {
    for (WebElement e : Hobbies) {
      if (hobby.equals (e.getText ())) {
        String radioPath = "//label[text()='" + hobby + "']//preceding-sibling::input";
        driver.findElement (By.xpath (radioPath)).click ();
        break;
      }
    }
  }

  public void selectStateAndCity (String state, String city) {
    Select s = new Select (State);
    s.selectByValue (state);
    s = new Select (City);
    s.selectByValue (city);
  }

  public void selectGender (WebDriver driver, String gender) {
    for (WebElement e : Gender) {
      if (e.getText ().equals (gender)) {
        String radioPath = "//label[text()='" + gender + "']//preceding-sibling::input";
        driver.findElement (By.xpath (radioPath)).click ();
        break;
      }
    }
  }

  public void enterFirstName (String firstName) {
    FirstName.sendKeys (firstName);
  }

  public void enterEmailId (String email) {
    EmailId.sendKeys (email);
  }

  public void enterMobile (String mobile) {
    Mobile.sendKeys (mobile);
  }

  public void enterDOB (String dob) {
    DOB.sendKeys (dob);
  }

  public void enterCurrentAddress (String currentAddress) {
    CurrentAddress.sendKeys (currentAddress);
  }

  public void clickOnLoginBtn () {
    LoginBtn.click ();
  }

  public void enterSubjects (String subjects) {
    Subjects.sendKeys (subjects);
  }
}
