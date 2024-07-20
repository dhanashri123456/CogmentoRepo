package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
//	 User enter username and password
//	 Then User click on Login Button

	@FindBy(name = "email")
	private WebElement uname;
	@FindBy(name = "password")
	private WebElement pass;
	@FindBy(xpath = "//div[text()='Login']")
	private WebElement login;

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void enterUsernameAndPass(String Uname,String Pass) {
		uname.sendKeys(Uname);
		pass.sendKeys(Pass);
	}

	public void clickLoginButton() {
		login.click();
	}

}
