package Vodafon.Vodafon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends PageBase {

	public CreateAccount(WebDriver driver) {
		super(driver);
	}

//create Account
	@FindBy(id = "email_create")
	WebElement Email;

	@FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
	WebElement CreateAccountBtn;

	// Already register
	@FindBy(id = "email")
	WebElement userName;

	@FindBy(id = "passwd")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	WebElement SubmitLogin;

	// If The Customer not Have Account Yet
	public void CreateAnAccount(String email) {
		Email.clear();
		Email.sendKeys(email);
		CreateAccountBtn.click();
	}

	// The Customer Already Have Account
	public void Sign_in(String username, String pass) {
		userName.sendKeys(username);
		password.sendKeys(pass);
		SubmitLogin.click();
	}
}
