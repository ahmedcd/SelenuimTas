package Vodafon.Vodafon;

import org.testng.annotations.Test;

public class BuyFromCatogry extends TestBase {

	HomePage homepage;
	CreateAccount createAccount;
	CustomerInformationToLogin customerLogin;
	CatogryPage catogry;
	HistoryCartPage history;

	@Test(priority = 1)
	public void userLogin() {
		homepage = new HomePage(driver);
		homepage.openCreateAnAccountPage();

		createAccount = new CreateAccount(driver);
		createAccount.CreateAnAccount("a.Wageeh2312@gmail.com");

		customerLogin = new CustomerInformationToLogin(driver);
		customerLogin.CustomerRegister("Ahmed", "wageeh", "12345", "Doki", "Cairo", "11511", "01091969859", "Doki");

		homepage.sign_out();
	}

	@Test(priority = 2)
	public void addItemToCard() {
		homepage = new HomePage(driver);
		homepage.openCreateAnAccountPage();
		createAccount = new CreateAccount(driver);
		createAccount.Sign_in("a.Wageeh@gmail.com", "12345");
		catogry = new CatogryPage(driver);
		catogry.chooseItemFromCatogery();
		// driver.navigate().back();
	}

}
