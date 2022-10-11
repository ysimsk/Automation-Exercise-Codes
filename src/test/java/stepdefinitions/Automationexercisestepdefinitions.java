package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExrcisePage;
import utilities.Driver;

public class Automationexercisestepdefinitions {
    AutomationExrcisePage automationExrcisePage=new AutomationExrcisePage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Navigate to url http_automationexercise_com")
    public void navigateToUrlHttp_automationexercise_com() {
        Driver.getDriver().get("https://automationexercise.com/");

    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://automationexercise.com/");
    }

    @Then("Click on Signup  Login button")
    public void clickOnSignupLoginButton() {
        automationExrcisePage.signUpLogin.click();

    }

    @Then("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {
        automationExrcisePage.NewUserSignup.isDisplayed();
    }

    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() {
       automationExrcisePage.Name.sendKeys("yusuf");
        automationExrcisePage.EmailAddress.sendKeys("ysfff@gmail.com");

    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        automationExrcisePage.submit.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(automationExrcisePage.Information.isDisplayed());

    }

    @Then("Fill details Title Name Email Password Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        actions.click(automationExrcisePage.id_gender1)
                .sendKeys(Keys.TAB)
                .sendKeys("ysf")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("19")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1900").perform();
    }

    @Then("Select checkbox Sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {
        actions.moveToElement(automationExrcisePage.clickbox1).click().perform();

    }

    @Then("Select checkbox 'Receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        actions.moveToElement(automationExrcisePage.clickbox2).click().sendKeys(Keys.TAB).perform();
    }

    @Then("Fill details First name Last name Company Address Address Country State City Zipcode Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber() {
        actions.sendKeys("ysf")
                .sendKeys(Keys.TAB)
                .sendKeys("geert")
                .sendKeys(Keys.TAB)
                .sendKeys("malamine")
                .sendKeys(Keys.TAB)
                .sendKeys("weg, allamut,14567ab")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Alabama")
                .sendKeys(Keys.TAB)
                .sendKeys("amsterdam")
                .sendKeys(Keys.TAB)
                .sendKeys("25434")
                .sendKeys(Keys.TAB)
                .sendKeys("23546678235").sendKeys(Keys.TAB).perform();
    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {
     //   actions.sendKeys(Keys.ENTER).perform();
     automationExrcisePage.createanaaccount.click();
    }

    @Then("Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        automationExrcisePage.AccountCreated.isDisplayed();

    }

    @Then("Click Continue button")
    public void clickContinueButton() {
        automationExrcisePage.Continue.click();

    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        automationExrcisePage.Loggedinas.isDisplayed();

    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
    automationExrcisePage.deleteAccount.click();

    }

    @Then("Verify that ACCOUNT DELETED is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        String expected = "ACCOUNT DELETED";
        String actual = automationExrcisePage.isdeletedaccount.getText();
        Assert.assertNotEquals(expected,actual,"that`is a BUG");
      //  Driver.quitDriver();
    }



    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        automationExrcisePage.youraccountvisibletext.isDisplayed();
    }

    @Then("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        automationExrcisePage.useremail.sendKeys("ysf2@gmail.com",Keys.ENTER);
        automationExrcisePage.userpassword.sendKeys("12345",Keys.ENTER);
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton(int num) {
       automationExrcisePage.deleteaccount1.click();
    }

    @And("Verify that ACCOUNT DELETED!' is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        String expected = "ACCOUNT DELETED";
        String actual = automationExrcisePage.isdeletedaccount.getText();
        Assert.assertNotEquals(expected,actual,"that`is a BUG");
    }
}
