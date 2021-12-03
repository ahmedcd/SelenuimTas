package Vodafon.Vodafon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HistoryCartPage extends PageBase {

	public HistoryCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement cart;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p")
	WebElement massage;

	public void showHistoryCart() {
		cart.click();
	}

}
