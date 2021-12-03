package Vodafon.Vodafon;

import org.testng.annotations.Test;

public class SignUp extends TestBase {

	HomePage homepage;
	CreateAccount createAccountPage;

	@Test
	public void UserCreateAccount() {
		homepage = new HomePage(driver);
		homepage.openCreateAnAccountPage();

		createAccountPage = new CreateAccount(driver);
		createAccountPage.CreateAnAccount("a.Wageeh2312@gmail.com");
	}

}
