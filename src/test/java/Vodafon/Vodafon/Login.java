package Vodafon.Vodafon;

import org.testng.annotations.Test;

public class Login extends TestBase {

	HomePage homepage;
	CreateAccount createAccount;
	CustomerInformationToLogin customerLogin;


	@Test
	public void userLogin() {
		homepage = new HomePage(driver);
		homepage.openCreateAnAccountPage();

		createAccount = new CreateAccount(driver);
		createAccount.CreateAnAccount("a.Wageeh2312@gmail.com");

		customerLogin = new CustomerInformationToLogin(driver);
		customerLogin.CustomerRegister("Ahmed", "wageeh", "12345", "Doki", "Cairo", "11511", "01091969859", "Doki");

		homepage.sign_out();
	}

}
