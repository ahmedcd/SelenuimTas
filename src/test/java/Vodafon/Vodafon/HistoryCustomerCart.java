package Vodafon.Vodafon;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HistoryCustomerCart extends TestBase {

	HomePage homepage;
	CreateAccount createAccount;
	HistoryCartPage history;

	@Test(priority = 1)
	public void ShowHistoryItemCart() {
		homepage = new HomePage(driver);
		homepage.openCreateAnAccountPage();
		createAccount = new CreateAccount(driver);
		createAccount.Sign_in("a.wageeh2312@gmail.com", "12345");
		history = new HistoryCartPage(driver);
		history.showHistoryCart();

		assertEquals("Your shopping cart is empty.", history.massage.getText().contains("Your shopping"));
	}

	@Test(priority = 2, enabled = true)
	public void BackToHome() {
		homepage = new HomePage(driver);
		homepage.sign_out();
	}

}
