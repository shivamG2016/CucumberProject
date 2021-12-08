package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver localDriver;

    // here we have to create a constructor
    @FindBy(xpath = "//a[contains(@href, 'https://www.amazon.in/ap/signin?openid.pape.max') and @class='nav-a nav-a-2   nav-progressive-attribute']")
    WebElement mousehoverToSignIN;

    // Here we have to define the actions methods of it
    @FindBy(xpath = "//input[@type='email']")
    WebElement emailFiled;
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueBtn;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement signInBtn;

    public LoginPage(WebDriver remoteDriver) {


        localDriver = remoteDriver;

        PageFactory.initElements(remoteDriver, this);

    }
    // Here we have to create Action methods

    public void MouseHoverandClick() {
        mousehoverToSignIN.click();

    }

// Click on Sign in Button

    public void enterEmailIDforSignIn(String emailID) {

        emailFiled.sendKeys(emailID);

    }


    public void ClickOnContinueBtn(String emailID) {

        continueBtn.click();

    }

    public void enterPasswordforSignIn(String Password) {

        passwordField.sendKeys(Password);

    }

    public void clickOnSignInBtn(String Password) {

        signInBtn.click();

    }
}
