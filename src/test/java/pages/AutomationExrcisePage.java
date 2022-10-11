package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Configreader;
import utilities.Driver;

import java.util.List;

public class AutomationExrcisePage {
    public AutomationExrcisePage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = "//*[@class='fa fa-home']")
    public WebElement homeicon;
    @FindBy(xpath = "(//*[@placeholder='Email Address'])[1]")
    public WebElement loginLoginmail;
    @FindBy(xpath = "(//*[@placeholder='Password'])[1]")
    public WebElement password;
    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement submit1;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLogin;
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement NewUserSignup;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement Name;
    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement EmailAddress;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement submit;
    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement id_gender1;
    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement Information;
    @FindBy(css = "#newsletter")
    public WebElement clickbox1;
    @FindBy(css = "#optin")
    public WebElement clickbox2;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement createanaaccount;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement AccountCreated;
    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement Continue;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement Loggedinas;
    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement incorrect;
    @FindBy(xpath = "//*[text()='Delete Account']")
    public WebElement isdeletedaccount;
    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement Login_to_your_account;
    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement Email_Address_already_exist;
    @FindBy(xpath = "//*[@class='material-icons card_travel']")
    public WebElement products;
    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement searchClick;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement serahedProducts;
    @FindBy(xpath = "(//p[text()='Frozen Tops For Kids'])[1]")
    public WebElement productvisible;
    @FindBy (xpath = "//*[@style='color: brown;']")
    public List<WebElement> AllProducts;
    @FindBy (xpath = "//*[@href='/delete_account']")
    public WebElement deleteAccount;
    @FindBy (xpath = "//*[text()=' Logout']")
    public WebElement Logout;
    @FindBy (xpath = "//*[contains(text(),'Contact us')]")
    public WebElement contactUs;
    @FindBy (xpath = "//*[contains(text(),'Get In Touch')]")
    public WebElement getInTouch;
    @FindBy (css = "[name='name']")
    public WebElement formNameContactUs;
    @FindBy (css = "[name='submit']")
    public WebElement submitContactUs;
    @FindBy (css = "[class='status alert alert-success']")
    public WebElement statusAlertAlertSuccess;
    @FindBy (css = "[class='btn btn-success']")
    public WebElement btnSuccess;
    public  void methodLogin(){
        Driver.getDriver().get(Configreader.getProperty("AutomationExUrl"));
        signUpLogin.click();
        loginLoginmail.sendKeys(Configreader.getProperty("AutomationExemail"));
        password.sendKeys(Configreader.getProperty("AutomationExpassword"));
        submit1.click();
    }
}


