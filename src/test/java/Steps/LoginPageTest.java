package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass{
	public static LoginPage loginpage;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		loginpage=new LoginPage();
		String uname=prop.getProperty("USERNAME");
		String pass=prop.getProperty("PASSWORD");
		loginpage.enterUsernameAndPass(uname, pass);
		
	}

	@Then("User click on Login Button")
	public void user_click_on_login_button() {
		loginpage.clickLoginButton();
	}

}
