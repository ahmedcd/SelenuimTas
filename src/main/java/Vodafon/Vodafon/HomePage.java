package Vodafon.Vodafon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Sign in")
	WebElement SignIn;

	@FindBy(linkText = "Sign out")
	WebElement SignOut;

	// To Sign In
	public void openCreateAnAccountPage() {
		SignIn.click();
	}

	// To Sign Up
	public void sign_out() {
		SignOut.click();
	}

}
