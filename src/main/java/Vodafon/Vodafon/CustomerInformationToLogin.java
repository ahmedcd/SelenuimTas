package Vodafon.Vodafon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CustomerInformationToLogin extends PageBase {

	public CustomerInformationToLogin(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "customer_firstname")
	WebElement firstName;

	@FindBy(id = "customer_lastname")
	WebElement lastName;

	@FindBy(id = "passwd")
	WebElement password;

	@FindBy(id = "address1")
	WebElement Address;

	@FindBy(id = "city")
	WebElement City;

	@FindBy(id = "id_state")
	WebElement state;

	@FindBy(id = "postcode")
	WebElement Postcode;

	@FindBy(id = "id_country")
	WebElement Country;

	@FindBy(id = "phone_mobile")
	WebElement Phone;

	@FindBy(id = "alias")
	WebElement AliasAddress;

	@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
	WebElement Rigester;

	// Method Help Customer To Register
	public void CustomerRegister(String first_name, String last_name, String pass, String address, String city,
			String postCode, String phone, String aliseAddress) {

		firstName.sendKeys(first_name);
		lastName.sendKeys(last_name);
		password.sendKeys(pass);
		Address.sendKeys(address);
		City.sendKeys(city);

		Select selectCountry;
		selectCountry = new Select(Country);
		selectCountry.selectByVisibleText("United States");

		Select selectState;
		selectState = new Select(state);
		selectState.selectByVisibleText("California");

		Postcode.sendKeys(postCode);
		Phone.sendKeys(phone);
		AliasAddress.clear();
		AliasAddress.sendKeys(aliseAddress);

		Rigester.click();

	}
}
