package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class stepDef {

    WebDriver Driver;
    LoginPage lp;

    @Given("^user open Amazon Home page$")
    public void user_open_amazon_home_page()  {

        System.out.println( " I am in first step");

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        Driver =new ChromeDriver();
        Driver.get("https://www.amazon.in/");

    }

    @When("^user mouseHover and click on sign in button$")
    public void user_mousehover_and_click_on_sign_in_button()  {

        System.out.println(".......... I am in second step...........");
        lp=new LoginPage(Driver);
        lp.MouseHoverandClick();

    }

    @And("^user input email \"([^\"]*)\"$")
    public void user_input_email_something(String strArg1)  {

    }

    @And("^user click on continue$")
    public void user_click_on_continue()  {

    }

    @And("^user enter passwords \"([^\"]*)\"$")
    public void user_enter_passwords_something(String strArg1) {

    }

    @And("^user click on Sign in$")
    public void user_click_on_sign_in()  {

    }
}
